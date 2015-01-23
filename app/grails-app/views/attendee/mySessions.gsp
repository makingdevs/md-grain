<!DOCTYPE html>

<html>
  <head>
    <meta name="layout" content="veneraWithMenu"/>
    <title>Mis sesiones</title>
    <r:require module="sessionCalendar"/>
  </head>
  <body>

  <div class="row-fluid">
    <div class="span8">
      <input id="urlCourseSessions" type="hidden" value="${createLink(uri:'/courseSessionCalendar')}">
      <div id='calendar'></div>
    </div>
    <div class="span4">
      <div class="entry-content-w box-wrapper">
        <header class="entry-header">
          <h2 class="entry-title">Sesiones de Cursos</h2>
        </header>
        <div class="entry-content">
          <p>El calendario de la izquierda muestra las fechas de los cursos en donde estás registrado.</p>
          <h4>Lista de cursos:</h4>
          <ul id="listCourseSession"></ul>
        </div>
      </div>
    </div>
  </div>
  
  </body>
</html>