package com.makingdevs

class PaymentController {

  def springSecurityService
  def pagoService

  def myPayments() {
    def user = springSecurityService.currentUser
    def payments = pagoService.estadoDeCuentaUsuario(user)

    [payments:payments]
  }

}