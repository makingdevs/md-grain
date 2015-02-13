package com.makingdevs

class GmailLoginController {

  def socialGmailService
  def springSecurityService

  def index() {
  	log.debug"entra en gmail login ::::::)))))))))))"
    def gmailUser = socialGmailService.getPlus(params.access_token)
    log.debug"[1] step"
    if(!gmailUser){
    	'Error al crear usuario de gmail'
    	return
    }
    log.debug"[2] step"
    springSecurityService.reauthenticate gmailUser.user.username
    log.debug"[3] step"

    render(contentType:"text/json") {
      [url : createLink(controller:'profile')]
    }
  }
}
