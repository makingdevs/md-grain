package com.makingdevs

import grails.test.mixin.TestFor
import grails.test.mixin.Mock
import spock.lang.Specification
import grails.test.mixin.domain.DomainClassUnitTestMixin
import grails.plugins.springsecurity.SpringSecurityService

@TestFor(RegistrationService)
@Mock([ScheduledCourse,User,Registration])
class RegistrationServiceSpec extends Specification {

	def "Adding a user to a scheduled course and create a registration"() {
    given: "An scheduled course and existing user"
      User.metaClass.isDirty = { true }
      User.metaClass.encodePassword = {"password"}
      mockDomain(User)
      mockDomain(ScheduledCourse)
      new User(username:"me@me.com").save(validate:false)
      new ScheduledCourse().save(validate:false)
    when:
      def registration = service.addUserToScheduledCourse("me@me.com", 1L)
    then:
      registration.id > 0
      registration.registrationStatus == RegistrationStatus.REGISTERED
      !registration.invoice
	}

  def "Adding a user to a scheduled course when already is added"(){
    given: "An scheduled course and existing user"
      User.metaClass.isDirty = { true }
      User.metaClass.encodePassword = {"password"}
      mockDomain(User)
      mockDomain(ScheduledCourse)
      def user = new User(username:"me@me.com").save(validate:false)
      new ScheduledCourse().save(validate:false)
      def registration = new Registration(user:user)
      ScheduledCourse.get(1L).addToRegistrations(registration).save()
      registration.save(validate:false)
    when:
      service.addUserToScheduledCourse("me@me.com", 1L)
      def scheduledCourse = ScheduledCourse.get(1L)
    then:
      scheduledCourse.registrations.size() ==  1
  }
}