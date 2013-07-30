package com.makingdevs

class SignUpService {

  def registerUserWithUserCommand(UserCommand userCommand) {
    log.debug userCommand
    User user = new User(userCommand.properties)
    user.enabled =  true
    log.debug user
  }
}
