package com.makingdevs

class PerfilController {

  def springSecurityService

  def index(){
    def usuarioActual = springSecurityService.currentUser
    [usuarioActual : usuarioActual]
  }

  def update(){
    def usuarioActual = springSecurityService.currentUser
    usuarioActual.nickname = params.nickname
    usuarioActual.perfil.publicProfile = (usuarioActual.nickname ?  true : false)
    usuarioActual.save(flush:true)
    render template:'/perfil/profileVisibility',model:[usuarioActual:usuarioActual]
  } 
}
