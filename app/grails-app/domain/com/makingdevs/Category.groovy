package com.makingdevs

import groovy.transform.ToString

@ToString
class Category {

  String name
  String description

  static hasMany = [ courses:Course ]

  static constraints = {
    name blank:false, size:20..100
    description blank:false, size:1..1000
  }
}
