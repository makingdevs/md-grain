package com.makingdevs

import grails.test.mixin.TestFor
import grails.test.mixin.Mock
import spock.lang.Specification

@TestFor(RegistrationService)
@Mock([ScheduledCourse,User])
class RegistrationServiceSpec extends Specification {

	def "Adding a user to a scheduled course"() {
    given: "An scheduled course"
      new ScheduledCourse().save(validate:false)
    and: "a given user"
      def user = new User().save(validate:false)
    when:
      def registration = service.addUserToScheduledCourse(user, 1L)
    then:
      registration.id > 0
	}
}
