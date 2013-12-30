package com.makingdevs

import com.payable.*

class VoucherController {

  def pagoService

    def index() { }

    def show() {
      def payment = pagoService.obtenerPagoParaValidarComprobante(params.long('id'))
      [pago: payment]
    }
}
