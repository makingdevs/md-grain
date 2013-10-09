<!DOCTYPE html>

<html>
  <head>
    <meta name="layout" content="venera"/>
    <title>Registros actuales</title>
  </head>

  <body>

  <header class="jumbotron subhead" id="overview">
    <div class="container">
      <div class="docs-header-icon">
        <h1><i class="icon-info"></i> · Registro de usuarios</h1>
        <p class="lead">Alumnos registrados a algún curso.</p>
      </div>
    </div>
  </header>

  <section class="section-wrapper stripped">
    <div class="container">
      <div class="row">

        <div class="span12">
          <div class="white-card">
            
          <h3 class="section-header">Todos los registros</h3>
            <table class="table no-margin table-striped table-bordered">
              <thead>
                <tr>
                  <th>#</th>
                  <th>Nombre</th>
                  <g:sortableColumn property="user.username" title="Correo"/>
                  <g:sortableColumn property="scheduledCourse.course" title="Curso" defaultOrder="desc"/>
                  <g:sortableColumn property="dateCreated" title="Registrado" defaultOrder="desc"/>
                  <g:sortableColumn property="registrationStatus" title="Status" defaultOrder="desc"/>
                </tr>
              </thead>
              <tbody>
                <g:each in="${registrations}" var="r" status="i">
                <tr>
                  <td>${i + 1}</td>
                  <td>${r.user.perfil.nombreCompleto()}</td>
                  <td>${r.user.username}</td>
                  <td>${r.scheduledCourse.course}</td>
                  <td>${formatDate(date:r.dateCreated,format:"dd - MMMM - yyyy")}</td>
                  <td>${r.registrationStatus}</td>
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
