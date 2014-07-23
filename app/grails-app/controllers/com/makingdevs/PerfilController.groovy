package com.makingdevs

class PerfilController {

  def springSecurityService
  def userService

  def index(){
    def usuarioActual = springSecurityService.currentUser
    [usuarioActual : usuarioActual]
  }

  def update(){
    def usuarioActual = userService.updateNickNameAndProfileInfo(params.nickname)
    render template:'/perfil/profileVisibility',model:[usuarioActual:usuarioActual]
  } 
}
