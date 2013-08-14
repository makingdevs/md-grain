package com.makingdevs

class RegistrationService {

  Registration addUserToScheduledCourse(String username, Long scheduledCourseId) {
    def user = User.findByUsername(username)
    def scheduledCourse = ScheduledCourse.get(scheduledCourseId)
    def registration = Registration.findByUserAndScheduledCourse(user,scheduledCourse)
    if(!registration){
      registration = new Registration(user:user)
      scheduledCourse.addToRegistrations(registration).save()
      registration.save()  
    }
    registration
  }
}
