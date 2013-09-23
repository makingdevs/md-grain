package com.makingdevs

class PaypalTagLib {
  static namespace = 'paypal'

  def pay = { attrs, body ->
    log.debug "Pagos con paypal"
    out << """
      <a href='https://www.paypal.com/cgi-bin/webscr' class='btn btn-primary'>
        <i class='icon-credit-card'></i>
        Pagar con PayPal
      </a>
    """
  }
}
