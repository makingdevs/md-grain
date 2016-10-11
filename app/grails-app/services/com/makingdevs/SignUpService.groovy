package com.makingdevs

import com.makingdevs.*

class SignUpService {

  def perfilService // Profile plugin

  def registerUserWithUserCommand(UserCommand userCommand) {
    User user = new User(userCommand.properties)
    Perfil perfil = new Perfil(userCommand.properties)
    perfilService.registrar perfil
    user.perfil = perfil
    user.enabled =  true
    if(user.validate()){
      user.save()
      Role roleStudent = Role.findByAuthority("ROLE_STUDENT")
      UserRole.create(user,roleStudent)
    }
    user
  }
}
