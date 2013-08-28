<%@ page import="com.makingdevs.CourseSession" %>



<div class="fieldcontain ${hasErrors(bean: courseSessionInstance, field: 'sessionStartTime', 'error')} required">
	<label for="sessionStartTime">
		<g:message code="courseSession.sessionStartTime.label" default="Session Start Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="sessionStartTime" precision="minute"  value="${courseSessionInstance?.sessionStartTime}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: courseSessionInstance, field: 'sessionEndTime', 'error')} ">
	<label for="sessionEndTime">
		<g:message code="courseSession.sessionEndTime.label" default="Session End Time" />
		
	</label>
	<g:datePicker name="sessionEndTime" precision="minute"  value="${courseSessionInstance?.sessionEndTime}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: courseSessionInstance, field: 'scheduledCourse', 'error')} required">
	<label for="scheduledCourse">
		<g:message code="courseSession.scheduledCourse.label" default="Scheduled Course" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="scheduledCourse" name="scheduledCourse.id" from="${com.makingdevs.ScheduledCourse.list()}" optionKey="id" required="" value="${courseSessionInstance?.scheduledCourse?.id}" class="many-to-one"/>
</div>

