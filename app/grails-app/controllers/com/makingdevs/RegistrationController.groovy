package com.makingdevs

class RegistrationController {

  def registrationService
  def springSecurityService

  def index() {
    [scheduledCourse:ScheduledCourse.findById(params.id,[fetch:[courseSessions:'eager',course:'join']])]
  }

  def addMe(){
    def usuarioActual = springSecurityService.currentUser
    if (usuarioActual) {
      def registration = registrationService.addUserToScheduledCourse(usuarioActual.username, params.id.toLong())
      redirect controller:"myTraining", model:[scheduledCourseId:params.id.toLong()]
    }else{
      redirect(controller:"login")
    }

  }

  def all(){
    [registrations:Registration.list(params)]
  }
}
