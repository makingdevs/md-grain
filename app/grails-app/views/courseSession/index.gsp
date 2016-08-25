
<%@ page import="com.makingdevs.CourseSession" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'courseSession.label', default: 'CourseSession')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-courseSession" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-courseSession" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="sessionStartTime" title="${message(code: 'courseSession.sessionStartTime.label', default: 'Session Start Time')}" />
					
						<g:sortableColumn property="sessionEndTime" title="${message(code: 'courseSession.sessionEndTime.label', default: 'Session End Time')}" />
					
						<g:sortableColumn property="lastUpdated" title="${message(code: 'courseSession.lastUpdated.label', default: 'Last Updated')}" />
					
						<g:sortableColumn property="dateCreated" title="${message(code: 'courseSession.dateCreated.label', default: 'Date Created')}" />
					
						<th><g:message code="courseSession.scheduledCourse.label" default="Scheduled Course" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${courseSessionInstanceList}" status="i" var="courseSessionInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${courseSessionInstance.id}">${fieldValue(bean: courseSessionInstance, field: "sessionStartTime")}</g:link></td>
					
						<td><g:formatDate date="${courseSessionInstance.sessionEndTime}" /></td>
					
						<td><g:formatDate date="${courseSessionInstance.lastUpdated}" /></td>
					
						<td><g:formatDate date="${courseSessionInstance.dateCreated}" /></td>
					
						<td>${fieldValue(bean: courseSessionInstance, field: "scheduledCourse")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${courseSessionInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
