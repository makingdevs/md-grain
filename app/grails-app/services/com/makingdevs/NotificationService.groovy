package com.makingdevs

import grails.transaction.Transactional

@Transactional
class NotificationService {

  def mailService

  def incribeStudentToCourse(username, scheduledCourseId) {
    def user = User.findByUsername(username)
    def scheduledCourse = ScheduledCourse.get(scheduledCourseId)

    mailService.sendMail {
      to user.username
      from "info@makingdevs.com"
      subject "Registro en ${scheduledCourse?.course?.name}"
      body( view:"/notification/inscriptionCourse", model:[scheduledCourse:scheduledCourse,nombre:user.perfil?.nombre])
    }

  }

}
