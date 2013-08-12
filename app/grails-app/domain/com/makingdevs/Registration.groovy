package com.makingdevs

class Registration {
  Date dateCreated
  Date lastUpdated
  User user
  RegistrationStatus registrationStatus
  Boolean invoice = false

  static belongsTo = [scheduledCourse:ScheduledCourse]

  static constraints = {
    lastUpdated display: false, nullable: true
    dateCreated display: false, nullable: true
    user nullable: false
    scheduledCourse nullable: false
    invoice nullable: true
  }
}
