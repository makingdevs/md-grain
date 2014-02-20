<!DOCTYPE html>

<html>
  <head>
    <meta name="layout" content="venera"/>
    <title>Edición de datos</title>
    <r:require modules="telefono" plugin="profile"/>
  </head>

  <body>

  <header class="jumbotron subhead" id="overview">
    <div class="container">
      <div class="docs-header-icon">
        <h1><i class="icon-info"></i> · Información general</h1>
        <p class="lead">Datos personales.</p>
      </div>
    </div>
  </header>

  <section class="section-wrapper stripped">
    <div class="container">
      <div class="row">

        <div class="span5">
          <div class="white-card">
            <g:render template="header" model="[usuarioActual:usuarioActual]"/>
            <hr/>
            <g:render template="passwordUpdate" model="[usuarioActual:usuarioActual]"/>
          </div>
        </div>

        <div class="span6">
          <div class="white-card">
            <g:render template="/telefono/list" model="[telefonos:usuarioActual.perfil.telefonos]" />
          </div>
        </div>

        <div class="span6">
          <div class="white-card">
            <g:showQuestionaryForThisUser currentUser="${usuarioActual}"/>
          </div>
        </div>

      </div>
    </div>
  </section>

  </body>
</html>
