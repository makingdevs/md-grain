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
						<div class="span6">
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
									<g:form url="[resource:user, action:'saveRegistration']" method="PUT">
										<g:hiddenField name="id" value="${registration?.id}" />
										<g:hiddenField name="version" value="${registration?.version}" />
										<g:render template="form"/>
										<g:actionSubmit class="save" action="saveRegistration" value="${message(code: 'default.button.update.label', default: 'Update')}" />
									</g:form>
							</div>
							<div class="span6">
								<ul>
									<g:each in="${registration.pagos}" var="pago">
										<li>
										<g:link controller="pago" action="show" id="${pago.id}">
											$ ${pago.cantidadDePago} - ${pago.tipoDePago} - ${pago.estatusDePago}
										</g:link>
										</li>
									</g:each>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>	
</body>
</html>
