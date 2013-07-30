package com.makingdevs

class SignUpService {

  def registerUserWithUserCommand(UserCommand userCommand) {
    User user = new User(userCommand.properties)
    user.enabled =  true
    if(user.validate()){
      user.save()
      Role roleStudent = Role.findByAuthority("ROLE_STUDENT")
      UserRole.create(user,roleStudent)
      // Create profile
    }
    user
  }
}
