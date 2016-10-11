<g:form name="visibilityAsync" update="infoPerfil" url="[controller:'perfil',action:'update']" class="form-horizontal">
<div id="infoPerfil">
  <h4>Alias / nickname</h4>
  <div class="control-group">
    <div class="input-prepend input-append">
      <span class="add-on">http://makingdevs.com/developer/</span>
      <input type="text" name="nickname" value="${usuarioActual.nickname}" class="form-control input-small"/>
      <button class="btn">
        <i class="icon icon-save"></i>
      </button>
      <g:if test="${usuarioActual.nickname && !usuarioActual.hasErrors()}">
        <g:link controller="user" action="perfilUser" class="btn" params="[nickname:usuarioActual.nickname]">
          <i class="icon icon-link"></i>
        </g:link>
      </g:if>
    </div>
  </div>
  <div>
    <g:hasErrors bean="${usuarioActual}">
      <g:eachError var="err" bean="${usuarioActual}">
        <div class="alert alert-danger">
          <g:message error="${err}"/>
        </div>
      </g:eachError>
    </g:hasErrors>
  </div>
</div>
</g:form>
