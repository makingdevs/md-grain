package com.makingdevs

class MyTrainingController {

  def springSecurityService

  def index() {
    def usuarioActual = springSecurityService.currentUser
    def registrations = Registration.findAllByUser(usuarioActual,[fetch:[scheduledCourse:'join']])
    [registrations:registrations]
  }
}
