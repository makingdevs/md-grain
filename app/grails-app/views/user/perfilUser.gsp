<!DOCTYPE html>
<html>
  <head>
    <meta name="layout" content="veneraWithoutFooter"/>
    <title>Edición de datos</title>
    <r:require modules="perfil"/>
  </head>
  <body>
  <div id="fondo">
    <div class="container">
      <div class="row-fluid">
        <div class="span12" id="cabezera">
          <div class="span12" id="logo">
            <h2 id="usuario">${usuarioActualName}</h2>
          </div>
        </div>
      </div>

      <div class="row-fluid" id="cuerpo">
        <div class="span4" id="contenedorIzquierdo">
          <div id="label1"></div>
          <div id="label2"></div>
          <div id="questionable">
            <g:showQuestionaryForThisUser currentUser="${usuarioActual}"/>
          </div>
        </div>

        <div class="span8" id="contenedorDerecho">
          <g:render template="piedritas1"/>
        </div>
      </div>
      <div class="row-fluid" id="questionableResponsive">
        <g:showQuestionaryForThisUser currentUser="${usuarioActual}"/>
      </div>

      <div class="row-fluid">
        <div id="separador" class="span12"></div>
      </div>

      <div class="row-fluid" id="pie">
        <div class="span4" id="escudo"></div>
        <div class="span4" id="estrellitas"></div>
        <div class="span4" id="estrella"></div>
        <div id="iconos"></div>
        <p id="facebook"><a class="colorLink" href="https://www.facebook.com/makingdevs">facebook.com/makingdevs</a></p>
        <p id="twitter"><a class="colorLink" href="https://twitter.com/makingdevs">twitter.com/makingdevs</a></p>
        <p id="youtube"><a class="colorLink" href="http://www.youtube.com/channel/UCgihnSms46sj_ip5GMw1GFw">youtube.comm/makingdevs</a></p>
      </div>
    </div> 
  </div>
  </body>
</html>