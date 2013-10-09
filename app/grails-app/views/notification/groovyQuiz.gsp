<%@ page contentType="text/html"%>
<!DOCTYPE HTML>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<!-- Define Charset -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<!-- Responsive Meta Tag -->
<meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0;">

<!-- Page Title -->
<title> Mailer - Responsive Email Template </title>

<!-- Responsive Styles and Valid Styles -->
<style type="text/css">

 

body
{width: 100%; background-color: #ffffff; margin:0; padding:0; }
html
{width: 100%; }
.SecImage1 { width: 280px!important; height: 187px!important; }
.SizeHeadTable img {  width:580px !important; height:160px !important; }
.SecImage2  { width:180px !important; height:110px !important; } 
.SecImage2W Img  { width:180px !important; height:110px !important; } 
.SecImage1W Img { width: 280px!important; height: 187px!important; }
.Head2Image { width: 256px!important; height: 296px!important; }

.Head2ImageW img { width: 256px!important; height: 296px!important;  }
@media only screen and (max-width: 640px) {

body{ width:auto!important; }

/* Box Wrap */
.BoxWrap { width:440px !important;  }

/* Head  */
.HeaderTable { width:440px !important; margin:0 auto !important; }
.SizeHeadTable img {  width:440px !important;  height:220px !important;  }

.SizeHeadTable  {  width:440px !important; }
.HeadWrap  {  width:400px !important; }
.HeadTitle { font-size:22px !important;  }
.HeadTxt { font-size:15px !important; }
.Head2ImageW { width:440px !important; }
.Head2Image { width: 256px!important; height: 296px!important; margin:0 auto !important; }

/* Section 1  */
.SecTable1 { width:440px !important; }
.SecImage1  { width:440px !important; height:294px !important; } 
.SecImage1W Img { width:440px!important; height:294px!important; }


.SecTxt1 { width:400px !important;   padding:0 0 10px !important;  margin:0 auto !important; } 
.SecTitle1 { font-size:17px !important; }
.SecPrg1 { font-size:15px !important;  line-height:1.9 !important; } 

/* Screenshots  */
.screenshots { width:440px !important; }
.SecImage2  { width:440px !important; height:294px !important; } 
.SecImage2W Img  { width:440px !important; height:294px !important; } 

/* CTA  */
.CtaWrap { width:400px !important; padding:0 0 16px !important; }
.CtaTitle { width:400px !important; text-align:center !important; }
.CtaTitleImg { float:none; clear:both !important;   }
.CtaTitleW {  font-size:20px !important; width:380px!important; text-align:center !important; }
.CtaButton { float:none !important; padding:20px 0 0; }

/* Footer  */
.Footer1 { height:100px !important; }
.Footer1Wrap {width:440px !important;}
.Footer1Title {width:440px !important; text-align:center !important;}
.Footer1Social { width:280px !important; margin:0 auto !important; }
.Footer1SocialW { width:280px !important; margin:0 auto !important; }
.Footer2W {width:440px !important;}

/* Hide  */
.RespoHide { display:none !important; }

}
    


@media only screen and (max-width: 479px)  {

body{width:auto!important;}

/* Box Wrap */
.BoxWrap { width:280px !important;  }

/* Head  */
.HeaderTable { width:280px !important; margin:0 auto !important; }
.SizeHeadTable img {  width:280px !important; height:140px !important; }
.SizeHeadTable  {  width:280px !important; }
.HeadWrap  {  width:260px !important; }
.HeadTitle { font-size:18px !important;  }
.HeadTxt { font-size:13px !important; }
.date p img { width:15px; }
.date p { font-size:11px!important; line-height:14px !important; }
.Head2ImageW { width:260px !important; }
.Head2Image { width: 256px!important; height: 296px!important; margin:0 auto !important; }
.Head2Txt { width:260px !important; }
/* Section 1  */
.SecTable1 { width:280px !important; }
.SecImage1  { width:280px !important; height:187px !important; } 
.SecTxt1 { width:260px !important;   padding:0 0 10px !important;  margin:0 auto !important; } 
.SecTitle1 { font-size:15px !important; }
.SecPrg1 { font-size:13px !important; line-height:1.9 !important; } 
.SecImage1W Img { width:280px!important; height:187px!important; }


/* Screenshots  */
.screenshots { width:280px !important; }
.SecImage2  { width:280px !important; height:187px !important; } 
.SecImage2W Img  { width:280px !important; height:187px !important; } 


/* CTA  */
.CtaWrap { width:280px !important; padding:0 0 16px !important; }
.CtaTitle { width:280px !important; text-align:center !important; }
.CtaTitleImg { float:none; clear:both !important;   }
.CtaTitleW {  font-size:14px !important; width:280px!important; text-align:center !important; }
.CtaButton { float:none !important; padding:20px 0 0; }

/* Footer  */
.Footer1 { height:160px !important; }
.Footer1Td { text-align:center !important; line-height: 3.2 !important;  }
.Footer1Wrap {width:280px !important;}
.Footer1Title {width:280px !important; text-align:center !important;}
.Footer1Social { width:200px !important; margin:0 auto !important; }
.Footer1SocialW { width:200px !important; margin:0 auto !important; }
.Footer2W {width:280px !important;}
.Footer2T1 { font-size:9px !important; }
.Footer2T2 { }

.RespoShow { width:100% !important; height:20px !important; }
.BoxWrap2 { padding:0 0 30px !important; }
/* Hide  */
.RespoHide { display:none !important; } 

}
     
     


</style>

</head>

<body topmargin="0" marginheight="0" marginwidth="0" leftmargin="0">


<!-- Main Container -->
<table height="1000" bgcolor="#f6f6f6" width="100%" border="0" cellpadding="0" cellspacing="0" align="center">
    <tr>
    <td width="100%" valign="top">
       <!-- Header Start -->
       <table width="100%" border="0" cellpadding="0" cellspacing="0" align="center">
        <tbody><tr>
          <td width="100%" bgcolor="#ffffff">
          
            <!-- Start Header Content -->
            <table width="580" class="HeaderTable" border="0" cellpadding="0" cellspacing="0" align="center">
              <tbody><tr>
                <td width="580">
                  
                  <!-- Logo -->
                  <table border="0" cellpadding="0" cellspacing="0" align="left">
                    <tbody><tr>
                      <td height="14"></td>
                    </tr>
                    <tr>
                      <td height="50">
                        <img editable="true" mc:edit="logo" src="${grailsApplication.config.grails.serverURL}/mail/img/logo.jpg" alt="" border="0">
                      </td>
                    </tr>
                    <tr>
                      <td height="12" class="RespoHide"></td>
                    </tr>
                  </tbody></table>
                  
                  <!-- Date --><!--Eslogan Makingdevs-->
                  <table border="0" cellpadding="0" cellspacing="0" align="right">
                    <tbody><tr>
                      <td height="13"></td>
                    </tr>
                    <tr>
                      <td mc:edit="date" height="50" class="date" style="font-size: 13px; color: #272727; font-weight: light; text-align: right; font-family: Helvetica, Arial, sans-serif; line-height: 20px; vertical-align: middle;">
                      <h5>Making best code, through better developers.</h5>
                      <!--
                          <multiline><p> <img editable="true"  src="${grailsApplication.config.grails.serverURL}/mail/img/icon.jpg" style="float:left;" alt="" border="0">March <span style="color: #4f9dd3;">15</span>, 2013</p> </multiline>   
                      </td>
                      -->
                    </td></tr>
                    <tr>
                      <td height="12"></td>
                    </tr>
                  </tbody></table>

                                  
                </td>
              </tr>
            </tbody></table><!-- End Header Wrapper -->
            
          </td>
        </tr>
      </tbody></table><!-- End Header -->
      
      <table class="WideWrap" width="100%" border="0" cellpadding="0" cellspacing="0" align="center" style=" border-top:1px solid #ebebeb; ">
        <tbody><tr>
          <td width="100%" valign="top">
          
            <!-- Box Wrapper -->
            <table class="BoxWrap" width="580" border="0" cellpadding="0" cellspacing="0" align="center" style="margin:24px auto 0; background-color:#fff; border:1px solid #ebebeb;">
              
              <tbody><tr>
                <td>
                    <!-- Head Image -->
                    <table width="580" border="0" cellpadding="0" cellspacing="0" align="center" class="SizeHeadTable">
                       <tbody><tr>
                         <td width="580">
                       <a href="#"><img class="SizeHead" width="580" mc:edit="Head_Image" src="${grailsApplication.config.grails.serverURL}/mail/img/cuestionario.jpg" alt="" border="0"></a>
                       </td>
                     </tr>
                  </tbody></table><!-- Head Image -->
                </td>
              </tr>
            
                <tr>
                <td width="560">
                    <!-- Head Title and Text -->
                    <table width="560" class="HeadWrap" border="0" cellpadding="0" cellspacing="0" align="center">
                       <tbody><tr>
                         <td height="35">
                         </td>
                     </tr>
                    
                     <tr>
                         <td class="HeadTitle">
                         <a href="#" mc:edit="Head_Title" style=" font-size:16px; font-weight:800; font-family: Helvetica, Arial, sans-serif; text-decoration: none; color: #45484e">Bienvenido <span style="color:#4f9dd3;">${registration?.user?perfil?.nombreCompleto() ?: 'Nombre'}</span> al curso de <span style="color:#4f9dd3;">${registration?.scheduledCourse?.course?.name ?: 'curso'}</span></a>
                       </td>
                     </tr>
                     
                      <tr>
                         <td height="20">
                          
                       </td>
                     </tr>
                     
                       <tr>
                         <td class="HeadTxt" mc:edit="Head_Txt" height="35" style=" font-size:13px; line-height:1.9; font-weight:400; font-family: Helvetica, Arial, sans-serif; text-decoration: none; color: #7b7b7b; padding:0 0 30px;">
                         <p>
                          Sabemos que es importante estar preparado para comenzar a entrenar, es por esto que queremos ayudarte con esta evaluación que nos permitirá ayudarte a tener un mejor rendimiento al obtener conocimiento.</p>
                          <p>Se libre de contestar aquí mismo y nosotros te apoyaremos con los temas que desconozcas a través de vínculos a artículos, videos o podcast.</p>
                          </br>
                        <strong>¿Manejas un editor de texto para programar?</strong></br>
                        R:</br>
                        <strong>¿Qué editores de textos conoces, y cuál recomiendas para desarrollar?</strong></br>
                        R:</br>
                        <strong>¿Usas la línea de comando de tus sistema operativo?</strong></br>
                        R:</br>
                        <strong>¿Qué shell usas en tus sistema operativo?</strong></br>
                        R:</br>
                        <strong>¿Sabes compilar con el SDK de Java en línea de comando incluyendo librerías en el classpath?</strong></br>
                        R:</br>
                        <strong>¿Puedes dar un ejemplo de compilación de un archivo Java incluyendo alguna librería?</strong></br>
                        R:</br>
                        <strong>¿Cuáles son las características principales del lenguaje Java?</strong></br>
                        R:</br>
                        <strong>¿Cuáles serían las librerías más comunes que usas en Java?</strong></br>
                        R:</br>
                        <strong>¿Qué es una interfaz y para que sirve?</strong></br>
                        R:</br>
                        <strong>¿Que son las clases internas anónimas?</strong></br>
                        R:</br>
                        <strong>Describe: ¿qué es la convención de Java Beans?</strong></br>
                        R:</br>
                        <p style="text-align:center;">
                        Muchas gracias por tu preferencia.<br/>
                          <strong>
                            Atentamente<br/>
                            El equipo de MakingDevs
                          </strong>
                        </p>
                       </td>
                     </tr>
                     
                  </tbody></table><!-- Head Title and Text -->
                </td>
              </tr>
              
            </tbody></table><!-- End Box Wrapper -->
        
          </td>
        </tr>
           
      </tbody></table>
      
      
      <!-- Section3 - Wide Wrap -->
      <table class="WideWrap" width="100%" border="0" cellpadding="0" cellspacing="0" align="center">
        <tbody><tr>
          <td width="100%" valign="top">
          
            <!-- Box Wrapper -->
            <table class="BoxWrap2" width="100%" border="0" cellpadding="0" cellspacing="0" align="center" style=" padding:0 0 30px; margin:24px auto 0; background-color:#fff; border-top:1px solid #ebebeb; border-bottom:1px solid #ebebeb;  ">
              
              <tbody><tr>
                <td>
                   
                   <!-- Section1 Image -->
                  <table align="center" width="580" cellpadding="0" cellspacing="0" bgcolor="#ffffff" border="0" class="screenshots">
                    <tbody><tr>
                      <td valign="top" align="right"></td>
                    </tr>
                    <tr>
                      <td valign="top" align="right" bgcolor="#ffffff">
                        
                        <table class="ScrnTitle" align="left" width="100%" border="0" cellpadding="0" bgcolor="#ffffff" cellspacing="0">
                          <tbody><tr> 
                              <td width="0" height="20" style="font-size: 0;line-height: 0;border-collapse: collapse;"><p>&nbsp;</p>  </td> 
                          </tr>
                          
                          <tr> 
                            <td width=" 100%" height="50" style="font-size: 15px; color: #45484E; font-weight: bold; text-align: left; font-family: Helvetica, Arial, sans-serif; line-height: 30px; vertical-align: top;">
                            
                              <a mc:edit="Scr_Title" href="http://mailers.makingdevs.com/septiembre_2013/#" style="text-decoration: none; color: #45484E"><img style="float:left;" src="${grailsApplication.config.grails.serverURL}/mail/img/icon2.jpg" alt=""><multiline>Visita <span style="color:#4f9dd3;">nuestras</span> comunidades</multiline></a>    
                            </td>
                          </tr>
                        </tbody></table>
                        <!--Primera imagen-->
                        <table align="left" border="0" cellpadding="0" bgcolor="#ffffff" cellspacing="0">
                          <tbody><tr>
                            <td style="text-align: center; " width="180" height="110" class="SecImage2W">
                            
                              <a href="http://artesanos.de/"><img editable="true" width="180" height="110" mc:edit="Sec_Image2" src="${grailsApplication.config.grails.serverURL}/mail/img/image4.jpg" alt="" border="0" style="  width: 180px; height: 110px; display: block;" class="SecImage2"></a>
                            </td>
                          </tr>
                        </tbody></table>
                        
                        <table class="RespShow" width="20" border="0" cellpadding="0" cellspacing="0" align="left" style="font-size: 0;line-height: 0;border-collapse: collapse;">
                                 <tbody><tr>
                                  <td width="0" height="30" style="font-size: 0;line-height: 0;border-collapse: collapse;"><p>&nbsp;</p>                                
                                    </td>
                                   </tr>
                              </tbody></table>

                        <!--Segunda imagen-->
                        <table align="left" border="0" cellpadding="0" bgcolor="#ffffff" cellspacing="0">
                          <tbody><tr>
                            <td style="text-align: center; " width="180" height="110" class="SecImage2W">
                            
                              <a href="http://recursivo.org/"><img editable="true" width="180" height="110" mc:edit="Sec_Image2" src="${grailsApplication.config.grails.serverURL}/mail/img/image3.jpg" alt="" border="0" style="  width: 180px; height: 110px; display: block;" class="SecImage2"></a>
                            </td>
                          </tr>
                        </tbody></table>
                        
                        <table class="RespoShow" width="20" border="0" cellpadding="0" cellspacing="0" align="left" style="font-size: 0;line-height: 0;border-collapse: collapse;">
                                 <tbody><tr>
                                  <td width="0" height="30" style="font-size: 0;line-height: 0;border-collapse: collapse;"><p>&nbsp;</p>                                
                                    </td>
                                   </tr>
                              </tbody></table>
                        
                        <!--Tercera imagen-->
                        <table align="left" border="0" cellpadding="0" bgcolor="#ffffff" cellspacing="0">
                          <tbody><tr>
                            <td style="text-align: center; " width="180" height="110" class="SecImage2W">
                            
                              <a href="http://grails.org.mx/"><img editable="true" width="180" height="110" mc:edit="Sec_Image2" src="${grailsApplication.config.grails.serverURL}/mail/img/image5.jpg" alt="" border="0" style="  width: 180px; height: 110px; display: block;" class="SecImage2"></a>
                            </td>
                          </tr>
                        </tbody></table>

                        <table class="ScrnTitle" align="left" width="100%" border="0" cellpadding="0" bgcolor="#ffffff" cellspacing="0">
                          <tbody><tr> 
                              <td width="0" height="20" style="font-size: 0;line-height: 0;border-collapse: collapse;"><p>&nbsp;</p>  </td> 
                          </tr>
                        </tbody></table>

                        <!--Cuarta imagen-->
                        <table align="left" border="0" cellpadding="0" bgcolor="#ffffff" cellspacing="0">
                          <tbody><tr>
                            <td style="text-align: center; " width="180" height="110" class="SecImage2W">
                            
                              <a href="http://springhispano.org/"><img editable="true" width="180" height="110" mc:edit="Sec_Image2" src="${grailsApplication.config.grails.serverURL}/mail/img/image6.jpg" alt="" border="0" style="  width: 180px; height: 110px; display: block;" class="SecImage2"></a>
                            </td>
                          </tr>
                        </tbody></table>

                        <table class="RespShow" width="20" border="0" cellpadding="0" cellspacing="0" align="left" style="font-size: 0;line-height: 0;border-collapse: collapse;">
                                 <tbody><tr>
                                  <td width="0" height="30" style="font-size: 0;line-height: 0;border-collapse: collapse;"><p>&nbsp;</p>                                
                                    </td>
                                   </tr>
                              </tbody></table>

                              <!--Quinta imagen-->
                        <table align="left" border="0" cellpadding="0" bgcolor="#ffffff" cellspacing="0">
                          <tbody><tr>
                            <td style="text-align: center; " width="180" height="110" class="SecImage2W">
                            
                              <a href="http://vivecodigo.org/"><img editable="true" width="180" height="110" mc:edit="Sec_Image2" src="${grailsApplication.config.grails.serverURL}/mail/img/image7.jpg" alt="" border="0" style="  width: 180px; height: 110px; display: block;" class="SecImage2"></a>
                            </td>
                          </tr>
                        </tbody></table>

                        <table class="RespShow" width="20" border="0" cellpadding="0" cellspacing="0" align="left" style="font-size: 0;line-height: 0;border-collapse: collapse;">
                                 <tbody><tr>
                                  <td width="0" height="30" style="font-size: 0;line-height: 0;border-collapse: collapse;"><p>&nbsp;</p>                                
                                    </td>
                                   </tr>
                              </tbody></table>

                              <!--Sexta imagen-->
                        <table align="left" border="0" cellpadding="0" bgcolor="#ffffff" cellspacing="0">
                          <tbody><tr>
                            <td style="text-align: center; " width="180" height="110" class="SecImage2W">
                            
                              <a href="http://scala-mug.org/"><img editable="true" width="180" height="110" mc:edit="Sec_Image2" src="${grailsApplication.config.grails.serverURL}/mail/img/image8.jpg" alt="" border="0" style="  width: 180px; height: 110px; display: block;" class="SecImage2"></a>
                            </td>
                          </tr>
                        </tbody></table>


                        
                      </td>

                    </tr>
                    
                  </tbody></table><!-- End Section1 Image -->
                 
                </td>
              </tr>
              
            </tbody></table><!-- End Box Wrapper -->
        
          </td>
        </tr>
           
      </tbody></table><!-- End Section3 Basic Wrapper -->

      <!-- Cta Wide Wrap -->
      <table class="WideWrap" width="100%" border="0" cellpadding="0" cellspacing="0" align="center">
        <tbody><tr>
          <td width="100%" valign="top">
          
            <!-- Box Wrapper -->
            <table class="BoxWrap" width="580" border="0" cellpadding="0" cellspacing="0" align="center" style="margin:24px auto 24px; background-color:#fff; border:1px solid #ebebeb;">
              
              <tbody><tr>
                <td valign="top" height="20" align="center" bgcolor="#ffffff"></td>
              </tr>
                    
              <tr>
                <td>
                                <table width="540" border="0" cellpadding="0" cellspacing="0" align="center" class="CtaWrap">
                     <tbody><tr>
                      <td>
                     <table width="60%" border="0" cellpadding="0" cellspacing="0" align="left" class="CtaTitle">
                             <tbody><tr>
                               <td style="float:left; font-size: 15px; color: #45484E; font-weight: bold; text-align: left; font-family: Helvetica, Arial, sans-serif; line-height: 2.8; vertical-align: top;">
                                                       <table width="55" border="0" cellpadding="0" cellspacing="0" align="left" class="CtaTitle">
                                  <tbody><tr>
                                  <td mc:edit="Icon3">
                                 <img editable="true" src="${grailsApplication.config.grails.serverURL}/mail/img/icon3.jpg" alt="">
                                  </td>
                                  </tr>
                             </tbody></table>
                             <table border="0" cellpadding="0" cellspacing="0" align="left" class="CtaTitle">
                                  <tbody><tr>
                                  <td>
                                 <a href="http://makingdevs.com/" mc:edit="ctatitle" class="CtaTitleW" style="text-decoration: none; color: #45484E"><multiline>¿Quieres saber <span style="color:#4f9dd3;">mas</span> de nosotros?</multiline></a>
                                  </td>
                                  </tr>
                             </tbody></table>
                               </td>
                                             </tr>
                       <tr>
                               <td class="" style="float:left; font-size: 15px; color: #45484E; font-weight: bold; text-align: left; font-family: Helvetica, Arial, sans-serif; line-height: 2.8; vertical-align: top;">
                                                    
                               </td>
                                             </tr>
                         </tbody></table>
                  <table width="30%" border="0" cellpadding="0" cellspacing="0" align="right" class="CtaTitle">
                    <tbody><tr>
                      <td>
                    <a mc:edit="ctabutton" href="http://makingdevs.com/" style="text-decoration: none; color: #45484E"><img editable="true" class="CtaButton" style="float:left;" src="${grailsApplication.config.grails.serverURL}/mail/img/button2.jpg" alt=""> </a>
                    </td>
              
                  </tr>
                </tbody></table>
                    </td>
                   </tr>
                </tbody></table>
                </td>
              </tr>
              
            </tbody></table><!-- End Box Wrapper -->
        
          </td>
        </tr>
           
      </tbody></table><!-- End Cta Basic Wrapper -->
      
       <!-- Footer Wide Wrap -->
      <table class="WideWrap" width="100%" border="0" cellpadding="0" cellspacing="0" align="center">
        <tbody><tr>
          <td width="100%" valign="top">
          
            <!-- Footer1 Background -->
            <table height="60" class="Footer1" width="100%" border="0" style="background-color:#45484e;" cellpadding="0" cellspacing="0" align="center">
                 <tbody><tr>
               <td>
               <table class="Footer1Wrap" width="580" border="0" cellpadding="0" cellspacing="0" align="center">
                  <tbody><tr>
                     <td>
                    <table width="462" border="0" cellpadding="0" cellspacing="0" align="left" class="Footer1Title">
                    <tbody><tr>
                      <td class="Footer1Td" style=" font-weight:400; font-size: 12px; color: #b2b3b6; font-weight: bold; text-align: left; font-family: Helvetica, Arial, sans-serif; line-height: 2.8; vertical-align: top;">
                               
                    <a mc:edit="Footer1T" href="http://mailers.makingdevs.com/septiembre_2013/#" style=" font-weight:400; text-decoration: none; color: #b2b3b6"><multiline> No olvides <b style="color:#fff;  font-weight:600;"> compartir </b> este correo con tus amigos y seguirnos en los Social Medias </multiline></a>
                    </td>
              
                  </tr>
                </tbody></table>
                  <table width="118" border="0" cellpadding="0" cellspacing="0" align="right" class="Footer1Social">
                    <tbody><tr>
                      <td class="Footer1SocialW" mc:edit="SocialI">
                    <a href="https://www.facebook.com/makingdevs" style="float:left; text-decoration: none; color: #45484E"><img editable="true" style="float:left;" src="${grailsApplication.config.grails.serverURL}/mail/img/social1.jpg" alt=""> </a>
                    <a href="https://twitter.com/makingdevs" style="float:left; text-decoration: none; color: #45484E"><img editable="true" style="float:left;" src="${grailsApplication.config.grails.serverURL}/mail/img/social2.jpg" alt=""> </a>
                    <!--<a href="#" style="float:left; text-decoration: none; color: #45484E"><img editable="true" style="float:left;" src="${grailsApplication.config.grails.serverURL}/mail/img/social3.jpg" alt="" /> </a>-->
                    </td>
              
                  </tr>
                </tbody></table>
                   </td>
                </tr>
               </tbody></table>
               </td>
                             </tr>               
                        </tbody></table><!-- Footer1 Background -->
        
                      <!-- Footer2 Background -->
            <table height="96" class="Footer2" width="100%" border="0" style="background-color:#313337;" cellpadding="0" cellspacing="0" align="center">
                 <tbody><tr>
               <td>
               <table width="580" border="0" cellpadding="0" cellspacing="0" align="center" class="Footer2W">
                  <tbody><tr>
                     <td>
                    <table border="0" cellpadding="0" cellspacing="0" align="center">
                      <tbody><tr>
                <td valign="top" height="20" align="center"></td>
              </tr>
                    <!--<tr>
                      <td mc:edit="Footer2T" align="center" class="Footer2T1" style=" font-weight:400; font-size: 12px; color: #b2b3b6; font-weight: bold; text-align: left; font-family: Helvetica, Arial, sans-serif; line-height: 1; vertical-align: top;">
                    <multiline>          
                    <p  style=" font-weight:400; text-decoration: none; color: #b2b3b6">  <img alt="" src="${grailsApplication.config.grails.serverURL}/mail/img/icon4.jpg" /> <b style="color:#fff;  font-weight:600;"> Having problems? </b>  <a href="#" style="font-weight:600; text-decoration: none;  color:#4f9dd3"> view it online</a> or <a href="#" style="font-weight:600; text-decoration: none;  color:#4f9dd3"> unsubscribe </a> instantly</p></multiline>
                    </td>
              
                  </tr>
                  -->
                </tbody></table>
                  <table border="0" cellpadding="0" cellspacing="0" align="center">
                    <tbody><tr>
                      <td class="Footer2T2" mc:edit="copyright" style="font-weight:400; font-size: 12px; color: #b2b3b6; font-weight: bold; text-align: left; font-family: Helvetica, Arial, sans-serif; line-height: 1; vertical-align: top;">
                     <p><multiline> © 2013 Makingdevs.com All rights reserved </multiline> </p>
                    </td>
              
                  </tr>
                </tbody></table>
                   </td>
                </tr>
               </tbody></table>
               </td>
                             </tr>               
                        </tbody></table><!-- Footer1 Background -->
            
          </td>
        </tr>
           
      </tbody></table><!-- End Footer Basic Wrapper -->
      
    </td>
  </tr> 
</table>

</body>
</html>