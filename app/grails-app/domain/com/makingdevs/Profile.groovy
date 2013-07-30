package com.makingdevs

import groovy.transform.ToString;

@ToString(includeNames=true)
class Profile {
  String name
  String lastName
  Date dateBorn
  //Sex sex = Sexo.CHIMERA
  String avatar = "http://www.nelson-rives.com/images/noUserPhoto.png"

  static belongsTo = [User]
  //static hasMany = [addresses: Address, phones: Phone]

  Date dateCreated
  Date lastUpdated

  static constraints = {
    name size:1..50,blank:false
    lastName size:1..50,blank:false
    dateBorn nullable:true
    avatar url:true
  }

  String nombreCompleto() {
    "$name $lastName"
  }
}
