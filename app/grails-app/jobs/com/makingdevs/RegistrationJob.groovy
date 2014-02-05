package com.makingdevs

class RegistrationJob {
    static triggers = {
      cron name:"registrationTrigger", cronExpression: "0/5 * * * * ?"
    }

    def execute() {
        log.debug "${new Date()}"
    }
}
