package com.makingdevs

class MyTrainingController {

  def springSecurityService
  def mailService

  def index() {
    def usuarioActual = springSecurityService.currentUser
    def registrations = Registration.findAllByUser(usuarioActual,[fetch:[scheduledCourse:'join']])
    [registrations:registrations]
  }

  def sendPaymentInstructions(){
    log.debug "OK"
    mailService.sendMail {
      to "juan@makingdevs.com"
      from "info@makingdevs.com"
      subject "Hello John"
      body 'this is some text'
    }
    render "ok"
  }
}
