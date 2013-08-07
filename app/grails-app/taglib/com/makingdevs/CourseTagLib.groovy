package com.makingdevs

class CourseTagLib {

  def coursesPerCategory = { attrs, body ->
    out << """
      <h3>
        <i class='icon-th-list'></i>
        ${attrs.name}
      </h3>
    """
    def category = Category.findByName(attrs.name)
    out << "<ul>"
    category.courses.each { c ->
      if(!(attrs.currentCourse.toLong() == c.id)){
        out << """
          <li>
            <a href='#'>${c.name}</a>
          </li>
        """  
      }
    }
    out << "</ul>"
  }

}
