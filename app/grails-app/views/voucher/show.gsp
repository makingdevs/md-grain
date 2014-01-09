<%@ page import="com.payable.EstatusDePago" %>
<%@ page import="com.payable.TipoDePago" %>
<html>
<head>
  <meta name="layout" content="venera"/>
</head>

<body>

 <section class='section-wrapper stripped'>
  <div class="container">
    <div class="row-fluid">
      <div class="span6">
        <div class="row-fluid">
          <div class="span6">
            <h5>Cobro</h5>
            <dl>
              <dt>Concepto</dt>
              <dd>${pago.conceptoDePago}</dd>
              <dt>Vencimiento</dt>
              <dd>${pago.fechaDeVencimiento.format('dd/MM/yyyy')}</dd>
              <dt>Importe</dt>
              <dd>$ <g:formatNumber format="###,##0.00" locale="es_MX" number="${pago.cantidadDePago}"/></dd>
            </dl>
          </div>
          <div class="span6">
            <h5>Cobro con descuento</h5>
            <dl>
              <dt >Importe</dt>
              <dl ><strong>$<g:formatNumber format="###,##0.00" locale="es_MX" number="${pago.cantidadDePago - pago.descuentoAplicable}" /></strong></dl>
            </dl>
          </div>
        </div>

        <h5 class="bigger lighter">Descuentos</h5>        

        <table class="table table-striped table-bordered table-hover table-condensed">
          <thead>
            <tr>
              <th >Concepto</th>
              <th >Vencimiento</th>
              <th >Importe</th>
            </tr>
          </thead>
          <tbody>
            <g:each var="descuentoAplicable" in="${pago.descuentosAplicables}">
            <tr>
             <td >${descuentoAplicable.descuento.nombreDeDescuento}</td>
             <td >${descuentoAplicable.fechaDeExpiracion.format('dd/MM/yyyy')}</td>
             <td >$ ${pago.descuentoAplicable}</td>
            </tr>   
            </g:each>
          </tbody>
        </table>

        <g:form class="form-horizontal" id="conciliacion" name="conciliacion" controller="comprobante" action="validarComprobante">
          <legend>Datos del comprobante</legend>
          <fieldset>
            <label>Fecha comprobante</label>
            <div id="datetimepicker1" class="input-append date" data-date="12-02-2012" data-date-format="dd-mm-yyyy">
              <input id="fechaDePago" name="fechaDePago" data-format="yyyy-mm-dd" type="text"></input>
              <span class="add-on">
                <i class="icon-calendar"></i>
              </span>
            </div>
            <label>Monto</label>
            $ <g:formatNumber format="###,##0.00" locale="es_MX" number="${pago.cantidadDePago}"/>
            <label>Tipo de pago</label>
            <g:select id="tipoDePago" name="tipoDePago" noSelection="['':'- Tipo de Pago-']" from="${TipoDePago.values()}" optionKey="key" />
            <label>Referencia del banco</label>
            <div class="input-prepend">
              <input type="text" id="folioBanco" name="folioBanco">
              <span class="add-on">
                <i class="icon-edit"></i>
              </span>
            </div>
            <div class="form-actions ">
              <button type="submit" class="btn btn-success"><i class="icon-thumbs-up-alt"></i> Aprobar</button>
              &nbsp; &nbsp; &nbsp;
              <g:link controller="comprobante" action="rechazarPago" params="[transactionId: "${pago?.transactionId}"]" ><button type="button" class="btn btn-danger"><i class="icon-reply bigger-150"></i></i> Rechazar</button></g:link>
            </div>
          </fieldset>
        </g:form>
        
      </div>

      <div class="span6">
        
        <h4>Descargar Comprobante</h4>
        <div class="widget-main">
          <div class="center">
            <span class="control-group warning">
              <span class="btn btn-large btn-info btn-mini" href="#">
                <i class="icon-file-text bigger-160"></i>
                Comporbante Pago
              </span>
              <span class=" help-inline pink">
                Comprobante adjuntado <strong> ${pago.lastUpdated.format('dd/MM/yyyy')} </strong>
              </span>
            </span>
          </div>
        </div>
        <div class="widget-header blue">
          <h4>Comprobante</h4>
        </div>
        <div class="widget-body">
          <div class="widget-main">
            <div class="center">
              <iframe class="cboxPhoto" src="${pago.comprobanteDePago.url()}"  width="100%" height="450px" ></iframe>  
            </div>
          </div>
        </div>

      </div>

    </div><!--/.row-fluid-->
  </div><!--/.container-->
</section>
</body>
</html>