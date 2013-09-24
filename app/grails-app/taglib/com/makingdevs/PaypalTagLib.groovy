package com.makingdevs

class PaypalTagLib {
  static namespace = 'paypal'

  def pay = { attrs, body ->
    def registration = attrs.registration
    def businessId = 'C7U4YESJJEDQ4'
    def itemName = "Inscripción individual - ${registration.scheduledCourse.course.name}"
    def itemNumber = registration.scheduledCourse.course.courseKey
    def payedReturnUrl = 'http://makingdevs.com/payed'
    def cancelReturnUrl = 'http://makingdevs.com/cancel'
    def amount = registration.pagos*.cantidadDePago.sum(0) + registration.pagos*.recargosAcumulados.sum(0) - registration.pagos*.descuentoAplicable.sum(0)

    out << """
      <form action='https://www.paypal.com/cgi-bin/webscr' method='post'>
        <input type='hidden' name='business' value='C7U4YESJJEDQ4'>
        <input type='hidden' name='cmd' value='_xclick'>
        <input type='hidden' name='item_name' value='${itemName}'>
        <input type='hidden' name='item_number' value='${itemNumber}'>
        <input type='hidden' name='amount' value='${amount}'>
        <input type='hidden' name='currency_code' value='MXN'>
        <input type='hidden' name='button_subtype' value='services'>
        <input type='hidden' name='no_note' value='0'>
        <input type='hidden' name='no_shipping' value='1'>
        <input type='hidden' name='rm' value='1'>
        <input type='hidden' name='return' value='${payedReturnUrl}'>
        <input type='hidden' name='cancel_return' value='${cancelReturnUrl}'>
        <input type='hidden' name='charset' value='utf-8'>
        <button type='submit' name='submit' class='btn btn-primary' alt='Pago seguro con PayPal'>
          <i class='icon-credit-card'></i> Pagar con PayPal
        </button>
      </form>
    """
  }
}
