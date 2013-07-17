package com.makingdevs

import geb.spock.GebReportingSpec
import spock.lang.*
import pages.*

class SignUpUserSpec extends GebReportingSpec {

  def "Show a Sign Up form to register"() {
    when:
      to SignUpPage
    then:
      assert title.text == "Welcome to MakingDevs"
  }
}
