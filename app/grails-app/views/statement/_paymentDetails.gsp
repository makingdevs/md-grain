<tr>
  <td>
    ${pago.conceptoDePago}
  </td>
  <td>
    <g:formatDate format="dd-MMMM-yyyy" date="${pago.fechaDeVencimiento}"/>
  </td>
  <td>
    <g:formatNumber number="${pago.cantidadDePago}" format="\$ ###,##0.00" locale="es_MX"/>
  </td>
  <td>
    <descuento:cantidadAplicable pago="${pago}" />
    <descuento:porcentajeTotal pago="${pago}" />
  </td>
  <td>
    <descuento:totalConDescuento pago="${pago}" />
  </td>
  <td>
    <span class="label label-info">
      ${pago.estatusDePago}
    </span>
  </td>
  <td>
    <g:link controller="paymentReceipt" id="${pago.id}" class="btn btn-mini">
      <g:if test="${pago.estatusDePago == com.payable.EstatusDePago.CREADO}">
        <i class="icon-cloud-upload"></i>
      </g:if>
      <g:else>
        <i class="icon-search"></i>
      </g:else>
    </g:link>
  </td>
</tr>