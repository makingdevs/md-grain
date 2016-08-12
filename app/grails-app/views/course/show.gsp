
<%@ page import="com.makingdevs.Course" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'course.label', default: 'Course')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-course" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-course" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list course">
			
				<g:if test="${courseInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="course.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${courseInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${courseInstance?.overview}">
				<li class="fieldcontain">
					<span id="overview-label" class="property-label"><g:message code="course.overview.label" default="Overview" /></span>
					
						<span class="property-value" aria-labelledby="overview-label"><g:fieldValue bean="${courseInstance}" field="overview"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${courseInstance?.audience}">
				<li class="fieldcontain">
					<span id="audience-label" class="property-label"><g:message code="course.audience.label" default="Audience" /></span>
					
						<span class="property-value" aria-labelledby="audience-label"><g:fieldValue bean="${courseInstance}" field="audience"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${courseInstance?.prerequisites}">
				<li class="fieldcontain">
					<span id="prerequisites-label" class="property-label"><g:message code="course.prerequisites.label" default="Prerequisites" /></span>
					
						<span class="property-value" aria-labelledby="prerequisites-label"><g:fieldValue bean="${courseInstance}" field="prerequisites"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${courseInstance?.goal}">
				<li class="fieldcontain">
					<span id="goal-label" class="property-label"><g:message code="course.goal.label" default="Goal" /></span>
					
						<span class="property-value" aria-labelledby="goal-label"><g:fieldValue bean="${courseInstance}" field="goal"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${courseInstance?.courseKey}">
				<li class="fieldcontain">
					<span id="courseKey-label" class="property-label"><g:message code="course.courseKey.label" default="Course Key" /></span>
					
						<span class="property-value" aria-labelledby="courseKey-label"><g:fieldValue bean="${courseInstance}" field="courseKey"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${courseInstance?.courseStatus}">
				<li class="fieldcontain">
					<span id="courseStatus-label" class="property-label"><g:message code="course.courseStatus.label" default="Course Status" /></span>
					
						<span class="property-value" aria-labelledby="courseStatus-label"><g:fieldValue bean="${courseInstance}" field="courseStatus"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${courseInstance?.dateCreated}">
				<li class="fieldcontain">
					<span id="dateCreated-label" class="property-label"><g:message code="course.dateCreated.label" default="Date Created" /></span>
					
						<span class="property-value" aria-labelledby="dateCreated-label"><g:formatDate date="${courseInstance?.dateCreated}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${courseInstance?.lastUpdated}">
				<li class="fieldcontain">
					<span id="lastUpdated-label" class="property-label"><g:message code="course.lastUpdated.label" default="Last Updated" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdated-label"><g:formatDate date="${courseInstance?.lastUpdated}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${courseInstance?.id}" />
					<g:link class="edit" action="edit" id="${courseInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
