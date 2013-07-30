package com.makingdevs

class SignUpService {

  def registerUserWithUserCommand(UserCommand userCommand) {
    User user = new User(userCommand.properties)
    Profile profile = new Profile(userCommand.properties)
    log.debug profile
    user.profile = profile
    user.enabled =  true
    if(user.validate()){
      user.save()
      Role roleStudent = Role.findByAuthority("ROLE_STUDENT")
      UserRole.create(user,roleStudent)
      profile.save()
      user.save()
    }
    user
  }
}
