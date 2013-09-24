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
            
            <g:render template="/payment/registrationDetails" model="[registrations:registrations]" />
            
          </div>
        </div>

      </div>
    </div>
  </section>

  </body>
</html>
