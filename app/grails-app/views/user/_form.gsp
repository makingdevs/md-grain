<%@ page import="com.makingdevs.Registration" %>


<div class="fieldcontain ${hasErrors(bean: registration, field: 'invoice', 'error')} ">
	<label for="invoice">
		<g:checkBox name="invoice" value="${registration?.invoice}" />
		<g:message code="registration.invoice.label" default="Invoice" />
	</label>
</div>

<div class="fieldcontain ${hasErrors(bean: registration, field: 'pagos', 'error')} ">
	<label for="pagos">
		<g:message code="registration.pagos.label" default="Pagos" />
	</label>
	<ul>
	<g:each in="${registration?.pagos}" var="pago">
		<li>
			<g:link controller="voucher" action="show" id="${pago.id}">
				${pago.cantidadDePago} por ${pago.conceptoDePago}
			</g:link>
		</li>
	</g:each>
	</ul>
</div>

<div class="fieldcontain ${hasErrors(bean: registration, field: 'registrationStatus', 'error')} required">
	<label for="registrationStatus">
		<g:message code="registration.registrationStatus.label" default="Registration Status" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="registrationStatus" from="${com.makingdevs.RegistrationStatus?.values()}" keys="${com.makingdevs.RegistrationStatus.values()*.name()}" required="" value="${registration?.registrationStatus?.name()}" class="input-xlarge"/>
</div>

