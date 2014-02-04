package com.makingdevs

class ScheduledCourseController {

  def registrationService

  def scaffold = ScheduledCourse

  def addParticipant(){
    registrationService.addUserToScheduledCourse(params.email, params.long("id"))
    redirect action:"show",params:params, id:params.long("id")
  }
}
