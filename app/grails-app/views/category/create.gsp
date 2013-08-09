<%@ page import="com.makingdevs.Category" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="venera">
		<g:set var="entityName" value="${message(code: 'category.label', default: 'Category')}" />
		<title><g:message code="default.create.label" args="[entityName]" /></title>
		<r:require module="wysihtml5"/>
	</head>
	<body>
		<header class="jumbotron subhead" id="menuOptions">
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<div class="container">
				<div class="docs-header-icon">
					<h1><g:message code="default.create.label" args="[entityName]" /></h1>
				</div>
			</div>
		</header>
		<div class="sub-jumbotron">
			<div class="container">
				<ul>
					<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
					<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				</ul>
			</div>
		</div>
		<div id="create-category" class="container docs-w" role="main">
			<div class="white-card extra-padding">
			<g:hasErrors bean="${categoryInstance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${categoryInstance}" var="error">
				<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
				</g:eachError>
			</ul>
			</g:hasErrors>
			<g:form action="save">
				<fieldset>
					<g:render template="form"/>
				</fieldset>
				<fieldset class="buttons">
					<g:submitButton name="create" class="btn" value="${message(code: 'default.button.create.label', default: 'Create')}" />
				</fieldset>
			</g:form>
			</div>
		</div>
	</body>
</html>
