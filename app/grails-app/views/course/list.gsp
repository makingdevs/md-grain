
<%@ page import="com.makingdevs.Course" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'course.label', default: 'Course')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-course" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-course" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="name" title="${message(code: 'course.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="overview" title="${message(code: 'course.overview.label', default: 'Overview')}" />
					
						<g:sortableColumn property="audience" title="${message(code: 'course.audience.label', default: 'Audience')}" />
					
						<g:sortableColumn property="prerequisites" title="${message(code: 'course.prerequisites.label', default: 'Prerequisites')}" />
					
						<g:sortableColumn property="goal" title="${message(code: 'course.goal.label', default: 'Goal')}" />
					
						<g:sortableColumn property="courseKey" title="${message(code: 'course.courseKey.label', default: 'Course Key')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${courseInstanceList}" status="i" var="courseInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${courseInstance.id}">${fieldValue(bean: courseInstance, field: "name")}</g:link></td>
					
						<td>${fieldValue(bean: courseInstance, field: "overview")}</td>
					
						<td>${fieldValue(bean: courseInstance, field: "audience")}</td>
					
						<td>${fieldValue(bean: courseInstance, field: "prerequisites")}</td>
					
						<td>${fieldValue(bean: courseInstance, field: "goal")}</td>
					
						<td>${fieldValue(bean: courseInstance, field: "courseKey")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${courseInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
