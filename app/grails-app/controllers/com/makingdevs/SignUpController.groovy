package com.makingdevs

import groovy.transform.ToString;

class SignUpController {

  def springSecurityService
  def signUpService

  def index() { }
  def register(UserCommand userCommand) {
    signUpService.registerUserWithUserCommand(userCommand)
    render view:"index"
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