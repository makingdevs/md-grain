package com.makingdevs

class RegistrationController {

  def registrationService
  def springSecurityService
  def questionaryPerInstanceLinkService

  def index() {
    [scheduledCourse:ScheduledCourse.findById(params.id,[fetch:[courseSessions:'eager',course:'join']])]
  }

  def addMe(){
    registrationService.addUserToScheduledCourse(springSecurityService.currentUser.username, params.id.toLong())
    redirect controller:"myTraining", model:[scheduledCourseId:params.id.toLong()]
  }

  def all(){
    [registrations:Registration.list(params)]
  }

  def firstEvaluate(){
    def questionary = Questionary.findByCodeNameIlike("%${params.courseKey}-initial%")
    def usuarioActual = springSecurityService.currentUser
    if(usuarioActual){
      def nombre="${params.courseKey}-initial"
      def questionaryPerInstanceLink = questionaryPerInstanceLinkService.createQuestionaryPerInstance(usuarioActual,questionary.id)
      redirect(action: "answerQuestionary", controller:"questionary", 
        params: [id:questionaryPerInstanceLink.questionaryPerInstance.id,
                idQL:questionaryPerInstanceLink.id,
                url:params.url])
    }else{
      redirect(controller:"login")
    }
  }
}