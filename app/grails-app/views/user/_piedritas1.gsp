<div class="row-fluid">
  <div id="modelo1" class="span3 piedrasNull">
    <p id="text"></p>
  </div>
  <div id="modelo2" class="span3 piedrasNull">
    <p id="text"></p>
  </div>
  <div id="modelo3" class="span3 piedrasNull">
    <p id="text"></p>
  </div>
  <div id="modelo4" class="span3 piedrasNull">
    <p id="text"></p>
  </div>
  <g:if test="${cursosUser.contains('JAVASCRIPT-JQUERY')}">
    <div id="modelo5" class="span3">
      <p id="text">Desarrollo web con Javascript y jQuery</p>
    </div>
  </g:if>
  <g:else>
    <div id="modelo5" class="span3 piedrasNull">
      <p id="text">Desarrollo web con Javascript y jQuery</p>
    </div>
  </g:else>
  <g:if test="${cursosUser.contains('AGILE-ESSENTIALS')}"> 
    <div id="modelo6" class="span3">
      <p id="text">Técnicas y métodos ágiles</p>
    </div>
  </g:if>
  <g:else>
    <div id="modelo6" class="span3 piedrasNull">
      <p id="text">Técnicas y métodos ágiles</p>
    </div>
  </g:else>
  <g:if test="${cursosUser.contains('JAVASCRIPT-EMBERJS')}"> 
      <div id="modelo7" class="span3">
      <p id="text">Single Page Applications con EmberJS</p>
    </div>
  </g:if>
  <g:else>
    <div id="modelo7" class="span3 piedrasNull">
      <p id="text">Single Page Applications con EmberJS</p>
    </div>
  </g:else>
  <g:if test="${cursosUser.contains('SPRING-SECURITY')}"> 
    <div id="modelo8" class="span3">
      <p id="text">Seguridad en aplicaciones Java con Spring Security</p>
    </div>
  </g:if>
  <g:else>
    <div id="modelo8" class="span3 piedrasNull">
      <p id="text">Seguridad en aplicaciones Java con Spring Security</p>
    </div>
  </g:else>
  <g:if test="${cursosUser.contains('SPRING-DATA_ACCESS')}"> 
    <div id="modelo9" class="span3">
      <p id="text">Acceso a datos con Spring 3/4</p>
    </div>
  </g:if>
  <g:else>
    <div id="modelo9" class="span3 piedrasNull">
      <p id="text">Acceso a datos con Spring 3/4</p>
    </div>
  </g:else>
  <g:if test="${cursosUser.contains('GRAILS')}">
    <div id="modelo10" class="span3">
      <p id="text">Desarrollo de aplicaciones con Grails</p>
    </div>
  </g:if>
  <g:else>
    <div id="modelo10" class="span3 piedrasNull">
      <p id="text">Desarrollo de aplicaciones con Grails</p>
    </div>
  </g:else>
  <div id="modelo11" class="span3 piedrasNull">
    <p id="text"></p>
  </div>
  <g:if test="${cursosUser.contains('SPRING-WEBJQUERY')}">
    <div id="modelo12" class="span3">
      <p id="text">Aplicaciones web con Springframework y jQuery</p>
    </div>
  </g:if>
  <g:else>
    <div id="modelo12" class="span3 piedrasNull">
      <p id="text">Aplicaciones web con Springframework y jQuery</p>
    </div>
  </g:else>
</div>  
<g:remoteLink class="btn btn-info" controller="user" action="piedritas" update="contenedorDerecho" style="margin-top:15px;" params="[cursosUser:cursosUser]">Siguiente <i class="icon-forward"></i></g:remoteLink>
