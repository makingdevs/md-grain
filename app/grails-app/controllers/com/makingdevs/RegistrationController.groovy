package com.makingdevs

class RegistrationController {

  def registrationService
  def springSecurityService

  def index() {
    [scheduledCourse:ScheduledCourse.get(params.id)]
  }

  def addMe(){
    registrationService.addUserToScheduledCourse(springSecurityService.currentUser, params.id.toLong())
  }
}