package com.makingdevs

import grails.transaction.Transactional
import org.springframework.social.twitter.connect.TwitterConnectionFactory
import org.springframework.social.oauth1.OAuth1Operations
import org.springframework.social.oauth1.OAuthToken
import org.springframework.social.oauth1.OAuth1Parameters
import org.springframework.social.oauth1.AuthorizedRequestToken
import org.springframework.social.twitter.api.Twitter
import org.springframework.social.twitter.api.impl.TwitterTemplate
import org.springframework.social.twitter.api.TwitterProfile

@Transactional
class SocialTwitterService {

  def grailsApplication
  def signUpService

  def requestAccessTwitter(session){
    TwitterConnectionFactory connectionFactory = new TwitterConnectionFactory(
          grailsApplication.config.social.twitter.consumerKey,
          grailsApplication.config.social.twitter.consumerSecret)
    OAuth1Operations oauthOperations = connectionFactory.getOAuthOperations()
    OAuthToken requestToken = oauthOperations.fetchRequestToken(grailsApplication.config.social.twitter.callback,null)
    String authorizeUrl = oauthOperations.buildAuthorizeUrl( requestToken.getValue(), OAuth1Parameters.NONE )
    session.requestToken = requestToken
    authorizeUrl
  }

  def authenticateTwitterUser(token, oauthVerifier){
    TwitterConnectionFactory connectionFactory = new TwitterConnectionFactory(
          grailsApplication.config.social.twitter.consumerKey,
          grailsApplication.config.social.twitter.consumerSecret)
    OAuth1Operations oauthOperations = connectionFactory.getOAuthOperations()

    OAuthToken accessToken = oauthOperations.exchangeForAccessToken(
      new AuthorizedRequestToken(token, oauthVerifier), null)

    String aToken = accessToken.getValue()
    String accessTokenSecret = accessToken.getSecret()
    Twitter twitter = new TwitterTemplate( 
      grailsApplication.config.social.twitter.consumerKey, 
      grailsApplication.config.social.twitter.consumerSecret,
      aToken,
      accessTokenSecret)
    TwitterProfile profile = twitter.userOperations().getUserProfile()
    [
    token:aToken,
    accessToken:accessToken,
    firstName:profile.name,
    lastName:profile.screenName,
    id:profile.id,

    ]
  }

  def createTwitterUser(email, token, oauthVerifier){
    def profile = authenticateTwitterUser(token, oauthVerifier)
    def twitterUser = TwitterUser.findByTwitterId(profile.id)
    if(twitterUser){
      twitterUser.token = profile.token
      twitterUser.tokenSecret = profile.accessToken
    }else{
      def userCommand = new UserCommand()
      userCommand.nombre = profile.firstName
      userCommand.apellidoPaterno = profile.lastName
      userCommand.apellidoMaterno = ""
      userCommand.username = email
      userCommand.password = profile.accessToken
      userCommand.nickname = "${System.currentTimeMillis()}"
      twitterUser = new TwitterUser()
      twitterUser.username = profile.screenName
      twitterUser.twitterId = profile.id
      twitterUser.token = profile.token
      twitterUser.tokenSecret = profile.accessToken
      twitterUser.user = signUpService.registerUserWithUserCommand(userCommand)
    }
    twitterUser.save()
    log.debug "twitterUser.username ---> ${twitterUser.username}"
    twitterUser
  }
}
