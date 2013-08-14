package com.makingdevs

import grails.test.mixin.TestFor
import grails.test.mixin.Mock
import spock.lang.Specification
import grails.test.mixin.domain.DomainClassUnitTestMixin
import grails.plugins.springsecurity.SpringSecurityService

@TestFor(RegistrationService)
//@TestMixin(DomainClassUnitTestMixin)
@Mock([ScheduledCourse,User,Registration])
class RegistrationServiceSpec extends Specification {

	def "Adding a user to a scheduled course and create a registration"() {
    given: "An scheduled course and existing user"
      User.metaClass.isDirty = { true }
      User.metaClass.encodePassword = {"password"}
      mockDomain(User)
      mockDomain(ScheduledCourse)
      new User(username:"me@me.com").save(validate:false)
      new ScheduledCourse(iregistrations:[]).save(validate:false)
    when:
      def registration = service.addUserToScheduledCourse("me@me.com", 1L)
    then:
      registration.id > 0
      registration.registrationStatus == RegistrationStatus.REGISTERED
      !registration.invoice
	}
}
