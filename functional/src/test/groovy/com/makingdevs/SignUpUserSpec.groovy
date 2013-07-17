package com.makingdevs

import geb.spock.GebReportingSpec
import spock.lang.*
import com.makingdevs.pages.*

class SignUpUserSpec extends GebReportingSpec {

  def "Show a Sign Up form to register"() {
    when:
      to SignUpPage
    then:
      at SignUpPage
      assert title == ". : MakingDevs - SignUp : ."
  }
}
