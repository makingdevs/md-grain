package com.makingdevs

import grails.converters.JSON
import org.grails.plugins.jasper.JasperReportDef
import org.grails.plugins.jasper.JasperExportFormat

import java.text.SimpleDateFormat

class MyTrainingController {

  def springSecurityService
  def mailService
  def jasperService

  def index() {
    def usuarioActual = springSecurityService.currentUser
    def registrations = Registration.findAllByUser(usuarioActual,[fetch:[scheduledCourse:'join']])
    [registrations:registrations,nombre:usuarioActual]
  }


  //genera pdf con cursos completados por el usuario
  def finishedCoursesReport(){
    //obtiene el path
    String directorioImagen = request.getSession().getServletContext().getRealPath("")
    directorioImagen+="/images/DIPLOMA.jpg"

    def fechaInicial=[]
    def fechaFinal=[]

    def usuarioActual = springSecurityService.currentUser
    def historial=Registration.findByRegistrationStatusAndUserAndId("FINISHED",usuarioActual,params.id)
    def detalle=[curso:historial.scheduledCourse.course.name,
                  sesionInicio:historial.scheduledCourse.courseSessions.each{ inicio ->
                      Date d = inicio.sessionStartTime
                      fechaInicial+=" - "+d.format("EEEEE dd-MMMMM-yyyy").capitalize()
                  },
                  sesionFin:historial.scheduledCourse.courseSessions.each{
                    fin ->
                      Date d = fin.sessionEndTime
                      fechaFinal+=d.format("dd/MM/yyyy HH:mm")
                  },
                  usuario:usuarioActual.perfil.nombre+" "+usuarioActual.perfil.apellidoPaterno+" "+
                          usuarioActual.perfil.apellidoMaterno,
                  duracion:historial.scheduledCourse.durationInHours,
                  fechaInicio:historial.scheduledCourse.beginDate
                ]

    def report=new JasperReportDef(name:"Constancia.jrxml",
                                   fileFormat:JasperExportFormat.PDF_FORMAT,
                                   reportData:
                                    [
                                      [
                                        curso:detalle.curso,
                                        fechaInicio:detalle.fechaInicio,
                                        duracion:detalle.duracion,
                                        usuario:detalle.usuario,
                                        sesionInicio:fechaInicial.sort().join("\n"),
                                        sesionFin:fechaFinal.join(" ")
                                      ]
                                    ],
                                    parameters:[directorio:directorioImagen]
                                  )
    response.setHeader("Content-disposition","attachment; filename="+'Constancia_Makingdevs'+".pdf")
    response.setContentType("application/pdf")
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

