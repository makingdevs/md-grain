package com.makingdevs

import groovy.transform.ToString

@ToString
class Category {

  String name

  static hasMany = [ courses:Course ]

  static constraints = {
  }
}
