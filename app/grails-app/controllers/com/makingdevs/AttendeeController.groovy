package com.makingdevs

import grails.converters.JSON

class AttendeeController {

  def springSecurityService

  def mySessions(){}

  def sessionByMonth(){

    def user = springSecurityService.currentUser
    def registrations = Registration.findAllByUser(user)
    def courseSessionCriteria = CourseSession.createCriteria()
    def courseSessions = courseSessionCriteria.list {
      'in'('scheduledCourse',registrations*.scheduledCourse)
    }
    
    withFormat {
      json { JSON.use('courseCalendar') { respond courseSessions} }
    }
  }
}
