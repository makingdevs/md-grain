package com.makingdevs

import grails.converters.JSON

class MyTrainingController {

  def springSecurityService
  def mailService

  def index() {
    def usuarioActual = springSecurityService.currentUser
    def registrations = Registration.findAllByUser(usuarioActual,[fetch:[scheduledCourse:'join']])
    [registrations:registrations]
  }

  def sendPaymentInstructions(){
    def currentUser = springSecurityService.currentUser
    log.debug currentUser.username
    Registration registration = Registration.findById(params.long('registrationId'))
    mailService.sendMail {
      to currentUser.username
      from "info@makingdevs.com"
      subject "Hello John"
      body 'this is some text'
    }
    render registration as JSON
  }
}
