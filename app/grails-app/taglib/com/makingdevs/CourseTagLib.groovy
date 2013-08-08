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

}
