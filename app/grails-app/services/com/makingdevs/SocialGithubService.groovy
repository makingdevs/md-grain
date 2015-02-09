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
  def signUpService

  def requestAccessGithub(session) {
    GitHubConnectionFactory connectionFactory = new GitHubConnectionFactory(
        grailsApplication.config.social.github.clientId,
        grailsApplication.config.social.github.clientSecret)
    OAuth2Operations oauthOperations = connectionFactory.getOAuthOperations()
    def parameters = new OAuth2Parameters()
    parameters.setRedirectUri(grailsApplication.config.social.github.callback)
    parameters.setScope("user") 
    String authorizeUrl = oauthOperations.buildAuthorizeUrl(GrantType.AUTHORIZATION_CODE,parameters)
    authorizeUrl
  }
  def authenticateGithubUser(code){
    GitHubConnectionFactory connectionFactory = new GitHubConnectionFactory(
        grailsApplication.config.social.github.clientId,
        grailsApplication.config.social.github.clientSecret)
    OAuth2Operations oauthOperations = connectionFactory.getOAuthOperations()
    def additionalParameters = new LinkedMultiValueMap<String, String>()
    additionalParameters.add("scope","user:email")
    AccessGrant accessGrant = oauthOperations.exchangeForAccess(code,grailsApplication.config.social.github.callback,additionalParameters)
    GitHub github = new GitHubTemplate(accessGrant.getAccessToken())
    UserTemplate userTemplate = github.userOperations()
    GitHubUserProfile profile = userTemplate.getUserProfile() 
    def githubProfile = [
      name:profile.getName(),
      username:profile.getUsername(),
      email:profile.getEmail(),
      code:code,
      githubId:profile.getId(),
      accessToken:accessGrant.getAccessToken()
      ]
    log.debug "trae email ???????? ----> ${profile.getEmail()}"
    if(profile.getEmail()){
      createGithubUser(githubProfile)
    }
    updateGithubUser(githubProfile)
    githubProfile
  }

  def createGithubUser(githubProfile){

    def userCommand = new UserCommand()
    userCommand.nombre = githubProfile.name?:'github name'
    userCommand.apellidoPaterno = githubProfile.username?:'github lastname'
    userCommand.apellidoMaterno = ""
    userCommand.username = githubProfile.email
    userCommand.password = githubProfile.code
    userCommand.nickname = "${System.currentTimeMillis()}"

    def userDB = User.findByUsername(githubProfile.email)
    def githubUserDB = GithubUser.findByGithubId(githubProfile.githubId)
    def githubUser = githubUserDB?:new GithubUser()

    githubUser.user = userDB?:signUpService.registerUserWithUserCommand(userCommand)
    githubUser.username = githubProfile.username
    githubUser.githubId = githubProfile.githubId
    githubUser.code = githubProfile.code
    githubUser.accessToken = githubProfile.accessToken
    githubUser.save(failOnError: true)
    githubProfile
  }  
  def updateGithubUser(githubProfile){
    def githubUser = GithubUser.findByGithubId(githubProfile.githubId)
    if(githubUser){
      githubUser.code = githubProfile.code
      githubUser.accessToken = githubProfile.accessToken
      githubUser.save()
    }
    githubUser
  }  
}
