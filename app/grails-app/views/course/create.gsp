<%@ page import="com.makingdevs.Course" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="venera">
		<g:set var="entityName" value="${message(code: 'course.label', default: 'Course')}" />
		<title><g:message code="default.create.label" args="[entityName]" /></title>
		<r:require modules="wysihtml5, colorPicker"/>
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
		<div id="create-course" class="container docs-w" role="main">
			<div class="white-card extra-padding">
			<g:hasErrors bean="${courseInstance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${courseInstance}" var="error">
				<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
				</g:eachError>
			</ul>
			</g:hasErrors>
			<g:form action="save" >
				<fieldset class="form">
					<g:render template="form"/>
				</fieldset>
				<fieldset class="buttons">
					<g:submitButton name="create" class="save" value="${message(code: 'default.button.create.label', default: 'Create')}" />
				</fieldset>
			</g:form>
			</div>
			<r:script>
				$('#picker1,#picker2,#picker3').colpick({
					layout:'hex',
					submit:0,
					colorScheme:'dark',
					onChange:function(hsb,hex,rgb,el,bySetColor) {
						$(el).css('border-color','#'+hex);
							if(!bySetColor) $(el).val(hex);
					}
					}).keyup(function(){
						$(this).colpickSetColor(this.value);
				});
			</r:script>
		</div>
	</body>
</html>
