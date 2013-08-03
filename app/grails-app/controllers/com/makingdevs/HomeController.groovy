package com.makingdevs

class HomeController {

  def springSecurityService

  def index() {
    def categories = Category.list([max:4])
    [categories:categories]
  }

  def contact(){}
}
