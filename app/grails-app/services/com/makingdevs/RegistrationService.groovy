package com.makingdevs

import com.payable.Pago
import com.payable.DescuentoAplicable

class RegistrationService {

  def pagoService
  def descuentoAplicableService

  Registration addUserToScheduledCourse(String username, Long scheduledCourseId) {
    def user = User.findByUsername(username)
    def scheduledCourse = ScheduledCourse.get(scheduledCourseId)
    def registration = Registration.findByUserAndScheduledCourse(user,scheduledCourse)

    if(!registration){
      registration = new Registration(user:user)
      scheduledCourse.addToRegistrations(registration).save()
      Pago pago = pagoService.crearPago( scheduledCourse.beginDate, scheduledCourse.esquemaDePago.id )
      def descuentosAplicables = descuentoAplicableService.generarParaPagoConEsquemaDePagoConFechaReferencia(scheduledCourse.esquemaDePago.id, pago.fechaDeVencimiento)
      descuentosAplicables.each { da -> descuentoAplicableService.agregarDescuentoAplicableAUnPago(da, pago.id) }
      registration.addToPagos(pago)
      registration.save()  
    }
    registration
  }

}
