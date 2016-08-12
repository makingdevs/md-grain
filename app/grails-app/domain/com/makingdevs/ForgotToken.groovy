package com.makingdevs

class ForgotToken {

  String token = UUID.randomUUID().toString()
  Boolean used =  false
  User user

  Date dateCreated
  Date lastUpdated

  static constraints = {
    token blank:false,size:1..40
    used()
  }
}
