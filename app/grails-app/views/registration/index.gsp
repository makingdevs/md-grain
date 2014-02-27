<html>
<head>
  <meta name="layout" content="venera"/>
  <title>Registrate</title>
</head>
<body>
  <section class='section-wrapper stripped'>
    <div class='container'>
      <div class='row'>
        <div class='span12'>
          <h3 class='section-header'>${scheduledCourse.course.name}</h3>
          <div class='white-card no-padding'>
            <div class='pricing-table'>
              <div class='row'>
                <div class='span6'>
                  <div class='pricing-plan-w first-plan'>
                    <div class='plan-name'>
                      Precio original
                    </div>
                    <div class='plan-price-w'>
                      <div class='plan-price'>
                        <span class='price-currency'>$</span>
                        <span class='price-self'>
                           <g:formatNumber number="${scheduledCourse.esquemaDePago.cantidadDePago}" format="###,##0.00" locale="es_MX"/>
                        </span>
                        <span class='price-period'>/mxn</span>
                      </div>
                    </div>
                    <div class='plan-desc'>
                      <ul>
                        <li>Evaluación de aprovechamiento</li>
                        <li>
                          <strong>${scheduledCourse.durationInHours}</strong>
                          Horas de entrenamiento
                        </li>
                        <li>
                          <strong>${scheduledCourse.courseSessions.size()}</strong>
                          Sesiones
                        </li>
                        <li>
                          Aprovecha hasta
                          <strong>
                            <g:formatNumber number="${scheduledCourse.esquemaDePago.descuentos.sum(0) { it.porcentaje } }" format="###,##0" locale="es_MX"/>%
                          </strong>
                          de descuento
                        </li>
                      </ul>
                      <p>Recuerda poner tu nombre completo para que la generación de constancias sea acorde a tus datos.</p>
                      <g:link controller="registration" action="addMe" id="${scheduledCourse.id}" class="btn btn-primary btn-large">Registrarme al entrenamiento</g:link>
                    </div>
                  </div>
                </div>
                <div class="span6">
                  <div class=''>
                    <div class="">
                      <h4><i class="icon-bell"></i> Promociones vigentes</h4>
                    </div>
                    <table class="table">
                      <thead>
                        <tr>
                          <th>#</th>
                          <th>Promoción</th>
                          <th>Vigencia</th>
                        </tr>
                      </thead>
                      <tbody>
                        <g:each in="${scheduledCourse.esquemaDePago.descuentos.sort{ it.id } }" var="descuento" status="row">
                          <tr>
                            <td>${row + 1}</td>
                            <td>
                              ${descuento.nombreDeDescuento}
                              <g:if test="${new Date() < (scheduledCourse.beginDate - descuento.diasPreviosParaCancelarDescuento)}">
                                <span class="label label-success">Vigente</span>
                              </g:if>
                              <g:else>
                                <span class="label label-warning">Expirado</span>
                              </g:else>
                            </td>
                            <td><g:formatDate format="dd - MMMM - yyyy" date="${scheduledCourse.beginDate - descuento.diasPreviosParaCancelarDescuento}"/></td>
                          </tr>
                        </g:each>
                      </tbody>
                    </table>
                    <hr/>
                    <div class="row-fluid">
                      <div class="span7">
                        <h4><i class="icon-calendar"></i> Sesiones</h4>
                        <ul class="icons-lu unstyled">
                          <g:each in="${scheduledCourse.courseSessions.sort()}" var="courseSession">
                            <li>
                              <i class="icon-li icon-ok"></i>
                              <g:formatDate format="EEEE dd / MMMM / yyyy" date="${courseSession.sessionStartTime}"/> - 
                              <i class="icon-li icon-time"></i>
                              <g:formatDate format="HH:mm" date="${courseSession.sessionStartTime}"/> a
                              <g:formatDate format="HH:mm" date="${courseSession.sessionEndTime}"/> hrs.
                            </li>
                          </g:each>
                        </ul>
                      </div>
                      <div class="span5">
                        <h4><i class="icon-location-arrow"></i> Ubicación</h4>
                        <address>
                          ${scheduledCourse.fullAddress}
                        </address>
                      </div>
                    </div>
                    <hr/>
                    <div class="row-fluid">
                      <div class="span12">
                        <iframe width="100%" height="150" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="http://maps.google.com/?q=${scheduledCourse.geolocation}&amp;num=1&amp;ie=UTF8&amp;t=m&amp;output=embed"></iframe>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
</body>
</html>