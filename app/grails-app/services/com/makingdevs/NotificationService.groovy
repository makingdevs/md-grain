package com.makingdevs

import grails.transaction.Transactional

@Transactional
class NotificationService {

  def mailService
  def springSecurityService  
 
  def sendCourseInformation(){
    def currentUser = springSecurityService.currentUser

    mailService.sendMail {
      to currentUser.username
      from "info@makingdevs.com"
      subject ". Información del curso ."
      body(view:"/notification/courseInformation")
    }

  }

  def findRegistrationAndSendPaymentsInstructions(registrationId){
    def currentUser = springSecurityService.currentUser
    Registration registration = Registration.findById(registrationId)
    def totalAmount = registration.pagos*.cantidadDePago.sum(0) + registration.pagos*.recargosAcumulados.sum(0) - registration.pagos*.descuentoAplicable.sum(0)
    
    mailService.sendMail {
      to currentUser.username
      from "info@makingdevs.com"
      subject "· Instrucciones de pago ·"
      body( view:"/notification/paymentInfo", model:[course:registration.scheduledCourse.course,totalAPagar:totalAmount])
    } 

    registration
  }
}