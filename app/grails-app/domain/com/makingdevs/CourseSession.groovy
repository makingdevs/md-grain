package com.makingdevs

import java.text.SimpleDateFormat

class CourseSession implements Comparable{
  
  Date sessionStartTime
  Date sessionEndTime
  Date dateCreated
  Date lastUpdated
  
  static belongsTo = [scheduledCourse:ScheduledCourse]

  static dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm")
  
  static constraints = {
    sessionStartTime nullable:false
    sessionEndTime nullable:true
    lastUpdated display:false
    dateCreated display:false
  }
  
  String toString(){
    dateFormat.format(this.sessionStartTime)
  }

  int compareTo(obj){
    sessionStartTime.compareTo(obj.sessionStartTime)
  }
}