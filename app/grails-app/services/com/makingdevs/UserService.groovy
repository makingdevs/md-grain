package com.makingdevs

import grails.transaction.Transactional

@Transactional
class UserService {

  def springSecurityService

  def updateNickNameAndProfileInfo(nickname){
    def usuarioActual = springSecurityService.currentUser
    usuarioActual.nickname=nickname
    usuarioActual.perfil.publicProfile=(usuarioActual.nickname ? true: false)
    usuarioActual.save()
    usuarioActual
  }
}
