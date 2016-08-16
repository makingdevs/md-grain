package com.makingdevs

import grails.transaction.Transactional
import com.the6hours.grails.springsecurity.facebook.FacebookAuthToken
import org.springframework.social.facebook.api.Facebook
import org.springframework.social.facebook.api.User
import org.springframework.social.facebook.api.impl.FacebookTemplate

@Transactional
class FacebookAuthService {

	def signUpService

  def createAppUser(FacebookUser facebookUser, FacebookAuthToken token) {

  	Facebook facebook = new FacebookTemplate(token.accessToken.accessToken)
    User fbProfile = facebook.userOperations().userProfile
  	def userCommand = new UserCommand()
  	userCommand.nombre = fbProfile.firstName
  	userCommand.apellidoPaterno = fbProfile.lastName
  	userCommand.apellidoMaterno = ""
  	userCommand.username = fbProfile.email
  	userCommand.password = token.accessToken?.accessToken
  	userCommand.nickname = "${System.currentTimeMillis()}"
    def userDB = User.findByUsername(fbProfile.email)
  	User user = userDB?:signUpService.registerUserWithUserCommand(userCommand)
  	user
  }

}
