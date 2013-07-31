package com.makingdevs

class HomeController {

  def springSecurityService

  def index() {
    log.debug springSecurityService.currentUser
    def categories = Category.list([max:4])
    [categories:categories]
  }
}
