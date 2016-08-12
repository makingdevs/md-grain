<%@ page contentType="text/html"%>
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
  <table class="WideWrap" height="500" bgcolor="#f6f6f6" width="100%" border="0" cellpadding="0" cellspacing="0" align="center">
    <tr>
      <td width="100%" valign="top">
        <table class="WideWrap" width="100%" style="background-color:black;" border="0" cellpadding="0" cellspacing="0" align="center">
          <tbody>
              <tr>
                <td width="100%">
                  <table class="WideWrap" width="580" class="HeaderTable" border="0" cellpadding="0" cellspacing="0" align="center">
                    <tbody>
                      <tr>
                        <td width="580">
                          <table border="0" cellpadding="0" cellspacing="0" align="left">
                            <tbody>
                              <tr>
                                <td height="14"></td>
                              </tr>
                              <tr>
                                <td height="20">
                                  <font color="white" font size="2" style="font-family:Arial;">
                                    ${nombre},
                                  </font>
                                </td>
                              </tr>
                              <tr>
                                <td style="font-size:15px;color:#808B96">Ya estas registrado en el curso:</td>
                                <td height="12" class="RespoHide"></td>
                              </tr>
                            </tbody>
                          </table>
                          <table border="0" cellpadding="0" cellspacing="0" align="right">
                            <tbody>
                              <tr>
                                <td height="7"></td>
                              </tr>
                              <tr>
                                <td mc:edit="date" height="15px" class="date" style="font-size: 13px; color: #272727;">
                                  <a href="https://www.facebook.com/makingdevs" target="_blank"><img src="${grailsApplication.config.grails.serverURL}/mail/new/facebook.png"></a>
                                  <a href="https://twitter.com/makingdevs" target="_blank"><img src="${grailsApplication.config.grails.serverURL}/mail/new/twitter.png"></a>
                                  <a href="http://www.youtube.com/channel/UCgihnSms46sj_ip5GMw1GFw" target="_blank"><img src="${grailsApplication.config.grails.serverURL}/mail/new/youtube.png"></a>
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
                  </table>
                </td>
              </tr>
          </tbody>
        </table>
        <table  class="WideWrap" width="100%" border="0" cellpadding="0" cellspacing="0" align="center">
          <tbody>
            <tr>
              <td width="100%" valign="top">
                <table class="WideWrap" width="580" border="0" cellpadding="0" cellspacing="0" align="center" style="background-color:#F6FAFD;">
                    <tbody>
                      <tr>
                        <td width="580">
                          <table width="580" border="0" cellpadding="0" cellspacing="0" align="center" style="font-size:15px; font-family:Arial; ">
                            <tbody>
                              <tr>
                                <td colspan="2">
                                  <table style="padding:0 10px;">
                                      <tr>
                                        <td>
                                          <h1 style="color: #046290; padding: 3px 0px; border: 0px 0px; margin:0px; font-size:20px; ">
                                            <a href="${grailsApplication.config.grails.serverURL}/training/${scheduledCourse?.course?.courseKey?.toLowerCase()}" style="color: #046290;text-decoration:none;">
                                              ${scheduledCourse?.course?.name}
                                            </a>
                                          </h1>
                                          <h3 style="padding: 3px 10px; border: 0px; margin:0px; background-color:#0578A9; color: #FFFFFF; font-size:13px;">
                                            Inicia el <g:formatDate date="${scheduledCourse?.beginDate}" format="dd 'del' MMMM 'de' yyyy"/> con duración de ${scheduledCourse?.durationInHours} hrs.
                                          </h3>
                                          <p class="primero" align="justify" style="font-size:12px;">
                                            <a href="${grailsApplication.config.grails.serverURL}/training/${scheduledCourse?.course?.courseKey?.toLowerCase()}" style="text-decoration:none;">
                                              <img alt="image_${scheduledCourse?.course?.courseKey?.toLowerCase()}" src="${grailsApplication.config.grails.serverURL}/mail/new/${scheduledCourse?.course?.courseKey?.toLowerCase()}.png" style="border: 0px solid ;" align="left" hspace="10" width="98">
                                            </a>
                                            <g:set var="overview" value="${scheduledCourse?.course?.overview}" />
                                            <g:if test="${overview}">
                                              ${overview.substring(0,overview.indexOf('<br>')>0?overview.indexOf('<br>'):overview.size())}
                                            </g:if>

                                          </p>
                                          <p style="font-size:13px;">
                                            <strong>
                                            <a style="text-decoration:none; color:#88bfe8;" href="${grailsApplication.config.grails.serverURL}/training/${scheduledCourse?.course?.courseKey?.toLowerCase()}">Más información...</a>
                                            </strong>
                                          </p>
                                          </td>
                                      </tr>
                                      <tr>
                                        <td colspan="2" align="center">
                                          <img src="${grailsApplication.config.grails.serverURL}/mail/new/separador.png" width="300px">
                                        </td>
                                      </tr>
                                      <tr>
                                        <td height="10px"></td>
                                      </tr>
                                  </table>
                                </td>
                              </tr>
                            </tbody>
                          </table>
                        </td>
                      </tr>
                    </tbody>
                </table>
              </td>
            </tr>  
          </tbody>
        </table>
          <!--Footer-->
          <table bgcolor="#d2e6f4" width="580" border="0px" cellpadding="0px" cellpadding="0" cellspacing="0px" align="center" style="padding:0; border-collapse:collapse; border-spacing:0px;">
            <tbody>
              <tr>
                <td bgcolor="#d2e6f4" mc:edit="copyright" style="font-weight:400; font-size: 13px; color: #0081C0; font-weight: bold; text-align: left; font-family: Helvetica, Arial, sans-serif; line-height: 1; vertical-align: middle;">
                  <table>
                    <tr align="center">
                      <td width="190px" ><p><multiline> © 2015 Makingdevs.com</multiline></p></td>
                      <td width="190px" ><img src="${grailsApplication.config.grails.serverURL}/mail/new/logo.gif"></td>
                      <td width="190px" ><p><multiline> Making best code through better developers </multiline></p></td>
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