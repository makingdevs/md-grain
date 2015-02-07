package com.makingdevs

import grails.transaction.Transactional
import org.springframework.social.github.connect.GitHubConnectionFactory
import org.springframework.social.oauth2.OAuth2Operations
import org.springframework.social.oauth2.GrantType
import org.springframework.social.oauth2.OAuth2Parameters
import org.springframework.social.oauth2.AccessGrant
import org.springframework.social.github.api.impl.GitHubTemplate
import org.springframework.social.github.api.GitHub
import org.springframework.social.github.api.GitHubUserProfile
import org.springframework.social.github.api.impl.UserTemplate
import org.springframework.util.LinkedMultiValueMap

@Transactional
class SocialGithubService {

    def grailsApplication

    def requestAccessGithub(session) {
      GitHubConnectionFactory connectionFactory = new GitHubConnectionFactory(
          grailsApplication.config.social.github.clientId,
          grailsApplication.config.social.github.clientSecret)
      OAuth2Operations oauthOperations = connectionFactory.getOAuthOperations()
      def parameters = new OAuth2Parameters()
      parameters.setRedirectUri(grailsApplication.config.social.github.callback)
      parameters.setScope("user") 
      String authorizeUrl = oauthOperations.buildAuthorizeUrl(GrantType.AUTHORIZATION_CODE,parameters)
      log.debug"step [6] url --> ${authorizeUrl}"
      authorizeUrl
    }
    def authenticateGithubUser(code){
      log.debug"step [1]"
      GitHubConnectionFactory connectionFactory = new GitHubConnectionFactory(
          grailsApplication.config.social.github.clientId,
          grailsApplication.config.social.github.clientSecret)
      OAuth2Operations oauthOperations = connectionFactory.getOAuthOperations()
      def additionalParameters = new LinkedMultiValueMap<String, String>()
      additionalParameters.add("scope","user:email")
      AccessGrant accessGrant = oauthOperations.exchangeForAccess(code,grailsApplication.config.social.github.callback,additionalParameters)
      GitHub github = new GitHubTemplate(accessGrant.getAccessToken())
      log.debug"step [2.1] --- ${github.isAuthorized()}"
      log.debug"step [2.2] --- ${github.userOperations()}"
      UserTemplate userTemplate = github.userOperations()
      log.debug"step [3] id ---${userTemplate.getProfileId()}"
      GitHubUserProfile profile = userTemplate.getUserProfile() 
      log.debug"profile.name --->> ${profile.getName() }"
      log.debug"profile.getUsername() --->> ${profile.getUsername() }"
      log.debug"profile.location --->> ${profile.getLocation()}"
      log.debug"profile.company --->> ${profile.getCompany()}"
      log.debug"profile.email --->> ${profile.getEmail()}"
      profile
    }
}
