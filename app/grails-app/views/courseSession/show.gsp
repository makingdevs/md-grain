
<%@ page import="com.makingdevs.CourseSession" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'courseSession.label', default: 'CourseSession')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-courseSession" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-courseSession" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list courseSession">
			
				<g:if test="${courseSessionInstance?.sessionStartTime}">
				<li class="fieldcontain">
					<span id="sessionStartTime-label" class="property-label"><g:message code="courseSession.sessionStartTime.label" default="Session Start Time" /></span>
					
						<span class="property-value" aria-labelledby="sessionStartTime-label"><g:formatDate date="${courseSessionInstance?.sessionStartTime}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${courseSessionInstance?.sessionEndTime}">
				<li class="fieldcontain">
					<span id="sessionEndTime-label" class="property-label"><g:message code="courseSession.sessionEndTime.label" default="Session End Time" /></span>
					
						<span class="property-value" aria-labelledby="sessionEndTime-label"><g:formatDate date="${courseSessionInstance?.sessionEndTime}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${courseSessionInstance?.lastUpdated}">
				<li class="fieldcontain">
					<span id="lastUpdated-label" class="property-label"><g:message code="courseSession.lastUpdated.label" default="Last Updated" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdated-label"><g:formatDate date="${courseSessionInstance?.lastUpdated}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${courseSessionInstance?.dateCreated}">
				<li class="fieldcontain">
					<span id="dateCreated-label" class="property-label"><g:message code="courseSession.dateCreated.label" default="Date Created" /></span>
					
						<span class="property-value" aria-labelledby="dateCreated-label"><g:formatDate date="${courseSessionInstance?.dateCreated}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${courseSessionInstance?.scheduledCourse}">
				<li class="fieldcontain">
					<span id="scheduledCourse-label" class="property-label"><g:message code="courseSession.scheduledCourse.label" default="Scheduled Course" /></span>
					
						<span class="property-value" aria-labelledby="scheduledCourse-label"><g:link controller="scheduledCourse" action="show" id="${courseSessionInstance?.scheduledCourse?.id}">${courseSessionInstance?.scheduledCourse?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:courseSessionInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${courseSessionInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
