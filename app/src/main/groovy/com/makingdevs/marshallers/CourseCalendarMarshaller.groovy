package com.makingdevs.marshaller

import org.grails.web.converters.marshaller.ObjectMarshaller
import com.makingdevs.CourseSession

class CourseCalendarMarshaller implements ObjectMarshaller {

  boolean supports(Object object) {
    object instanceof CourseSession
  }

  void marshalObject(object, json) {

    CourseSession courseSession = (CourseSession) object

    def event = [:]
    event.id = courseSession.id
    event.start = courseSession.sessionStartTime
    event.end = courseSession.sessionEndTime
    event.title = courseSession.scheduledCourse.course.name
    event.startTime = courseSession.dateFormatStartTime.format(courseSession.sessionStartTime)
    event.endTime = courseSession.dateFormatEndTime.format(courseSession.sessionEndTime)

    json.convertAnother(event)
  }
}
