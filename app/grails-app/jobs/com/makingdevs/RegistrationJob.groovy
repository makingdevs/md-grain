package com.makingdevs

import grails.util.Environment

class RegistrationJob {

  def registrationService

  static triggers = {
    switch(Environment.current){
      case Environment.PRODUCTION:
        cron name:"registrationTrigger", cronExpression: "0 0 1 * * ?"
        break
      default:
        cron name:"registrationTrigger", cronExpression: "0 0 0/1 * * ?"
    }
  }

  def execute() {
    log.debug "Cancelling registrations not completed at ${new Date()} starting."
    registrationService.cancelWithLimitRegistrationDate()
    log.debug "Cancelling registrations not completed at ${new Date()} finished."
  }
}