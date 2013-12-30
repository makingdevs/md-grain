<!DOCTYPE html>

<html>
  <head>
    <meta name="layout" content="veneraWithMenu"/>
    <title>Mis pagos</title>
  </head>

  <body>

  <div class="row-fluid">

    <div class="span12">
      <h3 class="section-header">Pagos </h3>
      <g:render template="/statement/paymentsOnTime" model="[pagosTiempo: payments.pagosEnTiempo, pagosPorRealizar: payments.pagosPorRealizar, pagosRechazados: payments.pagosRechazados, pagosProcesados: payments.pagosProcesados]"/>
    </div>
  </div>
  <hr>
  </body>
</html>