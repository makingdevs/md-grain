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
  <g:findAll in="${pagosRealizar}" expr="${it.descuentoAplicable == 0}">
    <tr> 
      <td>
        ${it.conceptoDePago}
      </td>
      <td>
        <g:formatDate format="dd-MMMM-yyyy" date="${it.fechaDeVencimiento}"/>
      </td>
      <td>
        <g:formatNumber number="${it.cantidadDePago}" format="\$ ###,##0.00" locale="es_MX"/>
      </td>
      <td>
        $ 0.0
      </td>
      <td>
        <g:formatNumber number="${it.cantidadDePago}" format="\$ ###,##0.00" locale="es_MX"/>        
      </td>
      <td>
        <g:link controller="paymentReceipt" id="${it.id}" class="btn btn-mini">
          <i class="icon-cloud-upload"></i>
        </g:link>
      </td>
    </tr>
  </g:findAll>
</table>