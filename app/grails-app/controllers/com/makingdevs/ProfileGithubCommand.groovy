package com.makingdevs

import grails.validation.Validateable

class ProfileGithubCommand implements Validateable{
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
