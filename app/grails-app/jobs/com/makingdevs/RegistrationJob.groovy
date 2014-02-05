package com.makingdevs

import grails.util.Environment

class RegistrationJob {

  def registrationService

  static triggers = {
    switch(Environment.current){
      case [Environment.DEVELOPMENT,Environment.TEST]:
        cron name:"registrationTrigger", cronExpression: "0 0/1 * * * ?"
        break
      case Environment.PRODUCTION:
        cron name:"registrationTrigger", cronExpression: "0 0/1 * * * ?"
        break
      default:
        cron name:"registrationTrigger", cronExpression: "0 0/1 * * * ?"
    }
  }

  def execute() {
    registrationService.cancelWithLimitRegistrationDate()
  }
}