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
    def forgotToken = ForgotToken.findByToken(params.token)
    if(!forgotToken || forgotToken.used){
      flash.error = "Esta URL se ha invalidado o ha expirado..."
      redirect action:"index"
    }
    [forgotToken:forgotToken]
  }

}