<html>
  <head>
  <meta name="layout" content="venera"/>
  <r:require module="upload" />
  <r:script>
    $(function() {
      var urlValue = $("input#url").val() 
        Dropzone.options.dropzone = {
        url : urlValue
        };
    });
  </r:script>
  </head>
    <body>
      <input type="hidden" value="${createLink(controller:'paymentReceipt', action:'uploadReceipt', id: pago.id)}" id="url" />
      <section class='section-wrapper stripped'>
        <div class="container">
          <div class="page-header position-relative  ">
            <h1><i class="icon-money"></i> · Comprobante de pago </h1>
          </div><!--/.page-header-->
          <div class="row-fluid">
            <div class="span12">
              <!--PAGE CONTENT BEGINS-->
              <div class="row-fluid">
                <div class="span12 widget-container-span">
                  <g:link mapping="myPayments" class="btn btn-primary">
                    Mi lista de pagos
                  </g:link><br/><br/>
                  <div class="widget-box">
                    <div class="widget-body">
                      <div class="widget-main no-padding">
                        <table class="table table-striped table-bordered table-hover">
                          <thead>
                            <tr>
                              <th>Concepto</th>
                              <th>Monto</th>
                              <th class=" green">
                                Descuento
                              </th>
                              <th class=" green">
                                Total con Descuento
                              </th>
                              <th>F. Vencimiento</th>
                              <th>Status de pago</th>
                            </tr>
                          </thead>
                          <tbody>
                            <tr>
                              <td>${pago.conceptoDePago}</td>
                              <td>$ ${pago.cantidadDePago}</td>
                              <td>$ ${pago.descuentoAplicable}</td>
                              <td>$ ${pago.cantidadDePago - pago.descuentoAplicable}</td>
                              <td>${pago.fechaDeVencimiento.format('dd-MMM-yyyy')}</td>
                              <td>
                                <span class="label label-info">
                                  ${pago.estatusDePago}
                                </span>
                              </td>
                            </tr>
                          </tbody>  
                        </table>
                      </div>
                    </div>
                  </div>
                </div><!--/span-->
              </div>
              <div class="row-fluid">
                <div class="span12">
                  <div class="span1">         
                  </div>
                  <div class="span9">
                    <div class="widget-box">
                      <div class="widget-header widget-header-small ">
                        <h4>Comprobante</h4>
                      </div>
                      <div class="widget-body">
                        <div class="widget-main">
                          <div class="center">
                            <g:if test="${pago.comprobanteDePago}">
                              <iframe class="cboxPhoto" src="${pago.comprobanteDePago.url()}"  width="100%" height="450px" ></iframe>  
                            </g:if>
                            <g:else>
                              <div id="dropzone" class="dropzone">
                            </g:else>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>              
                  </div>  
                </div><!--/.span-->
              </div>
                <hr>  
            </div>
          </div><!--/.row-fluid-->
        </div><!--/.page-content-->
      </section>

      <script type="text/javascript">
        window.jQuery || document.write("<script src='assets/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
      </script>
    </body>
</html>