<%@ page import="com.makingdevs.ScheduledCourse" %>
<!DOCTYPE html>
<html>
  <head>
    <meta name="layout" content="venera"/>
    <title>Calendario</title>
  </head>
  <body>

    <section class='section-wrapper'>
      <div class='container'>
        <h3 class='section-header'>Calendario de entrenamiento</h3>
        <div class='row'>
        </div>
      </div>
    </section>

    <section>
      <div class="container">
        <div class="white-card extra-padding">
          <div id="calendar"></div>
        </div>
      </div>
    </section>

    <input type="hidden" name="courseInfoForCalendar" value="${createLink(controller:'calendar',action:'courseInfoForCalendar')}" />

  </body>
</html>
