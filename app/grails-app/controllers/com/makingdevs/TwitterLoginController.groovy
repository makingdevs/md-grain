package com.makingdevs

class TwitterLoginController {

    def socialTwitterService
    def index() { 
      def authorizeUrl =  socialTwitterService.requestAccessTwitter(session)
      redirect url: authorizeUrl
    }
    def callback(){
      def profile = socialTwitterService.authenticateTwitterUser(session.requestToken, params.oauth_verifier)
      profile
    }
}
