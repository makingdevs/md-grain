package com.makingdevs

import grails.converters.JSON

class MyTrainingController {

  def springSecurityService
  def mailService

  def index() {
    def usuarioActual = springSecurityService.currentUser
    def registrations = Registration.findAllByUser(usuarioActual,[fetch:[scheduledCourse:'join']])
    [registrations:registrations]
  }

  //genera pdf con cursos completados por el usuario
  def finishedCoursesReport(){
    def usuarioActual = springSecurityService.currentUser
    def cursos=Registration.findByRegistrationStatusAndUser("FINISHED",usuarioActual)
    
    def report=new JasperReportDef(name:"Constancia.jasper",
                                   fileFormat:JasperExportFormat.PDF_FORMAT,
                                   reportData:[[curso:cursos.scheduledCourse.course.name,
                                    fechaInicio:cursos.scheduledCourse.beginDate,
                                    duracion:cursos.scheduledCourse.durationInHours,
                                    usuario:usuarioActual.username]]
                                    )

    response.setContentType("application/pdf")
    response.setHeader("Content-disposition","attachment; filename="+usuarioActual+".pdf")
    response.outputStream << jasperService.generateReport(report).toByteArray()
  }

  def sendPaymentInstructions(){
    def currentUser = springSecurityService.currentUser
    Registration registration = Registration.findById(params.long('registrationId'))
    // TODO: Sacar a un servicio(en el plugin probablemente)
    def totalAPagar = registration.pagos*.cantidadDePago.sum(0) + registration.pagos*.recargosAcumulados.sum(0) - registration.pagos*.descuentoAplicable.sum(0)
    mailService.sendMail {
      to currentUser.username
      from "info@makingdevs.com"
      subject "· Instrucciones de pago ·"
      body( view:"/notification/paymentInfo", model:[course:registration.scheduledCourse.course,totalAPagar:totalAPagar])
    }
    render registration as JSON
  }
}
