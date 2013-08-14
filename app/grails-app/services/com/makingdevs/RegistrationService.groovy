package com.makingdevs

class RegistrationService {

  Registration addUserToScheduledCourse(String username, Long scheduledCourseId) {
    def user = User.findByUsername(username)
    def scheduledCourse = ScheduledCourse.get(scheduledCourseId)
    def registration = new Registration(user:user)
    scheduledCourse.addToRegistrations(registration).save()
    registration.save()
    registration
  }
}
