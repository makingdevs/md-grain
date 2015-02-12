package com.makingdevs

import grails.transaction.Transactional
import com.google.api.client.auth.oauth2.Credential
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets
import com.google.api.client.http.HttpTransport
import com.google.api.client.http.javanet.NetHttpTransport
import com.google.api.client.json.JsonFactory
import com.google.api.client.json.jackson2.JacksonFactory
import com.google.api.client.util.store.FileDataStoreFactory
import com.google.api.services.oauth2.Oauth2
import com.google.api.services.oauth2.model.Tokeninfo
import com.google.api.services.oauth2.model.Userinfoplus
import com.google.api.client.auth.oauth2.TokenResponse

@Transactional
class SocialGmailService {

  def grailsApplication
  private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport()
  private static final JsonFactory JSON_FACTORY = new JacksonFactory()

  def requestAccessGmail(accessToken) {
    log.debug"[0] entra al metodo requestAccessGmail***************** ${accessToken}"
    Credential credential = authorize()
    log.debug"[1]"
    Oauth2 oauth2 = new Oauth2.Builder(HTTP_TRANSPORT, JSON_FACTORY, credential).setApplicationName("MakingDevs").build()
    log.debug"[2]"
    Tokeninfo tokeninfo = oauth2.tokeninfo().setAccessToken(accessToken).execute()
    log.debug"[3] ${tokeninfo.toPrettyString()}"
    Userinfoplus userinfo = oauth2.userinfo().get().execute()
    log.debug"[4] ${userinfo.toPrettyString()}"
    null
  }

  def authorize(){
    log.debug"[0.1]"
    GoogleClientSecrets.Details installedDetails = new GoogleClientSecrets.Details();
    log.debug"[0.2]"
    installedDetails.setClientId(grailsApplication.config.social.gmail.clientId);
    log.debug"[0.3]"
    installedDetails.setClientSecret(grailsApplication.config.social.gmail.clientSecret);
    log.debug"[0.4]"
    log.debug"[0.5]"
    GoogleClientSecrets clientSecrets = new GoogleClientSecrets();
    log.debug"[0.7]"
    clientSecrets.setInstalled(installedDetails);
    log.debug"[0.8]"
    // Set up a location to store retrieved credentials. This avoids having to ask for authorization
    // every time the application is run
    FileDataStoreFactory credentialStore = new FileDataStoreFactory(
        new File(System.getProperty("user.home"), ".grails/oauth2_md-grain"));
    log.debug"[0.9]"
    log.debug"[0.10]"
    log.debug"[0.11]"
    def scopes = ["https://www.googleapis.com/auth/userinfo.profile","https://www.googleapis.com/auth/userinfo.email"]
    // Set up the authorization flow.
    log.debug"[0.12]"
    GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
        HTTP_TRANSPORT,
        JSON_FACTORY,
        clientSecrets,
        scopes)
          .setDataStoreFactory(credentialStore)
          .build();
    log.debug"[0.13]"
    // Authorize this application.
    return authorize(flow,new LocalServerReceiver())
  }
  def authorize(flow,receiver){
    try {
      log.debug"[0.14]"
      Credential credential = flow.loadCredential("user")
      log.debug"[0.15]"
      if (credential != null && (credential.getRefreshToken() != null || credential.getExpiresInSeconds() > 60)) {
        return credential
      }
      log.debug"[0.16]"
      // open in browser
      String redirectUri = '${grailsApplication.config.social.gmail.callback}'
      // receive authorization code and exchange it for an access token
      log.debug"[0.17]"
      String code = receiver.waitForCode();
      log.debug"[0.18]"
      TokenResponse response = flow.newTokenRequest(code).setRedirectUri(redirectUri).execute();
      log.debug"[0.19]"
      // store credential and return it
      return flow.createAndStoreCredential(response, userId);
    } finally {
      receiver.stop();
    }
  }
}
