package com.makingdevs

import grails.converters.JSON
import com.payable.*

class PaymentReceiptController {

  def comprobanteService
  def registrationService

  def index() {
    def paymentId = params.id.replace('[','')?.replace(']','')?.split(',')
    [pago:Pago.get(paymentId)]
  }

  def uploadReceipt() {
    Pago payment = comprobanteService.agregarComprobanteAPago(params.long('id'), params.file)
    Registration registration = registrationService.changeRegistrationStatusWithPaymentId(payment.id)
    render payment as JSON
  }

}
