package com.makingdevs

class UserController {

  def show() {
    def user = User.findById(params.long('id'),[fetch:['eager':'registrations']])
    [user:user]
  }
}
