<div class="row-fluid">
  <div id="modelo13" class="span3 piedrasNull">
    <p id="text"></p>
  </div>
  <div id="modelo14" class="span3 piedrasNull">
    <p id="text"></p>
  </div>
  <div id="modelo15" class="span3 piedrasNull">
    <p id="text"></p>
  </div>
  <g:if test="${params?.cursosUser.contains('GROOVY-INTERMEDIATE')}">
    <div id="modelo16" class="span3">
      <p id="text">Productividad con Groovy</p>
    </div>
  </g:if>
  <g:else>
    <div id="modelo16" class="span3 piedrasNull">
      <p id="text">Productividad con Groovy</p>
    </div>
  </g:else>
  <g:if test="${params?.cursosUser.contains('GRAILS-INTERMEDIATE')}">
    <div id="modelo17" class="span3">
      <p id="text">Productividad con Grails</p>
    </div>
  </g:if>
  <g:else>
    <div id="modelo17" class="span3 piedrasNull">
      <p id="text">Productividad con Grails</p>
    </div>
  </g:else>
  <g:if test="${params?.cursosUser.contains('SCALA-ESSENTIAL')}">
    <div id="modelo18" class="span3">
      <p id="text">Fundamentos del lenguaje Scala</p>
    </div>
  </g:if>
  <g:else>
    <div id="modelo18" class="span3 piedrasNull">
      <p id="text">Fundamentos del lenguaje Scala</p>
    </div>
  </g:else>
  <g:if test="${params?.cursosUser.contains('SPRING-WEB')}">
    <div id="modelo19" class="span3">
      <p id="text">Desarrollo web con Spring 3/4</p>
    </div>
  </g:if>
  <g:else>
    <div id="modelo19" class="span3 piedrasNull">
      <p id="text">Desarrollo web con Spring 3/4</p>
    </div>
  </g:else>
    <div id="modelo20" class="span3 piedrasNull">
      <p id="text">Lambda</p>
    </div>
  <div id="modelo21" class="span3 piedrasNull">
    <p id="text"></p>
  </div>
  <g:if test="${params?.cursosUser.contains('SPRING-ESSENTIALS')}">
    <div id="modelo22" class="span3">
      <p id="text">Diseño de aplicaciones con Spring 3/4</p>
    </div>
  </g:if>
  <g:else>
    <div id="modelo22" class="span3 piedrasNull">
      <p id="text">Diseño de aplicaciones con Spring 3/4</p>
    </div>
  </g:else>
  <g:if test="${params?.cursosUser.contains('GROOVY-ESSENTIALS')}">
    <div id="modelo23" class="span3">
      <p id="text">El lenguaje dinámico Groovy</p>
    </div>
  </g:if>
  <g:else>
    <div id="modelo23" class="span3 piedrasNull">
      <p id="text">El lenguaje dinámico Groovy</p>
    </div>
  </g:else>
  <g:if test="${params?.cursosUser.contains('GRADLE')}">
    <div id="modelo24" class="span3">
      <p id="text">Gradle</p>
    </div>
  </g:if>
  <g:else>
    <div id="modelo24" class="span3 piedrasNull">
      <p id="text">Gradle</p>
    </div>
  </g:else>
</div>
<g:link class="btn btn-info" controller="user" action="perfilUser" params="[username:params.username]"style="margin-top:15px;" ><i class="icon-backward"/> Anterior</g:link>

