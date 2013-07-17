package com.makingdevs.pages

import geb.Page

class SignUpPage extends Page {
  static url = "signUp"
  static at = {
    title =~ /. : MakingDevs - SignUp :./
  }
}
