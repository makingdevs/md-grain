package com.makingdevs

import com.payable.Payable

class Registration extends Payable implements Questionable {
  Date dateCreated
  Date lastUpdated
  User user
  RegistrationStatus registrationStatus = RegistrationStatus.REGISTERED
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
