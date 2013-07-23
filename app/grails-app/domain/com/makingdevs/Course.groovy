package com.makingdevs

import groovy.transform.ToString

@ToString
class Course {

  String name
  String overview
  String audience
  String prerequisites
  String goal
  String courseKey

  Date dateCreated
  Date lastUpdated

  static constraints = {
    name blank:false,nullable:false,size:1..100
    overview nullable:false,blank:false,size:1..1000
    audience nullable:false,blank:false,size:1..1000
    prerequisites nullable:false,blank:false,size:1..1000
    goal nullable:false,blank:false,size:1..1000
    courseKey nullable:false,blank:false,unique:true,size:1..20
  }
}
