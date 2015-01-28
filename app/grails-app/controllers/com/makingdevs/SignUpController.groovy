package com.makingdevs

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
      redirect controller:'perfil'
    }
  }
}
