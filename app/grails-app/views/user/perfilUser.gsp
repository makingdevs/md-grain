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
            <g:if test="${usuarioActualName.length() > 25}">
              <h2 class="nombreUsuario">
            </g:if>
            <g:else>
               <h2 class="usuario">
            </g:else>
            ${usuarioActualName}</h2>
          </div>
        </div>
      </div>

      <div class="row-fluid" id="cuerpo">
        <div class="span4" id="contenedorIzquierdo">
          <div id="label1"></div>
          <div id="label2"></div>
          <div id="datos">
            <g:render template="../perfil/header" model="[usuarioActual:usuarioActual]"/>
            <i class="icon-time"> Joined on <g:formatDate format="MMM d, yyyy" date="${usuarioActual.perfil.dateCreated}"/></i>
          </div>
          <div id="questionable">
            <h5>Evaluaciones Ralizadas:</h5>
            <g:showListQuestionaryRating instance="${usuarioActual}"/>
          </div>
        </div>

        <div class="span8" id="contenedorDerecho">
          <g:render template="piedritas1"/>
        </div>
      </div>
      <div class="row-fluid" id="questionableResponsive">
        <g:showListQuestionaryRating instance="${usuarioActual}"/>
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
