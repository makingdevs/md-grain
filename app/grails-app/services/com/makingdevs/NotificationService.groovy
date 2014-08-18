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

  def sendPaymentsInstructions(){

  }
}
