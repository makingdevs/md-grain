<!DOCTYPE html>

<html>
  <head>
    <meta name="layout" content="veneraWithMenu"/>
    <title>Mis sesiones</title>
  </head>

  <body>

  <div class="row-fluid">

    <div class="span12">
      <h3 class="section-header">Sesiones de curso</h3>
      <table class="table no-margin table-striped table-bordered">
        <thead>
          <tr>
            <th>#</th>
            <th>Curso</th>
            <th>Fecha</th>
            <th>Horario</th>
          </tr>
        </thead>
        <tbody>
          <g:each in="${courseSessions.sort()}" var="cs" status="i">
            <tr>
              <td>${i+1}</td>
              <td>${cs.scheduledCourse.course.name}</td>
              <td>
                ${formatDate(date:cs.sessionStartTime,format:"dd - MMMM - yyyy")}
              </td>
              <td>
                <g:formatDate format="HH:mm" date="${cs.sessionStartTime}"/> a <g:formatDate format="HH:mm" date="${cs.sessionEndTime}"/> hrs.
              </td>
            </tr>
          </g:each>
        </tbody>
      </table>
    </div>
  </div>
  
  </body>
</html>