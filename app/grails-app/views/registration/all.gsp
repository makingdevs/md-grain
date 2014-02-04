<!DOCTYPE html>
<html>
  <head>
    <meta name="layout" content="venera"/>
    <title>Registros actuales</title>
    <r:require module="buttonLoader"/>
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
            <g:render template="/registration/registrationTable" model="[registrations:registrations]" />
          </div>
        </div>

      </div>
    </div>
  </section>

  </body>
</html>
