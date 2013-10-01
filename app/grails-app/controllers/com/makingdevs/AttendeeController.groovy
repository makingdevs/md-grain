package com.makingdevs

class AttendeeController {

  def springSecurityService

  def mySessions(){
    def user = springSecurityService.currentUser
    def registrations = Registration.findAllByUser(user)
    def courseSessionCriteria = CourseSession.createCriteria()
    def courseSessions = courseSessionCriteria.list {
      'in'('scheduledCourse',registrations*.scheduledCourse)
    }
    log.debug courseSessions
    [courseSessions:courseSessions]
  }

}
