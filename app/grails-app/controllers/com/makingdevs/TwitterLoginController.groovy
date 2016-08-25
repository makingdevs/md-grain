package com.makingdevs

class TwitterLoginController {

  def socialTwitterService
  def springSecurityService

  def index() { 
    def authorizeUrl =  socialTwitterService.requestAccessTwitter(session)
    redirect url: authorizeUrl
  }

  def callback(){
    def requestToken = session.requestToken
    def oauthVerifier= params.oauth_verifier

    if(!requestToken || !oauthVerifier){
      redirect(action: "index")
      return
    }

    def profile = socialTwitterService.authenticateTwitterUser(requestToken, oauthVerifier)
    def twitterUser = TwitterUser.findByTwitterId(profile.id)
    if(twitterUser?.user){
      twitterUser.token = profile.token
      twitterUser.tokenSecret = profile.accessToken
      twitterUser.save()
      springSecurityService.reauthenticate twitterUser.user.username
      redirect controller:'perfil'
      return
    }
    profile.oauth_verifier = oauthVerifier
    profile
  }

  def register(){
    
    def email = params.username
    def requestToken = session.requestToken
    def oauthVerifier= params.oauth_verifier

    if(!requestToken || !oauthVerifier || !email){
      redirect(action: "index")
      return
    }

    def twitterUser = socialTwitterService.createTwitterUser(email, requestToken, oauthVerifier)

    if(!twitterUser.user){
      redirect(action: "index")
      return
    }
    springSecurityService.reauthenticate twitterUser.user.username
    redirect controller:'perfil'
  }
}
