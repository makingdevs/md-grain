package com.makingdevs

class QuestionableInterceptor {

  QuestionableInterceptor(){
    matchAll()
  }

  boolean before() {
    if(!session.questionableTheme) { session.questionableTheme = "quiz"  }
    true
  }

  boolean after() { true }

  void afterView() {
  }
}
