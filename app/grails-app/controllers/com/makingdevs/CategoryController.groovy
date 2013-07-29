package com.makingdevs

import grails.converters.JSON

class CategoryController {

  def scaffold = Category

  def apiShow(){
    render Category.list() as JSON
  }
}
