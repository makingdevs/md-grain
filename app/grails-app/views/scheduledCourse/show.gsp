
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
			<h1>Detalle del Curso - ${scheduledCourseInstance.course}</h1>
			<div class="nav" role="navigation">
				<g:link class="btn btn-primary" action="index">Cursos Calendaridzado</g:link>
				<!--<g:link class="btn btn-primary" action="create">Nueva Celendarizacion</g:link>-->
			</div>
			<div class="row-fluid">
				<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<g:if test="${scheduledCourseInstance?.course}">
			<div class="span3">
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
				<dt>Duracción en Horas</dt>
				<dd>${scheduledCourseInstance.durationInHours}</dd>
				<dt>Sesiones del Curso</dt>
				<dd>
					<g:each in="${scheduledCourseInstance.courseSessions}" var="c">
					<ul>
						<li><g:link controller="courseSession" action="show" id="${c.id}">${c.encodeAsHTML()}</g:link></li>
					</ul>
				</g:each>
			</dd>
			<dt>Fecha de Creación</dt>
			<dd><g:formatDate format="dd-MM-yyyy HH:mm a" date="${scheduledCourseInstance?.dateCreated}" /></dd>
			<dt>Ultima Modificación</dt>
			<dd><g:formatDate format="dd-MM-yyyy HH:mm a" date="${scheduledCourseInstance?.lastUpdated}" /></dd>
			<dt>Status del curso</dt>
			<dd>${scheduledCourseInstance.scheduledCourseStatus}</dd>
		</div>
		<div class="span9">
			<div class="span5"><dt><h5>Esquema de Pago</h5></dt>
				<dd>
					<dt>Concepto</dt>
					<dd>${scheduledCourseInstance?.esquemaDePago?.concepto}</dd>

					<dt>Cantidad de Pago</dt>
					<dd>${scheduledCourseInstance?.esquemaDePago?.cantidadDePago}</dd>

					<dt>Descuentos</dt>
					<dd><g:each in="${scheduledCourseInstance?.esquemaDePago?.descuentos}" var="r">
						<ul>
							<li>${r}</li>
						</ul>
					</g:each></dd>
				</dd>
			</div>
			<div class="span4">
				<dt>Registrados</dt>
				<dd>
					<g:each in="${scheduledCourseInstance.registrations}" var="r">
					<ul>
						<li>${r?.user?.perfil?.nombreCompleto()}</li>
					</ul>
					</g:each>
				</dd>
			</div>
		</div>
		</g:if>
		</div>
		</div>	
	</section>
</body>
</html>
