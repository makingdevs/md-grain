package com.makingdevs

import grails.converters.*
import java.text.SimpleDateFormat

class CalendarController {

  def index() {}

  def courseInfoForCalendar(){
    def df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'")
    TimeZone tz = TimeZone.getTimeZone("UTC")
    def courseSessionList = CourseSession.list(fetch:['eager':'scheduledCourse'])
    def scheduledCourseList = ScheduledCourse.list(fetch:['eager':'course'])
    render(contentType: "application/json") {
      scheduledCourseList.collect { sc ->
        def i = 1
        sc.courseSessions.sort().collect { cs ->
          [
            id:cs.id,
            title:cs.scheduledCourse.course.name + " - Sesión ${i++}",
            start:df.format(cs.sessionStartTime),
            end:df.format(cs.sessionEndTime),
            url:createLink(controller:'course',action:'landingPage',id:sc.course.courseKey.toLowerCase())
          ]
        }
      }.flatten()
    }
  }
}