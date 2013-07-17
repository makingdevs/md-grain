package com.makingdevs.pages

import geb.Page

class SignUpPage extends Page {
  static url = "signup"
  static at = {
    title =~ /. : MakingDevs - SignUp :./
  }
}
