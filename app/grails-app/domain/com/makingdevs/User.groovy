package com.makingdevs

import groovy.transform.ToString;
import com.makingdevs.*

@ToString(includeNames=true)
class User implements Questionable {

  transient springSecurityService

  String username
  String password
  String nickname
  boolean enabled
  boolean accountExpired
  boolean accountLocked
  boolean passwordExpired
  Perfil perfil

  static hasMany = [registrations : Registration]

  static constraints = {
    username blank: false, unique: true, email:true
    password blank: false
    nickname unique: true
  }

  static mapping = {
    password column: '`password`'
    nickname column: 'nickname'
  }

  Set<Role> getAuthorities() {
    UserRole.findAllByUser(this).collect { it.role } as Set
  }

  def beforeInsert() {
    encodePassword()
  }

  def beforeUpdate() {
    if (isDirty('password')) {
      encodePassword()
    }
  }

  protected void encodePassword() {
    password = springSecurityService.encodePassword(password)
  }
}
