package com.makingdevs

import com.payable.*

class PaymentController {

  def springSecurityService
  def pagoService
  def compronbanteService

  def myPayments() {
    def user = springSecurityService.currentUser
    def payments = pagoService.estadoDeCuentaUsuario(user)

    [payments:payments]
  }

  def paypalCancel(){
    def transactions = params.transactions.tokenize(',')
    def criteria = Registration.createCriteria()
    def registrations = criteria.list {
      pagos {
        'in'('transactionId',transactions)
      }
    }
    [registrations:registrations]
  }

  def paypalPayed(){
    def transactions = params.transactions.tokenize(',')
    def criteria = Registration.createCriteria()
    def registrations = criteria.list {
      pagos {
        'in'('transactionId',transactions)
      }
    }
    registrations*.pagos.flatten().each { p ->
      comprobanteService.rechazarPago(p.transactionId,newDate(),"PAYPAL")
    }
    registrations*.registrationStatus = RegistrationStatus.INSCRIBED_AND_PAYED
    [registrations:registrations]
  }

}