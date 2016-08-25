<html>
<head>
  <meta name="layout" content="venera"/>
  <title>Página no encontrada!</title>
</head>
<body>


  <section class='section-wrapper not-found-w'>
    <div class='container'>
      <div class='row'>
        <div class='span4'>
          <r:img alt="Not-found-error" uri="/assets/images/not-found-error.png" />
        </div>
        <div class='span8'>
          <h1>Aún no tenemos lista esta parte...</h1>
          <h4>Pero seguramente pronto la tendremos en funcionamiento y en vivo.</h4>
          <p>Tal vez estabas buscando algo de esta información....</p>
          <div class='not-found-solutions btn-group'>
            
            <g:link class="btn" controller="home" action="contact">
              <i class='icon-circle-arrow-left'></i>
              Ir a nuestra página de contacto
            </g:link>
            
            <g:link class="btn" controller="home">
              <i class='icon-home'></i>
              Ir a la página de inicio.
            </g:link>

            <g:link class="btn" controller="training">
              <i class='icon-th-list'></i>
              Revisar nuestra oferta de entrenamiento
            </g:link>

          </div>
          <div class='white-card extra-padding'>

            <fieldset>
              <legend>O tal vez desees...</legend>

              <g:link controller="signUp" class="btn btn-primary btn-large">Crear una cuenta</g:link>

            </fieldset>

          </div>
        </div>
      </div>
    </div>
  </section>

</body>
</html>
