package com.makingdevs

class PerfilController {

  def springSecurityService

  def index(){
    log.debug "Saludos"
    def usuarioActual = springSecurityService.currentUser
    [usuarioActual : usuarioActual]
  }
}