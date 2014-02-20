package com.makingdevs

class QuestionaryPerfilTagLib {
    
  def showQuestionaryForThisUser = { attrs, body ->
    def questionaryPerInstanceLinks = QuestionaryPerInstanceLink.findAllByQuestionaryPerInstanceRef(attrs.currentUser.id)
    out << render(template:"/perfil/questionarysForThisUser", 
      model:[questionaryPerInstanceLinks:questionaryPerInstanceLinks])
  }
}
