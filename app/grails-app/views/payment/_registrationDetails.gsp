<table class="table no-margin table-striped table-bordered">
  <thead>
    <tr>
      <th>#</th>
      <th>Curso</th>
      <th>Fecha de inicio</th>
      <th>Duración</th>
      <th>Estatus del curso</th>
      <th>Estatus del registro</th>
    </tr>
  </thead>
  <tbody>
    <g:each in="${registrations}" var="r" status="i">
    <tr>
      <td>${i+1}</td>
      <td>${r.scheduledCourse.course.name}</td>
      <td>${formatDate(date:r.scheduledCourse.beginDate,format:"dd - MMMM - yyyy")}</td>
      <td>${r.scheduledCourse.durationInHours} horas</td>
      <td>
        <span class="label">
          <g:message code="${r.scheduledCourse.scheduledCourseStatus.code}"/>
        </span>
      </td>
      <td>
        <span class="label">
          <g:message code="${r.registrationStatus.code}"/>
        </span>
      </td>
    </tr>
  </g:each>
</tbody>
</table>