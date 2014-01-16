package com.makingdevs

class ForgotController {

  def index() {

  }

  def recover(){
    def user = User.findByUsername(params.j_username)
    if(user){
      def forgotToken = new ForgotToken(user:user).save()
      // se arma la url de recuperacion con el tokn e
      // correo de recuperacion
      flash.success = "Se han enviado las instrucciones para restablcer tu cuenta a tu correo"
    }else{
      flash.error = "No se ha encontrado un usuario con ese correo"     
    }
    redirect action:"index"
  }

}