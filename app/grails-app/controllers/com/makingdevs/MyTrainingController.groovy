package com.makingdevs

import grails.converters.JSON

class MyTrainingController {

  def springSecurityService
  def mailService
  def notificationService

  def index() {
    def usuarioActual = springSecurityService.currentUser
    def registrations = Registration.findAllByUser(usuarioActual,[fetch:[scheduledCourse:'join']])
    notificationService.sendCourseInformation()
    [registrations:registrations]
  }

  def sendPaymentInstructions(){
    def registration = notificationService.findRegistrationAndSendPaymentsInstructions(params.long('registrationId')) 
    render registration as JSON
  }
}
