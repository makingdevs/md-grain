package com.makingdevs

public enum RegistrationStatus {
  REGISTERED("registration.registered.no.group"),
  INSCRIBED_AND_WITH_DEBTH("registration.inscribed.with.debt"),
  INSCRIBED_AND_WITH_DEBTH_IN_GROUP("registration.inscribed.with.debt.in.group"),
  INSCRIBED_AND_PAYED("registration.inscribed.payed"),
  INSCRIBED_AND_PAYED_IN_GROUP("registration.inscribed.payed.in.group"),
  FINISHED("registration.finished"),
  CANCELLED("registration.cancelled")

  private final String code

  RegistrationStatus(String code){
    this.code = code
  }

  public String getCode(){ return this.code }
}