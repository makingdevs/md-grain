package com.makingdevs

class CourseTagLib {

  def coursesPerCategory = { attrs, body ->
    def category = Category.findByCode(attrs.code)
    if(category){
      out << """
        <h3>
          <i class='icon-th-list'></i>
          ${category.name}
        </h3>
      """
      out << "<ul>"
      category.courses.each { course ->
        if(!(attrs.currentCourse.toLong() == course.id)){
          out << """
            <li>
              <a href='#'>${course.name}</a>
            </li>
          """  
        }
      }
      out << "</ul>"
    }
  }

  def scheduledCourses = { attrs, body ->
    def scheduledCourses = ScheduledCourse.withCriteria {
      course {
        eq 'id',attrs.currentCourse.toLong()
      }
      inList 'scheduledCourseStatus',[ScheduledCourseStatus.PLANNING, ScheduledCourseStatus.SCHEDULED, ScheduledCourseStatus.PROGRESS]
    }
    if(scheduledCourses){
      out << body(scheduledCourses:scheduledCourses)
    }
    
  }

}
