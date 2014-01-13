<%@ page import="com.makingdevs.Registration" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="venera">
		<g:set var="entityName" value="${message(code: 'registration.label', default: 'Registration')}" />
		<title><g:message code="default.edit.label" args="[entityName]" /></title>
	</head>
	<body>

		<section class="section-wrapper">
			<div class="container-fluid">
				<div class="white-card extra-padding">
					<div class="row-fluid">

						<div class="span12">
            	<h3 class="section-header">Registro de ${registration.user.username} a ${registration.scheduledCourse.course}</h3>
            	
          	</div>

          	<div class="row-fluid">
          		
								<h1><g:message code="default.edit.label" args="[entityName]" /></h1>
								<g:if test="${flash.message}">
								<div class="message" role="status">${flash.message}</div>
								</g:if>
								<g:hasErrors bean="${registration}">
								<ul class="errors" role="alert">
									<g:eachError bean="${registration}" var="error">
									<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
									</g:eachError>
								</ul>
								</g:hasErrors>
								<g:form url="[resource:registration, action:'update']" method="PUT" >
									<g:hiddenField name="version" value="${registration?.version}" />
									<fieldset class="form">
										<g:render template="form"/>
									</fieldset>
									<fieldset class="buttons">
										<g:actionSubmit class="save" action="update" value="${message(code: 'default.button.update.label', default: 'Update')}" />
									</fieldset>
								</g:form>
							
          	</div>
						

					</div>
				</div>
			</div>
		</section>


	</body>
</html>
