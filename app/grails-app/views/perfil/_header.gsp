<div class="media">
  <a class="pull-left" href="https://es.gravatar.com/site/login">
    <avatar:gravatar email="${usuarioActual.username}" cssClass="media-object img-polaroid" size="64"/>
  </a>
  <div class="media-body">
    <h4 class="media-heading">${usuarioActual.perfil.nombre} ${usuarioActual.perfil.apellidoPaterno} ${usuarioActual.perfil.apellidoMaterno}</h4>
    <i class="icon-user"></i> ${usuarioActual.username}
  </div>
</div>