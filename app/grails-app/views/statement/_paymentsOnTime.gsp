<table class="table no-margin table-striped table-bordered">
 <thead>
   <tr>
    <th>Concepto</th>
    <th>Pagar antes de</th>
    <th>Debes</th>
    <th>Descuento</th>
    <th>Total</th>
    <th>Estatus</th>
    <th>&nbsp;</th>
  </tr>     
 </thead>
  <g:findAll in="${pagosTiempo}" expr="${it.descuentoAplicable > 0}">
    <g:render template="/statement/paymentDetails" model="[pago:it]"/>
  </g:findAll>
  <g:each in="${pagosPorRealizar}">
    <g:render template="/statement/paymentDetails" model="[pago:it]"/>
  </g:each>  
  <g:each in="${pagosRechazados}">
    <g:render template="/statement/paymentDetails" model="[pago:it]"/>
  </g:each>
  <g:each in="${pagosProcesados}">
    <g:render template="/statement/paymentDetails" model="[pago:it]"/>
  </g:each>
  <g:each in="${pagosCorrectos}">
    <g:render template="/statement/paymentDetails" model="[pago:it]"/>
  </g:each>
</table>