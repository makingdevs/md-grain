package com.makingdevs

import grails.transaction.Transactional
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential
import com.google.api.client.http.javanet.NetHttpTransport
import com.google.api.client.json.jackson2.JacksonFactory
import com.google.api.services.oauth2.Oauth2
import com.google.api.services.oauth2.model.Userinfoplus

@Transactional
class SocialGmailService {

  def signUpService

  def getPlus(accessToken){
    
    GoogleCredential credential = new GoogleCredential().setAccessToken(accessToken)
    Oauth2 oauth2 = new Oauth2.Builder(new NetHttpTransport(), JacksonFactory.getDefaultInstance(),credential)
            .setApplicationName("MakingDevs")
            .build()
    Userinfoplus userinfoplus = oauth2.userinfo().get().execute()

    def userCommand = new UserCommand()
    userCommand.nombre = userinfoplus.getGivenName()?:'gmail name'
    userCommand.apellidoPaterno = userinfoplus.getFamilyName()?:'gmail lastname'
    userCommand.apellidoMaterno = ""
    userCommand.username = userinfoplus.getEmail()
    userCommand.password = accessToken
    userCommand.nickname = "${System.currentTimeMillis()}"

    def userDB = User.findByUsername(userinfoplus.getEmail())
    def gmailUserDB = GmailUser.findByGmailId(userinfoplus.getId())
    def gmailUser = gmailUserDB?:new GmailUser()
    gmailUser.user = userDB?:signUpService.registerUserWithUserCommand(userCommand)
    gmailUser.gmailId = userinfoplus.getId()
    gmailUser.accessToken = accessToken
    gmailUser.save(failOnError: true)

    gmailUser
  }
}
