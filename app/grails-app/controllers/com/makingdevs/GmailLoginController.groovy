package com.makingdevs

class GmailLoginController {

  def socialGmailService

  def index() { 
    log.debug "inciar login por gmail :)))))))))))))"
    def profileGmail = socialGmailService.requestAccessGmail(params.access_token)
    profileGmail
  }
}
