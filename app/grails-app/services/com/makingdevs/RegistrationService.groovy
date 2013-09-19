package com.makingdevs
import com.payable.Pago

class RegistrationService {

  def pagoService

  Registration addUserToScheduledCourse(String username, Long scheduledCourseId) {
    def user = User.findByUsername(username)
    def scheduledCourse = ScheduledCourse.get(scheduledCourseId)
    def registration = Registration.findByUserAndScheduledCourse(user,scheduledCourse)

    if(!registration){
      registration = new Registration(user:user)
      scheduledCourse.addToRegistrations(registration).save()
      Pago pago = pagoService.crearPago( scheduledCourse.beginDate, scheduledCourse.esquemaDePago.id )
      registration.addToPagos(pago)
      registration.save()  
    }

    registration
  }

}
