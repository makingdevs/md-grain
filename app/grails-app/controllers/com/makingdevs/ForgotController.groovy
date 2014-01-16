package com.makingdevs

class ForgotController {

  def forgotTokenService

  def index() {

  }

  def recover(){
    def user = User.findByUsername(params.j_username)
    if(user){
      forgotTokenService.recoverAccountForUser(user)
      flash.success = "Se han enviado las instrucciones para restablcer tu cuenta a tu correo"
    }else{
      flash.error = "No se ha encontrado un usuario con ese correo"     
    }
    redirect action:"index"
  }

  def reset(){
    
  }

}