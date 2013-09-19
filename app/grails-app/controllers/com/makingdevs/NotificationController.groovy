package com.makingdevs

class NotificationController {

  def index() {
    render(view:params.mailView ?: 'paymentInfo')
  }
}
