package com.makingdevs

enum ScheduledCourseStatus {
  PLANNING("scheduledCourse.status.planning"),
  SCHEDULED("scheduledCourse.status.scheduled"),
  FINISHED("scheduledCourse.status.finished"),
  CANCELLED("scheduledCourse.status.cancelled"),
  PROGRESS("scheduledCourse.status.progress")

  private final String code

  ScheduledCourseStatus(String code){
    this.code = code
  }
  public String getCode(){ return this.code }
}