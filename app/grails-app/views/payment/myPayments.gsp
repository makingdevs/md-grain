<!DOCTYPE html>

<html>
  <head>
    <meta name="layout" content="venera"/>
    <title>Mis pagos</title>
  </head>

  <body>

  <header class="jumbotron subhead" id="overview">
    <div class="container">
      <div class="docs-header-icon">
        <h1><i class="icon-usd"></i> · Mis pagos</h1>
        <p class="lead">Historial de pagos.</p>
      </div>
    </div>
  </header>

  <div class="row-fluid">
    <div>
      <g:render template="/statement/paymentsOnTime" model="[pagosTiempo: payments.pagosEnTiempo]"/>
    </div>
    <div>
      <g:render template="/statement/comingPayments" model="[pagosRealizar: payments.pagosPorRealizar]"/>
    </div>
  </div>


  </body>
</html>
