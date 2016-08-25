package com.makingdevs

import grails.test.mixin.TestFor
import grails.test.mixin.Mock
import spock.lang.*
//import grails.test.mixin.domain.DomainClassUnitTestMixin
import com.payable.PagoService
import com.payable.EsquemaDePago
import com.payable.Pago
import com.payable.DescuentoAplicableService

@TestFor(RegistrationService)
@Mock([ScheduledCourse,User,Registration,EsquemaDePago,Pago])
class RegistrationServiceSpec extends Specification {

  PagoService pagoServiceMock = Mock(PagoService)
  DescuentoAplicableService descuentoAplicableServiceMock = Mock(DescuentoAplicableService)
  NotificationService notificationServiceMock = Mock(NotificationService)

  def setup() {
    service.pagoService = pagoServiceMock
    service.descuentoAplicableService = descuentoAplicableServiceMock
    service.notificationService = notificationServiceMock
  }

	def "Adding a user to a scheduled course and create a registration"() {
    given: "An scheduled course and existing user"
      User user = new User(username:"me@me.com").save(validate:false)
      User.metaClass.isDirty = { true }
      User.metaClass.encodePassword = {"password"}
      user.metaClass.findByUsername(_) >> user

      EsquemaDePago esquemaDePago = new EsquemaDePago().save(validate:false)
      ScheduledCourse scheduledCourse = new ScheduledCourse(esquemaDePago : esquemaDePago, registrations:[]).save(validate:false)
      scheduledCourse.metaClass.addToRegistrations {
        registrations.add(new Registration(user:user))
      }

      service.pagoService.crearPago(_,_) >> new Pago(fechaDeVencimiento:new Date()).save(validate:false)

      service.descuentoAplicableService.generarParaPagoConEsquemaDePagoConFechaReferencia(_,_,_) >> []
      service.descuentoAplicableService.agregarDescuentoAplicableAUnPago(_,_) >> []

      service.notificationService.incribeStudentToCourse(_,_) >> true

    when:
      def registration = service.addUserToScheduledCourse("me@me.com", 1L)
    then:
      registration.registrationStatus == RegistrationStatus.REGISTERED
      !registration.invoice
	}

  def "Adding a user to a scheduled course when already is added"(){
    given: "An scheduled course and existing user"
      User user = new User(username:"me@me.com").save(validate:false)
      User.metaClass.isDirty = { true }
      User.metaClass.encodePassword = {"password"}
      ScheduledCourse scheduledCourse = new ScheduledCourse().save(validate:false)
      Registration registration = new Registration(user:user)
      scheduledCourse.addToRegistrations(registration).save()
      registration.save(validate:false)
    when:
      service.addUserToScheduledCourse("me@me.com", 1L)
    then:
      scheduledCourse.registrations.size() ==  1
  }
}
