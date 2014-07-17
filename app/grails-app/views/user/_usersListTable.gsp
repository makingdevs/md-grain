<table class="table no-margin table-striped table-bordered">
  <thead>
    <tr>
      <th>#</th>
      <th>Nombre</th>
      <th>Correo</th>
      <th>Perfil</th>
    </tr>
  </thead>
  <tbody>
    <g:each in="${users}" var="user" status="indice">
    <tr>
      <td>${indice + 1}</td>
      <td>
          ${user.perfil.nombreCompleto()}
      </td>
      <td>
        ${user.username} 
      </td>
      <td>
        <g:link controller="user" action="show" id="${user.id}">
          <button type="submit" class="btn btn-primary">
            Ver
          </button>
        </g:link> 
      </td>
    </tr>
    </g:each>
  </tbody>
</table>
