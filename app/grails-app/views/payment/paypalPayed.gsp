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
        <h1><i class="icon-thumbs-up"></i> · Pago realizado</h1>
        <p class="lead">Recibido desde PayPal.</p>
      </div>
    </div>
  </header>

  <section class="section-wrapper stripped">
    <div class="container">
      <div class="row">

        <div class="span12">
          <div class="white-card">
            <div class="warning alert alert-success">
              <button class="close" data-dismiss="alert" type="button">x</button>
              <strong>Bien hecho!!</strong>
              <span class="message">
                Hemos recibido el pago de tu entrenamiento, en breve estarás recibiendo instrucciones para comenzarlo.
              </span>
            </div>
            
            <g:render template="/payment/registrationDetails" model="[registrations:registrations]" />

          </div>
        </div>

      </div>
    </div>
  </section>

  </body>
</html>
