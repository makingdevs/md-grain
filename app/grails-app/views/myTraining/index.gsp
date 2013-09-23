<!DOCTYPE html>

<html>
  <head>
    <meta name="layout" content="venera"/>
    <title>Mi entrenamiento</title>
    <r:require module="myTraining"/>
  </head>

  <body>

  <header class="jumbotron subhead" id="overview">
    <div class="container">
      <div class="docs-header-icon">
        <h1><i class="icon-dashboard"></i> · Mi entrenamiento</h1>
        <p class="lead">Historial académico.</p>
      </div>
    </div>
  </header>

  <section class="section-wrapper stripped">
    <div class="container">
      <div class="row">

        <g:render template="/common/messages" />

        <div class="span12">
          <h3 class="section-header">Mis registros</h3>
        </div>

        <g:each in="${registrations}" var="registration">
        <div class="span3">
          <div class="white-card">
            <h5>${registration.scheduledCourse.course.name}</h5>
            <p>
              <strong>Sesiones:</strong>
              <ul class="unstyled"ll>
              <g:each in="${registration.scheduledCourse.courseSessions.sort()}" var="courseSession">
              <li class="unstyled">
                <i class="icon-li icon-ok"></i>
                <g:formatDate format="EEEE dd / MMMM / yyyy" date="${courseSession.sessionStartTime}"/>
              </li>
              </g:each>
              </ul>
            </p>
            <p>
              <strong>Promociones vigentes:</strong>
              <ul>
                <g:each in="${registration.pagos*.descuentos.flatten().sort{ it.id }}" var="descuento">
                  <li> ${descuento.nombreDeDescuento} </li>
                </g:each>
              </ul>
            </p>
            <p>
              <g:remoteLink name="paymentRegistration${registration.id}" controller="myTraining" action="sendPaymentInstructions" params="[registrationId:registration.id]" class="btn btn-success" onLoading="var loader${registration.id} = new ButtonLoader(${registration.id},'${registration.scheduledCourse.course.name}'); loader${registration.id}.preload()" onSuccess="loader${registration.id}.success()" onComplete="loader${registration.id}.complete()">
                <i class="icon-money"></i> 
                Pagar
                $ <g:formatNumber number="${registration.pagos*.cantidadDePago.sum(0) + registration.pagos*.recargosAcumulados.sum(0) - registration.pagos*.descuentoAplicable.sum(0)}" format="###,##0.00" locale="es_MX"/>
              </g:remoteLink>
              <a href="https://www.paypal.com/cgi-bin/webscr?cmd=_xclick&business=C7U4YESJJEDQ4&lc=MX&item_name=Inscripci%c3%b3n%20individual%20en%20Curso&item_number=GROOVY&amount=3250%2e00&currency_code=MXN&button_subtype=services&no_note=0&cn=Dar%20instrucciones%20especiales%20al%20vendedor%3a&no_shipping=1&rm=1&return=http%3a%2f%2fmakingdevs%2ecom%2fpayed&cancel_return=http%3a%2f%2fmakingdevs%2ecom%2fcancel&bn=PP%2dBuyNowBF%3abtn_buynowCC_LG%2egif%3aNonHosted" class="btn">
                Pago con PayPal
              </a>
              <paypal:pay />
            </p>
            <hr/>
            <!--a class="btn btn-primary" href="#">
              <i class="icon-certificate"></i> 
              Realizar evaluación
            </a-->
          </div>
        </div>
        </g:each>


      </div>
    </div>
  </section>

  </body>
</html>
