package com.makingdevs

class GithubUser {

  String username
  Long githubId
  String token
  String tokenSecret

  static belongsTo = [user: User]

  static constraints = {
    githubId(unique: true, nullable: false)
    githubId(nullable: false, blank: false)
  }
}
