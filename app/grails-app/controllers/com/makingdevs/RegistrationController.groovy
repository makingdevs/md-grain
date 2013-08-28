package com.makingdevs

class RegistrationController {

  def registrationService
  def springSecurityService

  def index() {
    [scheduledCourse:ScheduledCourse.findById(params.id,[fetch:[courseSessions:'eager',course:'join']])]
  }

  def addMe(){
    registrationService.addUserToScheduledCourse(springSecurityService.currentUser, params.id.toLong())
    redirect controller:"myTraining"
  }
}