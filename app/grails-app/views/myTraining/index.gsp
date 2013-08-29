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

        <g:each in="${1..7}" var="i">
        <div class="span3">
          <div class="white-card">
            <h5>Frank Lampard.</h5>
            <p>Cras metus elit, consectetur sed congue vel, sollicitudin eget odio. Cras lacinia laoreet libero et mattis.</p>
          </div>
        </div>
        </g:each>


      </div>
    </div>
  </section>

  </body>
</html>
