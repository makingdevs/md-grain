package com.makingdevs.pages

import geb.Page

class SignUpPage extends Page {
  static url = "signUp"
  static at = {
    $("h1").text() == 'Welcome to MakingDevs'
  }
  static content = {
    signupForm { $('form') }
    course { signupForm.courses }
  }
}
