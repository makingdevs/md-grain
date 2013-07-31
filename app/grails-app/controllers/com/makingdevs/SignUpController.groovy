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
    if(userCommand.hasErrors()){
      render view:"index",model:[user:userCommand]
    }
    else{
      User user = signUpService.registerUserWithUserCommand(userCommand)
      redirect controller:"home"
    }
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
    name blank:false
    lastName blank:false
    username blank: false, unique: true, email:true
    password blank: false
    confirmPassword blank:false
  }
}