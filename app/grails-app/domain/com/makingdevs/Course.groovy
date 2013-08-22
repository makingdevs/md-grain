package com.makingdevs

class Course {

  String name
  String overview
  String audience
  String prerequisites
  String goal
  String courseKey
  String content
  CourseStatus courseStatus = CourseStatus.NEW

  Date dateCreated
  Date lastUpdated

  static constraints = {
    name blank:false,nullable:false,size:1..100
    overview nullable:false,blank:false,size:1..2000
    audience nullable:false,blank:false,size:1..2000
    prerequisites nullable:false,blank:false,size:1..2000
    goal nullable:false,blank:false,size:1..2000
    courseKey nullable:false,blank:false,unique:true,size:1..20
    content nullable:false,blank:false,size:1..2000
    courseStatus nullable:false
  }

  String toString(){
    courseKey
  }
}
