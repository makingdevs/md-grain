package com.makingdevs

class CourseTagLib {

  def coursesPerCategory = { attrs, body ->
    def category = Category.findByCode(attrs.code)
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

  def scheduledCourses = { attrs, body ->
    def scheduledCourses = ScheduledCourse.findAll {
      course {
        eq 'id',attrs.currentCourse.toLong()
      }
      inList 'scheduledCourseStatus',[ScheduledCourseStatus.PLANNING, ScheduledCourseStatus.SCHEDULED, ScheduledCourseStatus.PROGRESS]
    }
    if(scheduledCourses){
      out << """
        <div class="blog-recent-tweets widget-tp">
        <h3><i class="icon-calendar"></i>Siguientes fechas:</h3>
        <ul>
      """
      scheduledCourses.each { sc ->
        out << """
          <li>
            Inicia: <strong>${formatDate(date:sc.beginDate,format:"dd - MMMM - yyyy")}</strong><br/>
            Fecha límite: <strong>${formatDate(date:sc.limitRegistrationDate,format:"dd - MMMM - yyyy")}</strong><br/>
            Duración: <strong>${sc.durationInHours} horas</strong>
            <hr/>
            ${link(controller:'register',id:sc.id,class:'btn btn-success'){"<i class='icon-book'> Registrate a este curso!</i>"}}
          </li>
        """
      }
      out << """
        </ul>
        </div>
      """  
    }
    
  }

}
