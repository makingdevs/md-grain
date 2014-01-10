package com.makingdevs

import com.payable.*

class VoucherController {

  def pagoService
  def registrationService

  def index() { }

  def show() {
    def payment = pagoService.obtenerPagoParaValidarComprobante(params.long('id'))
    [pago: payment]
  }

  def approve(){
    def registration = registrationService.approveRegistrationWithPaymentId(params.id)
    redirect action:"show", id:params.id
  }
}
