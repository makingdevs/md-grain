<!DOCTYPE html>

<html>
  <head>
    <meta name="layout" content="venera"/>
    <title>Mi entrenamiento</title>
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
            </p>
            <p>
              <a class="btn btn-success" href="#">
                <i class="icon-shopping-cart icon-large"></i> 
                Pagar
                $ <g:formatNumber number="${registration.scheduledCourse.costByCourse}" format="###,##0.00" locale="es_MX"/>
              </a>
            </p>
          </div>
        </div>
        </g:each>


      </div>
    </div>
  </section>

  </body>
</html>
