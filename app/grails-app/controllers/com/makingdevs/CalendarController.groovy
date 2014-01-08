package com.makingdevs

import grails.converters.*
import java.text.SimpleDateFormat

class CalendarController {

  def index() {}

  def courseInfoForCalendar(){
    def df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'")
    TimeZone tz = TimeZone.getTimeZone("UTC")
    def courseSessionList = CourseSession.list(fetch:['eager':'scheduledCourse'])
    render(contentType: "application/json") {
      courseSessionList.collect{ cs ->
        [
          id:cs.id,
          title:cs.scheduledCourse.course.name,
          start:df.format(cs.sessionStartTime),
          end:df.format(cs.sessionEndTime),
          url:"http://makingdevs.com"
        ]
      }
    }
  }
}