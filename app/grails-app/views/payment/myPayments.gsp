<!DOCTYPE html>

<html>
  <head>
    <meta name="layout" content="veneraWithMenu"/>
    <title>Mis pagos</title>
  </head>

  <body>

  <div class="row-fluid">

    <div class="span12">
      <h3 class="section-header">Pagos con beneficios</h3>
      <g:render template="/statement/paymentsOnTime" model="[pagosTiempo: payments.pagosEnTiempo]"/>
    </div>
  </div>
  <hr>
  <div class="row-fluid">
    <div class="span12">
      <h3 class="section-header">Pagos por realizar</h3>
      <g:render template="/statement/comingPayments" model="[pagosRealizar: payments.pagosPorRealizar]"/>
    </div>
  </div>
  </body>
</html>
