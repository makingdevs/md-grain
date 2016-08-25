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
    def registration = registrationService.approveRegistrationWithPaymentTx(params.id)
    flash.success = "El pago se ha aprobado correctamente"
    redirect action:"all", controller:"registration"
  }

  def reject(){
    def pago = registrationService.rejectReceiptWithPaymentTx(params.transactionId)
    flash.error = "El pago se ha rechazado"
    redirect action:"all", controller:"registration"
  }
}