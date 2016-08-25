package com.makingdevs

import groovy.transform.ToString
import grails.validation.Validateable

@ToString(includeNames=true)
class UserCommand implements Validateable {
  String nombre
  String apellidoPaterno
  String apellidoMaterno
  String username
  String password
  String confirmPassword
  String nickname = "${System.currentTimeMillis()}"

  static constraints = {
    nombre blank:false
    apellidoPaterno blank:false
    apellidoMaterno blank:true
    username email:true, blank: false, unique: true
    password blank: false
    confirmPassword blank:false, validator: { val, obj ->
      if(obj.password != val) return 'userCommand.confirmPassword.validator'
    }
  }
}
