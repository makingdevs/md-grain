package com.makingdevs

class TwitterUser {

  String username
  Long twitterId
  String token
  String tokenSecret

  static belongsTo = [user: User]

  static constraints = {
    twitterId(unique: true, nullable: false)
    username(nullable: false, blank: false)
  }
}
