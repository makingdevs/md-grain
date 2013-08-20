package com.makingdevs

import com.makingdevs.*

class SignUpService {

  def registerUserWithUserCommand(UserCommand userCommand) {
    User user = new User(userCommand.properties)
    Perfil perfil = new Perfil(userCommand.properties)
    log.debug perfil
    user.perfil = perfil
    user.enabled =  true
    if(user.validate()){
      user.save()
      Role roleStudent = Role.findByAuthority("ROLE_STUDENT")
      UserRole.create(user,roleStudent)
      perfil.save()
      user.save()
    }
    user
  }
}
