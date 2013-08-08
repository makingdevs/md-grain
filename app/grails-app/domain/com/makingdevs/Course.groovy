package com.makingdevs

class Course {

  String name
  String overview
  String audience
  String prerequisites
  String goal
  String courseKey
  CourseStatus courseStatus = CourseStatus.NEW

  Date dateCreated
  Date lastUpdated

  static constraints = {
    name blank:false,nullable:false,size:1..100
    overview nullable:false,blank:false,size:1..1000
    audience nullable:false,blank:false,size:1..1000
    prerequisites nullable:false,blank:false,size:1..1000
    goal nullable:false,blank:false,size:1..1000
    courseKey nullable:false,blank:false,unique:true,size:1..20
    courseStatus nullable:false
  }

  String toString(){
    courseKey
  }
}
