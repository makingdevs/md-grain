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
    def githubUser = GithubUser.findByGithubId(githubProfile.githubId)

    if(!githubUser){
      render view:'callback', model:githubProfile
      return
    }
    if(githubUser.code != githubProfile.code){
      redirect(action: 'index')
      return
    }    
    springSecurityService.reauthenticate githubUser.user.username
    redirect controller:'perfil'
  }

  def register(ProfileGithubCommand profileGithubCommand){

    if(profileGithubCommand.hasErrors()){
      redirect(action: 'index')
      return
    }

    def githubProfile = socialGithubService.createGithubUser(profileGithubCommand)
    def user = User.findByUsername(githubProfile.email)
    def githubUser = GithubUser.findByUser(user)

    if(githubUser.code != githubProfile.code){        
      redirect(action: 'index')
      return
    }
    
    springSecurityService.reauthenticate githubUser.user.username
    redirect controller:'perfil'
  }
}

