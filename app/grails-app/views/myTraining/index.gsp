<%@ page import="com.makingdevs.RegistrationStatus" %>
<!DOCTYPE html>
<html>
<head>
  <meta name="layout" content="veneraWithMenu"/>
  <title>Mi entrenamiento</title>
  <r:require module="myTraining"/>
</head>

<body>

  <div class="row-fluid">
    <div class="span12">
      <h3 class="section-header">Mis registros</h3>
    </div>

    <g:each in="${registrations}" var="registration">
    <div class="span4">
      <div class="white-card">
        <h5>${registration.scheduledCourse.course.name}</h5>
        <p>
          <strong>Promociones vigentes:</strong>
          <ul>
            <g:each in="${registration.pagos*.descuentosAplicables*.descuento.flatten().sort{ it.id }}" var="descuento">
            <li> ${descuento.nombreDeDescuento} </li>
          </g:each>
          </ul>
        </p>
        <hr>
        <p>
          <g:if test="${
          registration.registrationStatus == RegistrationStatus.REGISTERED || 
          registration.registrationStatus == RegistrationStatus.INSCRIBED_AND_WITH_DEBTH || 
          registration.registrationStatus == RegistrationStatus.INSCRIBED_AND_WITH_DEBTH_IN_GROUP}">
          <g:remoteLink name="paymentRegistration${registration.id}" controller="myTraining" action="sendPaymentInstructions" params="[registrationId:registration.id]" class="btn btn-success" onLoading="var loader${registration.id} = new ButtonLoader(${registration.id},'${registration.scheduledCourse.course.name}'); loader${registration.id}.preload()" onSuccess="loader${registration.id}.success()" onComplete="loader${registration.id}.complete()">
          <i class="icon-money"></i> 
          Pagar con SPEI 
          $ <g:formatNumber number="${registration.pagos*.cantidadDePago.sum(0) + registration.pagos*.recargosAcumulados.sum(0) - registration.pagos*.descuentoAplicable.sum(0)}" format="###,##0.00" locale="es_MX"></g:formatNumber>
          </g:remoteLink>
          <paypal:pay registration="${registration}"></paypal:pay>
          </g:if>
        </p>
        <g:if test="${registration.registrationStatus == RegistrationStatus.INSCRIBED_AND_PAYED || registration.registrationStatus == RegistrationStatus.INSCRIBED_AND_PAYED_IN_GROUP }">
          <p>
            <span class="label label-success"><i class="icon-thumbs-up-alt"></i> Todo listo para comenzar el curso.</span>
          </p>
        </g:if>

        <g:if test="${registration.registrationStatus == RegistrationStatus.FINISHED}">
          <a class="btn btn-primary" href="#">
            <i class="icon-certificate"></i> 
            Obtener certificado
          </a>
        </g:if>

        <g:if test="${registration.registrationStatus == RegistrationStatus.CANCELLED}">
          <p>
            <span class="label label-inverse"><i class="icon-remove"></i> Este registro se ha cancelado.</span>
          </p>
        </g:if>

      </div>
    </div>
    </g:each>

  </div>

</body>
</html>
