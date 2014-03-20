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
          <div class="offset2 span8 offset2" id="logo">
            <h2 id="usuario">${usuarioActual}</h2>
          </div>
        </div>
      </div>

      <div class="row-fluid" id="cuerpo">
        <div class="span4">
          <div id="label1"></div>
          <div id="label2"></div>
        </div>
        <div class="span8">
          <g:render template="piedritas1"/>
        </div>
      </div>

      <div class="row-fluid">
        <div id="separador" class="span12"></div>
      </div>

      <div class="row-fluid" id="pie">
        <div class="span4" id="escudo"></div>
        <div class="span4">
          
        </div>
        <div class="span4" id="estrella"></div>
      </div>
    </div> 
  </div>
  </body>
</html>