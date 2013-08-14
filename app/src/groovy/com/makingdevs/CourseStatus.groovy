package com.makingdevs

enum CourseStatus {
	NEW("course.status.new"),
  DRAFT("course.status.draft"), 
  LIVE("course.status.live")

  private final String code

  CourseStatus(String code){
    this.code = code
  }

  public String getCode(){ return this.code }
}