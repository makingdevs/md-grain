package com.makingdevs

class GmailUser {

  String gmailId
  String accessToken

  static belongsTo = [user: User]

  static constraints = {
    gmailId(unique: true, nullable: false)
    accessToken(nullable: false, blank: false)
  }
}
