package com.makingdevs

import java.text.SimpleDateFormat

class CourseSession implements Comparable{
  
  Date sessionStartTime
  Date sessionEndTime
  Date dateCreated
  Date lastUpdated
  
  static belongsTo = [scheduledCourse:ScheduledCourse]

  transient dateFormatStartTime = new SimpleDateFormat("dd/MM/yyyy HH:mm")
  transient dateFormatEndTime = new SimpleDateFormat("HH:mm")
  
  static constraints = {
    sessionStartTime nullable:false
    sessionEndTime nullable:true
    lastUpdated display:false
    dateCreated display:false
  }
  
  String toString(){
    "${dateFormatStartTime.format(this.sessionStartTime)} - ${dateFormatEndTime.format(this.sessionEndTime)}"
  }

  int compareTo(obj){
    sessionStartTime.compareTo(obj.sessionStartTime)
  }
}