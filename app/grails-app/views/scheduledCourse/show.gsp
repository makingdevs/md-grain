
<%@ page import="com.makingdevs.ScheduledCourse" %>
<!DOCTYPE html>
<html>
<head>
	<meta name="layout" content="venera"/>
	<title>Mostrar Curso Calendaridzado</title>
</head>
<body>

	<section class="section-wrapper stripped">
		<div class="container">
			<div class="row-fluid">
				<div class="nav" role="navigation">
					<g:link class="btn btn-primary" action="index">Cursos Calendarizados</g:link>
					<g:link class="btn btn-primary" action="create">Nuevo Curso Calendarizado</g:link>
				</div>
				<h1>Detalle del Curso - ${scheduledCourseInstance.course}</h1>
				<div>
					<g:if test="${flash.message}">
						<div class="message" role="status">${flash.message}</div>
					</g:if>
				</div>
			</div>
		</div>
	</section>

	<section class="section-wrapper stripped">
		<div class="container">
			<div class="row-fluid">
				
					<div class="span4">
						<div class="white-card">
							<dl>
								<dt>Curso:</dt>
								<dd><g:link controller="course" action="show" id="${scheduledCourseInstance?.course?.id}">${scheduledCourseInstance.course}</g:link></dd>
								<dt>Fecha de Inicio:</dt>
								<dd><g:formatDate format="dd-MM-yyyy" date="${scheduledCourseInstance?.beginDate}" /></dd>
								<dt>Fecha Limite de Registro</dt>
								<dd><g:formatDate format="dd-MM-yyyy" date="${scheduledCourseInstance?.limitRegistrationDate}"/></dd>
								<dt>Geolocalización</dt>
								<dd>${scheduledCourseInstance.geolocation}</dd>
								<dt>Dirección</dt>
								<dd>${scheduledCourseInstance.fullAddress}</dd>
							</dl>
						</div>
					</div>
					<div class="span4">
						<div class="white-card">
							<dl>
								<dt>Fecha de Creación</dt>
								<dd><g:formatDate format="dd-MM-yyyy HH:mm a" date="${scheduledCourseInstance?.dateCreated}" /></dd>
								<dt>Ultima Modificación</dt>
								<dd><g:formatDate format="dd-MM-yyyy HH:mm a" date="${scheduledCourseInstance?.lastUpdated}" /></dd>
								<dt>Status del curso</dt>
								<dd>${scheduledCourseInstance.scheduledCourseStatus}</dd>
								<dt>Duración en Horas</dt>
								<dd>${scheduledCourseInstance.durationInHours}</dd>
								<dt>Sesiones del Curso</dt>
								<dd>
									<g:each in="${scheduledCourseInstance.courseSessions}" var="c">
									<ul>
										<li><g:link controller="courseSession" action="show" id="${c.id}">${c.encodeAsHTML()}</g:link></li>
									</ul>
									</g:each>
								</dd>
							</dl>
						</div>
					</div>
					<div class="span4">
						<div class="white-card">
							<h4>Esquema de pago</h4>
							<dl>
								<dt>Concepto</dt>
								<dd>${scheduledCourseInstance?.esquemaDePago?.concepto}</dd>
								<dt>Cantidad de Pago</dt>
								<dd>${scheduledCourseInstance?.esquemaDePago?.cantidadDePago}</dd>
								<dt>Descuentos</dt>
								<dd><g:each in="${scheduledCourseInstance?.esquemaDePago?.descuentos}" var="r">
									<ul>
										<li>${r}</li>
									</ul>
								</g:each>
								</dd>
							</dl>
						</div>
					</div>

			</div>
		</div>
	</section>

	<section class="section-wrapper stripped">
		<div class="container">
			<div class="row-fluid">
				<div class="span12">
					<div class="white-card">
						<g:render template="/registration/registrationTable" model="[registrations:scheduledCourseInstance.registrations]" />
					</div>
				</div>
			</div>
		</div>
	</section>

</body>
</html>
