package com.makingdevs

import com.payable.Pago
import com.payable.EstatusDePago
import com.payable.DescuentoAplicable

class RegistrationService {

  def pagoService
  def descuentoAplicableService
  def comprobanteService
  def notificationService

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
      notificationService.incribeStudentToCourse(username,scheduledCourseId)  
    }
    registration
  }

  Registration changeRegistrationStatusWithPaymentId(Long paymentId){
    Registration registration = Registration.withCriteria(uniqueResult: true){
      pagos {
        eq("id",paymentId)
      }
    }
    registration.registrationStatus = RegistrationStatus.INSCRIBED_AND_WITH_DEBTH_IN_GROUP
    registration
  }

  Registration approveRegistrationWithPaymentTx(String transactionId){
    def pago = comprobanteService.aprobarPago(transactionId,new Date(),"TRANSFERENCIA_BANCARIA")
    Registration registration = Registration.withCriteria(uniqueResult: true){
      pagos {
        eq("transactionId",transactionId)
      }
    }
    registration.registrationStatus = RegistrationStatus.INSCRIBED_AND_PAYED
    registration
  }

  Registration rejectReceiptWithPaymentTx(String transactionId){
    def pago = comprobanteService.rechazarPago(transactionId)
    Registration registration = Registration.withCriteria(uniqueResult: true){
      pagos {
        eq("transactionId",transactionId)
      }
    }
    registration.registrationStatus = RegistrationStatus.INSCRIBED_AND_WITH_DEBTH
    registration
  }

  def cancelWithLimitRegistrationDate(){
    Registration.withCriteria {
      scheduledCourse {
        le "limitRegistrationDate", new Date()
      }
      inList "registrationStatus",[RegistrationStatus.REGISTERED]
    }*.registrationStatus = RegistrationStatus.CANCELLED
  }

}