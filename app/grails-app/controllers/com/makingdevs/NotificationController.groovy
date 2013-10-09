package com.makingdevs

import grails.converters.JSON

class NotificationController {

  def mailService

  def index() {
    render(view:params.mailView ?: 'paymentInfo')
  }

  def quizFor(){

    def registration = Registration.withCriteria(uniqueResult: true) {
      user {
        eq 'username', params.id
      }
      scheduledCourse{
        course{
          eq 'courseKey', params.course
        }
      }
    }
    mailService.sendMail {
      to currentUser.username
      from "info@makingdevs.com"
      subject "· Instrucciones de pago ·"
      body( view:"/notification/${params.course}Quiz", model:[registration:registration])
    }
    render registration as JSON
  }
}
