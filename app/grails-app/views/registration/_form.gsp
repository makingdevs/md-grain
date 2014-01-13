<%@ page import="com.makingdevs.Registration" %>

<div class="fieldcontain ${hasErrors(bean: registrationInstance, field: 'user', 'error')} required">
	<label for="user">
		<g:message code="registration.user.label" default="User" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="user" name="user.id" from="${com.makingdevs.User.list()}" optionKey="id" required="" value="${registrationInstance?.user?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: registrationInstance, field: 'scheduledCourse', 'error')} required">
	<label for="scheduledCourse">
		<g:message code="registration.scheduledCourse.label" default="Scheduled Course" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="scheduledCourse" name="scheduledCourse.id" from="${com.makingdevs.ScheduledCourse.list()}" optionKey="id" required="" value="${registrationInstance?.scheduledCourse?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: registrationInstance, field: 'invoice', 'error')} ">
	<label for="invoice">
		<g:message code="registration.invoice.label" default="Invoice" />
		
	</label>
	<g:checkBox name="invoice" value="${registrationInstance?.invoice}" />
</div>

<div class="fieldcontain ${hasErrors(bean: registrationInstance, field: 'pagos', 'error')} ">
	<label for="pagos">
		<g:message code="registration.pagos.label" default="Pagos" />
		
	</label>
	<g:select name="pagos" from="${com.payable.Pago.list()}" multiple="multiple" optionKey="id" size="5" value="${registrationInstance?.pagos*.id}" class="many-to-many"/>
</div>

<div class="fieldcontain ${hasErrors(bean: registrationInstance, field: 'registrationStatus', 'error')} required">
	<label for="registrationStatus">
		<g:message code="registration.registrationStatus.label" default="Registration Status" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="registrationStatus" from="${com.makingdevs.RegistrationStatus?.values()}" keys="${com.makingdevs.RegistrationStatus.values()*.name()}" required="" value="${registrationInstance?.registrationStatus?.name()}"/>
</div>

