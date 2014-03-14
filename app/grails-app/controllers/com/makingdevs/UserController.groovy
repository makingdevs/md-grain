package com.makingdevs

class UserController {

  def springSecurityService

  def show() {
    def user = User.findById(params.long('id'),[fetch:['eager':'registrations']])
    [user:user]
  }

  def registration(){
    def registration = Registration.get(params.id)
    [registration:registration]
  }

  def saveRegistration(){
    def registration = Registration.get(params.id)
    registration.properties = params
    registration.save(flush:true)
    flash.message = "Registration updated correctly!"
    redirect action:'show',id:registration.user.id
  }

  def all(){
    [users:User.list()]
  }

  def perfilUser(){
    def usuarioActual = springSecurityService.currentUser
    println usuarioActual.registrations.scheduledCourse.course
    [usuarioActual:usuarioActual.getUsername()]
  }

  def piedritas(){
    if (params?.check) render(template: 'piedritas1')
    else render(template: 'piedritas2')
  }
  
}
