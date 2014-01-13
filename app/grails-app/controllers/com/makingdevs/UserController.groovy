package com.makingdevs

class UserController {

  def show() {
    def user = User.findById(params.long('id'),[fetch:['eager':'registrations']])
    [user:user]
  }

  def registration(){
    def registration = Registration.get(params.id)
    log.debug registration
    [registration:registration]
  }
}
