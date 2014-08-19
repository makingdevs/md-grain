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
          word-wrap: break-word;
        }
      }
    </style>
  </head>
  <body>
  <div class="row">
    <div align="justify" style="font-size:12px; padding: 0px 20px;">
      ¡Bienvenido! 
      <br/>
      
      Te has registrado al curso: <b>${scheduledCourse?.course.name}</b> que inicia el día <b><g:formatDate format="dd-MM-yyyy" date="${scheduledCourse?.beginDate}" /></b> 
      <br/>
      El costo del curso es de ${scheduledCourse?.esquemaDePago.cantidadDePago}.
       
    </div>
  </div>
  </body>
</html> 
