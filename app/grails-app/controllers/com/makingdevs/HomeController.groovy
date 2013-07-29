package com.makingdevs

class HomeController {

  def index() {
    def categories = Category.list([max:4])
    [categories:categories]
  }
}
