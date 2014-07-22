<h4>Perfil</h4>
<g:if test="${usuarioActual.nickname}">
<div class="control-group">
  <label for="" class="">Nickname: </label>
  <div class="control-group" id="pruebaEstilo">
    <input type="text" name="nickname" value="${usuarioActual.nickname}" />
  </div>
  <div class="alert alert-block">
    <button type="button" class="close" data-dismiss="alert">&times;</button>
    Es recomendable que uses tu correo electronico
  </div>
</div>
<div class="control-group">
  <div class="controls">
    <div><h6>Visibilidad del perfil</h6></div>
    <div class="profileVisibility"> 
      <span><input type="checkbox" name="public_profile"/></span>
    </div>
    <div> 
      <p>Público</p> 
    </div>
  </div>
</div>

<button type="submit" class="btn btn-primary">
  Guardar cambios 
</button>
</g:if> 
