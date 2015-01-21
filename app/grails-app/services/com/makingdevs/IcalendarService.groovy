package com.makingdevs

import grails.transaction.Transactional
import net.fortuna.ical4j.model.*
import net.fortuna.ical4j.model.property.*
import net.fortuna.ical4j.model.component.VTimeZone
import net.fortuna.ical4j.model.component.VEvent
import net.fortuna.ical4j.util.UidGenerator
import net.fortuna.ical4j.model.parameter.*
import net.fortuna.ical4j.model.parameter.Role

@Transactional
class IcalendarService {

    def createEvent(username, scheduledCourseId) {

      def user = User.findByUsername(username)
      def scheduledCourse = ScheduledCourse.get(scheduledCourseId)
      def calendarCourse = scheduledCourse.beginDate.toCalendar()

      TimeZoneRegistry registry = TimeZoneRegistryFactory.getInstance().createRegistry()
      TimeZone timezone = registry.getTimeZone("America/Mexico_City")
      VTimeZone tz = timezone.getVTimeZone()

      java.util.Calendar startDate = new GregorianCalendar()
      startDate.setTimeZone(timezone);
      startDate.set(java.util.Calendar.MONTH, calendarCourse.get(java.util.Calendar.MONTH))
      startDate.set(java.util.Calendar.DAY_OF_MONTH, calendarCourse.get(java.util.Calendar.DAY_OF_MONTH))
      startDate.set(java.util.Calendar.YEAR, calendarCourse.get(java.util.Calendar.YEAR))
      startDate.set(java.util.Calendar.HOUR_OF_DAY, calendarCourse.get(java.util.Calendar.HOUR))
      startDate.set(java.util.Calendar.MINUTE, 0)
      startDate.set(java.util.Calendar.SECOND, 0)

      java.util.Calendar endDate = new GregorianCalendar()
      endDate.setTimeZone(timezone)
      endDate.set(java.util.Calendar.MONTH, calendarCourse.get(java.util.Calendar.MONTH))
      endDate.set(java.util.Calendar.DAY_OF_MONTH, calendarCourse.get(java.util.Calendar.DAY_OF_MONTH))
      endDate.set(java.util.Calendar.YEAR, calendarCourse.get(java.util.Calendar.YEAR))
      endDate.set(java.util.Calendar.HOUR_OF_DAY, calendarCourse.get(java.util.Calendar.HOUR))
      endDate.set(java.util.Calendar.MINUTE, 0)  
      endDate.set(java.util.Calendar.SECOND, 0)

      // Create the event
      String eventName = "${scheduledCourse?.course?.name}"
      DateTime start = new DateTime(startDate.getTime())
      DateTime end = new DateTime(endDate.getTime())
      VEvent meeting = new VEvent(start, end, eventName)

      // add timezone info..
      meeting.getProperties().add(tz.getTimeZoneId())

      // generate unique identifier..
      UidGenerator ug = new UidGenerator("uidGen")
      Uid uid = ug.generateUid()
      meeting.getProperties().add(uid)

      // add attendees..
      Attendee dev1 = new Attendee(URI.create("mailto:${user.username}"))
      dev1.getParameters().add(Role.REQ_PARTICIPANT)
      dev1.getParameters().add(new Cn("${user.perfil?.nombre}"))
      meeting.getProperties().add(dev1)

      // Create a calendar
      net.fortuna.ical4j.model.Calendar icsCalendar = new net.fortuna.ical4j.model.Calendar()
      icsCalendar.getProperties().add(new ProdId("-//Events Calendar//iCal4j 1.0//EN"))
      icsCalendar.getProperties().add(CalScale.GREGORIAN)
      icsCalendar.getProperties().add(Method.REQUEST)

      // Add the event and print
      icsCalendar.getComponents().add(meeting)
      log.debug"${icsCalendar}"
      icsCalendar.toString()
    }
}
