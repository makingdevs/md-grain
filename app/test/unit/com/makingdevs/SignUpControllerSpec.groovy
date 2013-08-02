package com.makingdevs

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(SignUpController)
class SignUpControllerSpec extends Specification {

	def setup() {
	}

	def cleanup() {
	}

	void "test something"() {
    given:
      def s = 10
    when:
      def x = s * 10
    then:
      x == 100
	}
}
