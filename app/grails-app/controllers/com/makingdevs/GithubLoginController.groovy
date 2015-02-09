package com.makingdevs

class GithubLoginController {

  def socialGithubService
  def springSecurityService
  
  def index() { 

    def authorizeUrl = socialGithubService.requestAccessGithub(session)
    redirect url: authorizeUrl
  }

  def callback(){
    def githubProfile = socialGithubService.authenticateGithubUser(params.code)
    log.debug"githubProfile.githubId =============>>>>> ${githubProfile.githubId}"
    def githubUser = GithubUser.findByGithubId(githubProfile.githubId)

    if(!githubUser){
      render view:'callback', model:githubProfile
      return
    }
    if(githubUser.code != githubProfile.code){
      redirect(action: 'index')
      return
    }
    log.debug"first ---- aplicar login al usuario ********:))))"
    log.debug" username ====== ${githubUser.user.username}"
    springSecurityService.reauthenticate githubUser.user.username
    redirect controller:'perfil'
  }
  def register(ProfileGithubCommand profileGithubCommand){
    log.debug"parametros de ProfileGithubCommand ---> ${ProfileGithubCommand}"
    if(profileGithubCommand.hasErrors()){
      redirect(action: 'index')
      return
    }
    def profile = socialGithubService.createGithubUser(profileGithubCommand)
    def user = User.findByUsername(profile.email)
    def githubUser = GithubUser.findByUser(user)
    if(githubUser.code == profile.code){
      log.debug" second ----- aplicar login al usuario ********:))))"
      log.debug" username ====== ${githubUser.user.username}"
      springSecurityService.reauthenticate githubUser.user.username
      redirect controller:'perfil'
      return
    }
  }
}

