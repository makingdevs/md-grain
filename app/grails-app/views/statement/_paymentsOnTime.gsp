<table class="table">
   <caption>Pagos con Beneficio </caption>
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

      <g:set var="descuentoTotal" value="${p.descuentos.sum(0) { it.porcentaje } }" />
      <g:set var="descuentoRealPorcentaje" value="${descuentoTotal / 100 * p.cantidadDePago }" />

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
          <g:formatNumber number="${descuentoRealPorcentaje}" format="\$ ###,##0.00" locale="es_MX" />
          (<g:formatNumber number="${descuentoTotal}" format="###,##0" locale="es_MX"/>%)
        </td>
        <td>
          <g:formatNumber number="${p.cantidadDePago - descuentoRealPorcentaje}" format="\$ ###,##0.00" locale="es_MX"/>
        </td>
        <td>
          &nbsp;
        </td>
      </tr>
    </g:each>
  </table>