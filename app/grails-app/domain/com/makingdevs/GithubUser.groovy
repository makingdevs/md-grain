package com.makingdevs

class GithubUser {

  String githubId
  String username
  String code
  String accessToken

  static belongsTo = [user: User]

  static constraints = {
    githubId(unique: true, nullable: false)
    username(nullable: false, blank: false)
    code(nullable: false, blank: false)
    accessToken(nullable: false, blank: false)
  }
}
