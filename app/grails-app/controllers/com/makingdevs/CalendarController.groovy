package com.makingdevs

import grails.converters.*

class CalendarController {

  def index() {}

  def courseInfoForCalendar(){
    def scheduledCourseList = ScheduledCourse.findAllByBeginDateGreaterThan(new Date(),[fetch:['eager':'course']])
    render scheduledCourseList as JSON
  }
}