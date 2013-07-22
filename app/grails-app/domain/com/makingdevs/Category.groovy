package com.makingdevs

class Category {

  String name

  static hasMany = { courses:Course }

  static constraints = {
  }
}
