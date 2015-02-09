package com.makingdevs

@grails.validation.Validateable
class ProfileGithubCommand {
  String name
  String username
  String email
  String code
  String githubId
  String accessToken

  static constraints = {
    name blank:false
    username blank:false
    email email:true, blank: false
    code blank:false
    githubId blank: false
    accessToken blank: false
  }
}