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
      if(User.countByUsername(userCommand.username)){
        userCommand.errors.rejectValue('username','user.username.unique')
        render view:"index",model:[user:userCommand]
        return     
      }
      User user = signUpService.registerUserWithUserCommand(userCommand)
      springSecurityService.reauthenticate user.username
      redirect uri: SpringSecurityUtils.securityConfig.successHandler.defaultTargetUrl
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
    username email:true, blank: false, unique: true
    password blank: false
    confirmPassword blank:false, validator: { val, obj ->
      if(obj.password != val) return 'userCommand.confirmPassword.validator'
    }
  }
}