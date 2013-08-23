package com.makingdevs

class PerfilController {

  def springSecurityService

  def index(){
    def usuarioActual = springSecurityService.currentUser
    [usuarioActual : usuarioActual]
  }
}