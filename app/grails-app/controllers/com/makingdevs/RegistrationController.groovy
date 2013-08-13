package com.makingdevs

class RegistrationController {

  def index() {
    [scheduledCourse:ScheduledCourse.get(params.id)]
  }
}