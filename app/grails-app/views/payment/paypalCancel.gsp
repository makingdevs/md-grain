<!DOCTYPE html>

<html>
  <head>
    <meta name="layout" content="venera"/>
    <title>Pago cancelado</title>
  </head>

  <body>

  <header class="jumbotron subhead" id="overview">
    <div class="container">
      <div class="docs-header-icon">
        <h1><i class="icon-warning-sign"></i> · Pago cancelado</h1>
        <p class="lead">Recibido desde PayPal.</p>
      </div>
    </div>
  </header>

  <section class="section-wrapper stripped">
    <div class="container">
      <div class="row">

        <div class="span12">
          <div class="white-card">
            <div class="warning alert alert-warning">
              <button class="close" data-dismiss="alert" type="button">x</button>
              <strong>Woops!!</strong>
              <span class="message">
                Cancelaste el pago que estabas haciendo. No te preocupes, aún lo puedes realizar, regresa nuevamente a <b>'Mi entrenamiento'</b> y podrás comenzar de nuevo.
              </span>
            </div>
            
            <table class="table no-margin table-striped table-bordered">
              <thead>
                <tr>
                  <th>#</th>
                  <th>Curso</th>
                  <th>Fecha de inicio</th>
                  <th>Duración</th>
                  <th>Estatus del curso</th>
                  <th>Estatus del registro</th>
                </tr>
              </thead>
              <tbody>
                <g:each in="${registrations}" var="r" status="i">
                <tr>
                  <td>${i+1}</td>
                  <td>${r.scheduledCourse.course.name}</td>
                  <td>${formatDate(date:r.scheduledCourse.beginDate,format:"dd - MMMM - yyyy")}</td>
                  <td>${r.scheduledCourse.durationInHours} horas</td>
                  <td>
                    <span class="label">
                    <g:message code="${r.scheduledCourse.scheduledCourseStatus.code}"/>
                    </span>
                  </td>
                  <td>
                    <span class="label">
                    <g:message code="${r.registrationStatus.code}"/>
                    </span>
                  </td>
                </tr>
                </g:each>
              </tbody>
            </table>

          </div>
        </div>

      </div>
    </div>
  </section>

  </body>
</html>
