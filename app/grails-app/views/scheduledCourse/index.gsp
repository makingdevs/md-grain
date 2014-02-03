
<%@ page import="com.makingdevs.ScheduledCourse" %>
<!DOCTYPE html>
<html>
<head>
	<meta name="layout" content="venera"/>		
	<g:set var="entityName" value="${message(code: 'scheduledCourse.label', default: 'ScheduledCourse')}" />
	<title>Cursos Calendarizados</title>
</head>
<body>
	<section class="section-wrapper stripped">
		<div class="container">
			<a href="#list-scheduledCourse" class="skip" tabindex="-1">
			<div class="nav" role="navigation">
				<!--<a class="btn btn-primary" href="${createLink(uri: '/')}">Principal</a-->
				<g:link class="btn btn-primary" action="create">Nuevo Curso Calendarizado</g:link>
			</div>
			<div id="list-scheduledCourse" class="content scaffold-list" role="main">
				<h1>Cursos Calendarizados</h1>
				<g:if test="${flash.message}">
					<div class="message" role="status">${flash.message}</div>
				</g:if>
			<table class="table no-margin table-striped table-bordered">
				<thead>
					<tr>
						<th><g:message code="scheduledCourse.course.label" default="Curso"/></th>

						<g:sortableColumn property="beginDate" title="${message(code: 'scheduledCourse.beginDate.label', default: 'Fecha de Inicio')}" />

						<g:sortableColumn property="limitRegistrationDate" title="${message(code: 'scheduledCourse.limitRegistrationDate.label', default: 'Fecha limite de Registro')}" />

						<g:sortableColumn property="scheduledCourseStatus" title="${message(code: 'scheduledCourse.scheduledCourseStatus.label', default: 'Status')}" />

						<g:sortableColumn property="durationInHours" title="${message(code: 'scheduledCourse.durationInHours.label', default: 'Duración en horas')}" />
					</tr>
				</thead>
				<tbody>
					<g:each in="${scheduledCourseInstanceList}" status="i" var="scheduledCourseInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

						<td><g:link action="show" id="${scheduledCourseInstance.id}">${fieldValue(bean: scheduledCourseInstance, field: "course")}</g:link></td>

						<td><g:formatDate format="dd-MMMM-yyyy" date="${scheduledCourseInstance.beginDate}" /></td>

						<td><g:formatDate format="dd-MMMM-yyyy" date="${scheduledCourseInstance.limitRegistrationDate}" /></td>

						<td>${fieldValue(bean: scheduledCourseInstance, field: "scheduledCourseStatus")}</td>

						<td>${scheduledCourseInstance.durationInHours}</td>

					</tr>
				</g:each>
			</tbody>
		</table>
		<div class="pagination">
			<g:paginate total="${scheduledCourseInstanceCount ?: 0}" />
		</div>
	</div>
</div>
</section>
</body>
</html>
