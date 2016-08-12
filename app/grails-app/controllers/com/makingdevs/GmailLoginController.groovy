package com.makingdevs

class GmailLoginController {

  def socialGmailService
  def springSecurityService

  def index() {
    def gmailUser = socialGmailService.getPlus(params.access_token)
    if(!gmailUser){
    	'Error al crear usuario de gmail'
    	return
    }
    springSecurityService.reauthenticate gmailUser.user.username
    redirect controller:'login', action:'ajaxSuccess'
  }
}
