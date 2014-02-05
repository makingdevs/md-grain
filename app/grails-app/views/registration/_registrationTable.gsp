<%@ page import="com.payable.EstatusDePago" %>
<table class="table no-margin table-striped table-bordered">
  <thead>
    <tr>
      <th>#</th>
      <th>Nombre</th>
      <g:sortableColumn property="user.username" title="Correo"/>
      <g:sortableColumn property="scheduledCourse.course" title="Curso" defaultOrder="desc"/>
      <g:sortableColumn property="dateCreated" title="Registrado" defaultOrder="desc"/>
      <g:sortableColumn property="registrationStatus" title="Status" defaultOrder="desc"/>
      <th>&nbsp;</th>
    </tr>
  </thead>
  <tbody>
    <g:each in="${registrations}" var="r" status="i">
    <tr>
      <td>${i + 1}</td>
      <td>${r.user.perfil.nombreCompleto()}</td>
      <td>
        <g:link controller="user" action="show" id="${r.user.id}">
          ${r.user.username}
        </g:link>
      </td>
      <td>${r.scheduledCourse.course}</td>
      <td>${formatDate(date:r.dateCreated,format:"dd - MMMM - yyyy")}</td>
      <td>
        <g:render template="/registration/currentStatus" model="[currentStatus:r.registrationStatus]"/>
      </td>
      <td>
        <g:set var="paymentId" value="${r.pagos.id.first()}" />
        <g:remoteLink name="quizFor${r.id}" class="btn btn-mini" controller="notification" action="quizFor" id="${r.user.username}" params="[course:r.scheduledCourse.course]" onLoading="var loader${r.id} = new ButtonLoader(${r.id},'quizFor'); loader${r.id}.preload()" onSuccess="loader${r.id}.success('Cuestionario enviado a: ${r.user.username}.')" onComplete="loader${r.id}.complete()">
          <i class="icon-envelope"></i>
        </g:remoteLink>
        <g:if test="${(r.pagos.estatusDePago.first() == EstatusDePago.CREADO) || (r.pagos.estatusDePago.first() == EstatusDePago.RECHAZADO)}">
          <g:link controller="paymentReceipt" id="${paymentId}" class="btn btn-mini">
          <i class="icon-cloud-upload"></i> 
          </g:link>
        </g:if>
        <g:elseif test="${r.pagos.estatusDePago.first() == EstatusDePago.PROCESO}">
          <g:link class="btn btn-mini" controller="voucher" action="show" id="${paymentId}"><i class="icon-file-text-alt bigger-130"></i></g:link>
        </g:elseif>
        <g:elseif test="${r.pagos.estatusDePago.first() == EstatusDePago.PAGADO}">
          <g:link class="btn btn-mini" controller="paymentReceipt" action="index" id="${paymentId}"><i class="icon-file-text-alt bigger-130"></i></g:link>
        </g:elseif>
      </td>
    </tr>
    </g:each>
  </tbody>
</table>