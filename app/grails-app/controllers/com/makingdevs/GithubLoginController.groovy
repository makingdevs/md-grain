package com.makingdevs

class GithubLoginController {

  def socialGithubService
  
  def index() { 

    def authorizeUrl = socialGithubService.requestAccessGithub(session)
    redirect url: authorizeUrl
  }

  def callback(){
    log.debug"callback de github ====== ${params}"
    def profile = socialGithubService.authenticateGithubUser(params.code)
    profile
  }
}
