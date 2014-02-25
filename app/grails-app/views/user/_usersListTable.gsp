<table class="table no-margin table-striped table-bordered">
  <thead>
    <tr>
      <th>#</th>
      <th>Nombre</th>
    </tr>
  </thead>
  <tbody>
    <g:each in="${users}" var="user" status="indice">
    <tr>
      <td>${indice + 1}</td>
      <td>
        <g:link controller="user" action="show" id="${user.id}">
          ${user.perfil.nombreCompleto()}
        </g:link>
      </td>
    </tr>
    </g:each>
  </tbody>
</table>