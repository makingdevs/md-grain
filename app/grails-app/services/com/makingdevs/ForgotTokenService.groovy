package com.makingdevs

import grails.transaction.Transactional

class ForgotTokenService {

  def mailService
  def grailsApplication

  def recoverAccountForUser(User user) {
    def forgotToken = new ForgotToken(user:user).save()
    mailService.sendMail {
      to user.username
      from "info@makingdevs.com"
      subject "· Recupera tu cuenta en MakingDevs ·"
      body """\
        Haz solicitado restablecer tu contraseña, si tu no hiciste esta solicitud entonces por favor ignora este mensaje.

        Para restablecer tu contraseña haz click en el siguiente enlace o copialo y pégalo en tu navegador.

          ${grailsApplication.config.grails.serverURL}/forgot/reset?token=${forgotToken.token}

        Atentamente
        El equipo de MakingDevs
      """
    }

  }
}