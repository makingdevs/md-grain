package com.makingdevs

import com.payable.EsquemaDePago

class ScheduledCourse {

  Course course
  Date beginDate
  Date limitRegistrationDate
  EsquemaDePago esquemaDePago
  ScheduledCourseStatus scheduledCourseStatus
  String geolocation = ''
  String fullAddress = ''
  Integer durationInHours

  Date dateCreated
  Date lastUpdated

  static constraints = {
    course nullable: false
    beginDate nullable: false
    limitRegistrationDate nullable: false, validator: { val, obj ->
      if (val >= obj.beginDate)
        return 'scheduledcourse.limitRegistrationDate.invalid'
    }
    geolocation nullable: true, blank: true, size: 0..200
    fullAddress nullable: true, blank: true, size: 0..1000
    durationInHours nullable: false, min:1, max:40
  }

  static hasMany = [
    registrations:Registration,
    courseSessions:CourseSession
  ]

  static mapping = {
    cache true
  }

  String toString() {
    "(${id} : ${beginDate} : ${scheduledCourseStatus})"
  }

}