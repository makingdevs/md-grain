package com.makingdevs

class UserController {

  def show() {
    def user = User.get(params.id)
    log.debug user
    [:]
  }
}
