package com.makingdevs

import groovy.transform.ToString

@ToString
class Category {

  String name
  String description
  String code

  Date dateCreated                                                                                                                                                                                      │
  Date lastUpdated                                                                                                                                                                                      │

  static hasMany = [ courses:Course ]

  static constraints = {
    name blank:false, size:20..100
    description blank:false, size:1..1000
    code blank:true, size:0..25
  }
}
