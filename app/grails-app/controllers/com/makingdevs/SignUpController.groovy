package com.makingdevs

import groovy.transform.ToString
import org.codehaus.groovy.grails.plugins.springsecurity.SpringSecurityUtils

class SignUpController {

  def springSecurityService
  def signUpService

  def index() {
    def config = SpringSecurityUtils.securityConfig
    if (springSecurityService.isLoggedIn()) {
      redirect uri: config.successHandler.defaultTargetUrl
      return
    }
  }
  def register(UserCommand userCommand) {
    User user = signUpService.registerUserWithUserCommand(userCommand)
    if(user.hasErrors()){
      render view:"index",model:[user:user]
    }
    else
      redirect controller:"home"
  }
}

@ToString(includeNames=true)
class UserCommand {
  String name
  String lastName
  String username
  String password
  String confirmPassword

  static constraints = {
  }
}