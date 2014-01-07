<!DOCTYPE HTML>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <!-- Define Charset -->
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <!-- Responsive Meta Tag -->
  <meta name="viewport" content="initial-scale=1.0; maximum-scale=1.0;">
  <!-- Page Title -->
  <title> Mailer - Responsive Email Template </title>
  <!-- Responsive Styles and Valid Styles -->
  <style type="text/css">
    body
    {width: 100%; background-color: #ffffff; margin:0; padding:0; }
    html
    {width: 100%; }
    @media only screen and (max-width: 640px) {
      body{ width:auto!important; }
      
    }
    @media only screen and (max-width: 479px)  {
      body{width:auto!important;}
      
      .primero { 
        word-wrap: break-word; }
      }
    </style>
  </head>
  <body topmargin="0" marginheight="0" marginwidth="0" leftmargin="0">
    <!-- Contenido -->
    <table class="WideWrap" height="1000" bgcolor="#f6f6f6" width="100%" border="0" cellpadding="0" cellspacing="0" align="center">
      <tr>
        <td width="100%" valign="top">
          <!-- Encabezado -->
          <table class="WideWrap" width="100%" style="background-color:black;" border="0" cellpadding="0" cellspacing="0" align="center">
            <tbody>
              <tr>
                <td width="100%">
                  <!--Contenido Encabezado -->
                  <table class="WideWrap" width="580" class="HeaderTable" border="0" cellpadding="0" cellspacing="0" align="center">
                    <tbody>
                      <tr>
                        <td width="580">
                          <!-- Logo -->
                          <table border="0" cellpadding="0" cellspacing="0" align="left">
                            <tbody>
                              <tr>
                                <td height="14"></td>
                              </tr>
                              <tr>
                                <td height="20">
                                  <font color="white" font size="2" style="font-family:Arial;">
                                    Queremos que seas un mejor desarrollador de software...
                                  </font>
                                </td>
                              </tr>
                              <tr>
                                <td height="12" class="RespoHide"></td>
                              </tr>
                            </tbody>
                          </table>
                          <!--Iconos redes-->
                          <table border="0" cellpadding="0" cellspacing="0" align="right">
                            <tbody>
                              <tr>
                                <td height="7"></td>
                              </tr>
                              <tr>
                                <td mc:edit="date" height="15px" class="date" style="font-size: 13px; color: #272727;">
                                  <a href="https://www.facebook.com/makingdevs" target="_blank"><img src="${grailsApplication.config.grails.serverURL}/mail/new/facebook.gif" height="36px"   width="30px" ></a>
                                  <a href="https://twitter.com/makingdevs" target="_blank"><img src="${grailsApplication.config.grails.serverURL}/mail/new/twiiter.gif" height="37" width="  31px"></a>
                                </td>
                              </tr>
                              <tr>
                                <td height="1"></td>
                              </tr>
                            </tbody>
                          </table>                
                        </td>
                      </tr>
                    </tbody>
                  </table><!--Fin Contenido Encabezado-->
                </td>
              </tr>
            </tbody>
          </table><!-- Fin Encabezado -->
          <!--Contenido-->
          <table  class="WideWrap" width="100%" border="0" cellpadding="0" cellspacing="0" align="center">
            <tbody>
              <tr>
                <td width="100%" valign="top">
                  <!-- Box Wrapper -->
                  <table class="WideWrap" width="580" border="0" cellpadding="0" cellspacing="0" align="center" style="background-color:#F6FAFD;">
                    <tbody>
                      <tr>
                        <td>
                          <!--Ecabezado-->
                          <table width="580" border="0" cellpadding="0" cellspacing="0" align="center">
                            <tbody>
                              <tr>
                                <td width="580">
                                  <a href="#"><img  width="580" mc:edit="Head_Image" src="${grailsApplication.config.grails.serverURL}/mail/new/encabezado.gif" alt="" border="0"></a>
                                </td>
                              </tr>
                            </tbody>
                          </table><!--Fin de encabezado-->
                        </td>
                      </tr>
                      <tr>
                        <td width="580">
                          <!-- Cajas de texto -->
                          <table width="580" border="0" cellpadding="0" cellspacing="0" align="center" style="font-size:15px; font-family:Arial; ">
                            <tbody>
                              <tr>
                                <td height="10px"></td>
                              </tr>
                              <tr>
                                <td align="center" style="color:#ffffff; background: #88bfe8; /* Old browsers */
background: -moz-linear-gradient(top, #88bfe8 0%, #70b0e0 100%); /* FF3.6+ */
background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#88bfe8), color-stop(100%,#70b0e0)); /* Chrome,Safari4+ */
background: -webkit-linear-gradient(top, #88bfe8 0%,#70b0e0 100%); /* Chrome10+,Safari5.1+ */
background: -o-linear-gradient(top, #88bfe8 0%,#70b0e0 100%); /* Opera 11.10+ */
background: -ms-linear-gradient(top, #88bfe8 0%,#70b0e0 100%); /* IE10+ */
background: linear-gradient(to bottom, #88bfe8 0%,#70b0e0 100%); /* W3C */
filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#88bfe8', endColorstr='#70b0e0',GradientType=0 ); /* IE6-9 */; margin:10px;">
                                  <h2>
                                    Aprovecha hasta un <g:formatNumber number="${esquemaDePago.descuentos*.porcentaje.sum()}" format="###" /> % de descuento
                                  </h2>
                                </td>
                              </tr>
                              <tr>
                                <td height="10px"></td>
                              </tr>
                              <tr>
                                <td colspan="2">
                                  <table style="padding:0 10px;">
                                    <g:each in="${scheduledCourseList}" var="sc">
                                      <tr>
                                        <td>
                                          <h1 style="color: #046290; padding: 3px 0px; border: 0px 0px; margin:0px; font-size:20px;">
                                            ${sc.course.name}
                                          </h1>
                                          <h3 style="padding: 3px 10px; border: 0px; margin:0px; background-color:#0578A9; color: #FFFFFF; font-size:13px;">
                                            Inicia el <g:formatDate date="${sc.beginDate}" format="dd 'del' MMMM 'de' yyyy"/> con duración de ${sc.durationInHours} hrs.
                                          </h3>
                                          <p class="primero" align="justify" style="font-size:12px;">
                                            <img alt="image" src="${grailsApplication.config.grails.serverURL}/mail/new/${sc.course.courseKey.toLowerCase()}.gif" style="border: 0px solid ;" align="left" hspace="10">
                                            ${sc.course.overview.substring(0,sc.course.overview.indexOf('<br>'))}
                                          </p>
                                          </td>
                                      </tr>
                                      <tr>
                                        <td colspan="2" align="center"><img src="${grailsApplication.config.grails.serverURL}/mail/new/separador.gif" width="300px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="http://makingdevs.com" target="_blank"><img src="${grailsApplication.config.grails.serverURL}/mail/new/boton.gif"></a></td>
                                      </tr>
                                      <tr>
                                        <td height="10px"></td>
                                      </tr>
                                    </g:each>
                                  </table>
                                </td>
                              </tr>
                            </tbody>
                          </table><!-- Fin cajas texto -->
                        </td>
                      </tr>
                    </tbody>
                  </table><!-- End Box Wrapper -->
                </td>
              </tr>  
            </tbody>
          </table><!--Fin Contenido-->
          <!--Footer-->
          <table bgcolor="#d2e6f4" width="580" border="0px" cellpadding="0px" cellpadding="0" cellspacing="0px" align="center" style="padding:0; border-collapse:collapse; border-spacing:0px;">
            <tbody>
              <tr>
                <td width="580" >
                  <img  width="580" mc:Head"_Image" src="${grailsApplication.config.grails.serverURL}/mail/new/footer1.gif" border="0" usemap="#redes">
                  <map name="redes">
                    <area shape="rect" coords="455,40,505,60" target="_blank" style="outline: 0;" href="https://twitter.com/makingdevs">
                    <area shape="rect" coords="520,40,555,60" href="https://www.facebook.com/makingdevs" style="outline: 0;" target="_blank">
                  </map>
                </td>
              </tr>
              <tr>
                <td bgcolor="#d2e6f4" mc:edit="copyright" style="font-weight:400; font-size: 13px; color: #0081C0; font-weight: bold; text-align: left; font-family: Helvetica, Arial, sans-serif; line-height: 1; vertical-align: middle;">
                  <table>
                    <tr align="center">
                      <td width="190px" ><p><multiline> © 2014 Makingdevs.com</multiline></p></td>
                      <td width="190px" ><img src="${grailsApplication.config.grails.serverURL}/mail/new/logo.gif"></td>
                      <td width="190px" ><p><multiline> All rights reserved </multiline></p></td>
                    </tr>
                  </table>
                </td>
              </tr>
            </tbody>
          </table><!--Fin de barra footer-->
        </td>
      </tr> 
    </table><!--Fin Contenido-->
  </body>
  </html>