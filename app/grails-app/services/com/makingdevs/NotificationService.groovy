package com.makingdevs

import grails.transaction.Transactional

@Transactional
class NotificationService {

  def mailService
  def icalendarService

  def incribeStudentToCourse(username, scheduledCourseId) {
    
    def user = User.findByUsername(username)
    def scheduledCourse = ScheduledCourse.get(scheduledCourseId)
    def icsFile = icalendarService.createEvent(username, scheduledCourseId).getBytes("UTF-8")

    mailService.sendMail {
      multipart true
      to user.username
      from "info@makingdevs.com"
      subject "Registro en ${scheduledCourse?.course?.name}"
      body( view:"/notification/inscriptionCourse", model:[scheduledCourse:scheduledCourse,nombre:user.perfil?.nombre])
      attachBytes "register.ics", "text/calendar", icsFile
    }

  }

}
