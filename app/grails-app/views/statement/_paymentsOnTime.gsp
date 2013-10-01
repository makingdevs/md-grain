<table class="table no-margin table-striped table-bordered">
 <thead style="background-color:whiteSmoke">
   <tr>
    <th>Concepto</th>
    <th>Pagar antes de</th>
    <th>Debes</th>
    <th>Descuento</th>
    <th>Total</th>
    <th>&nbsp;</th>
  </tr>     
 </thead>
  <g:each in="${pagosTiempo}" var="p">
    <tr class="info">
      <td>
        ${p.conceptoDePago}
      </td>
      <td>
        <g:formatDate format="yyyy-MM-dd" date="${p.fechaDeVencimiento}"/>
      </td>
      <td>
        <g:formatNumber number="${p.cantidadDePago}" format="\$ ###,##0.00" locale="es_MX"/>
      </td>
      <td>
        <descuento:cantidadAplicable pago="${p}" />
        <descuento:porcentajeTotal pago="${p}" />
      </td>
      <td>
        <descuento:totalConDescuento pago="${p}" />
      </td>
      <td>
        &nbsp;
      </td>
    </tr>
  </g:each>
</table>