<table class="table no-margin table-striped table-bordered">
 <thead>
   <tr>
    <th>Concepto</th>
    <th>Pagar antes de</th>
    <th>Debes</th>
    <th>Descuento</th>
    <th>Total</th>
    <th>&nbsp;</th>
  </tr>     
 </thead>
  <g:each in="${pagosRealizar}" var="p">
    <tr> 
      <td>
        ${p.conceptoDePago}
      </td>
      <td>
        <g:formatDate format="dd-MMMM-yyyy" date="${p.fechaDeVencimiento}"/>
      </td>
      <td>
        <g:formatNumber number="${p.cantidadDePago}" format="\$ ###,##0.00" locale="es_MX"/>
      </td>
      <td>
        $ 0.0
      </td>
      <td>
        <g:formatNumber number="${p.cantidadDePago}" format="\$ ###,##0.00" locale="es_MX"/>        
      </td>
      <td>
        &nbsp;
      </td>
    </tr>
  </g:each>
</table>