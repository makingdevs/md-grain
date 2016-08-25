package com.makingdevs

class CourseController {

  def scaffold = Course

  def landingPage(){
    if(!params.id)
      redirect controller:"home",action:"courses"
    else
      [course:Course.findByCourseKey(params.id),category:params.category]
  }

}
