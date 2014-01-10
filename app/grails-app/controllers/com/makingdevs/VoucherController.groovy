package com.makingdevs

import com.payable.*

class VoucherController {

  def pagoService

  def index() { }

  def show() {
    def payment = pagoService.obtenerPagoParaValidarComprobante(params.long('id'))
    [pago: payment]
  }

  def approve(){
    def pago = pagoService.obtenerPagoParaValidarComprobante(params.id)
    pago.fechaDePago = new Date()
    pago.estatusDePago = EstatusDePago.PAGADO
    redirect action:"show", id:params.id
  }
}
