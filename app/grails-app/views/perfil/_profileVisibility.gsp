<g:formRemote name="visibilityAsync" update="infoPerfil" url="[controller:'perfil',action:'update']" class="form-horizontal">
<div id="infoPerfil">
  <h4>Alias / nickname</h4>
  <div class="control-group">
    <div class="input-prepend input-append">
      <span class="add-on">http://makingdevs.com/developer/</span>
      <input type="text" name="nickname" value="${usuarioActual.nickname}" class="form-control input-small"/>
      <button class="btn">
        <i class="icon icon-save"></i>
      </button>
      <a href="#" class="btn">
        <i class="icon icon-link"></i>
      </a>
    </div>
  </div>
</div> 
</g:formRemote>
