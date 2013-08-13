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
                           <g:formatNumber number="${scheduledCourse.costByCourse}" format="###,##0.00" locale="es_MX"/>
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
                          <strong>2</strong>
                          Sesiones
                        </li>
                        <li>
                          Aprovecha hasta
                          <strong>20%</strong>
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
                        <tr>
                          <td>1</td>
                          <td>10% de descuento si apartas tu lugar</td>
                          <td>15 - Septiembre - 2013</td>
                        </tr>
                      </tbody>
                    </table>
                    <hr/>
                    <div class="">
                      <h4><i class="icon-calendar"></i> Sesiones</h4>
                      <ul class="icons-lu unstyled">
                        <li><i class="icon-li icon-ok"></i> Sesión 1</li>
                        <li><i class="icon-li icon-ok"></i> Sesión 2</li>
                      </ul>
                    </div>
                    <hr/>
                    <h4><i class="icon-location-arrow"></i> Ubicación</h4>
                    <div class="row-fluid">
                      <div class="span4">
                        <address>
                          ${scheduledCourse.fullAddress}
                        </address>
                      </div>
                      <div class="span8">
                        <iframe width="100%" height="150" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="https://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=es&amp;geocode=&amp;q=uny2+de+mexico&amp;aq=&amp;sll=19.338677,-99.106981&amp;sspn=0.031788,0.038581&amp;ie=UTF8&amp;hq=uny2+de+mexico&amp;hnear=&amp;ll=19.372462,-99.164186&amp;spn=0.063565,0.077162&amp;t=m&amp;z=14&amp;iwloc=A&amp;cid=8295609655684733734&amp;output=embed"></iframe>
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