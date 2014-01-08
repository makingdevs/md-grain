<%@ page import="com.makingdevs.ScheduledCourse" %>
<!DOCTYPE html>
<html>
<head>
  <meta name="layout" content="venera"/>
  <title>Calendario</title>
  <link href='http://arshaw.com/js/fullcalendar-1.6.4/fullcalendar/fullcalendar.css' rel='stylesheet' />
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

  <script src='http://arshaw.com/js/fullcalendar-1.6.4/fullcalendar/fullcalendar.min.js'></script>
  <script>
    $(function(){
      var date = new Date();
      var d = date.getDate();
      var m = date.getMonth();
      var y = date.getFullYear();
      $('#calendar').fullCalendar({
        monthNames:['Enero','Febrero','Marzo','Abril','Mayo','Junio','Julio','Agosto','Septiembre','Octubre','Noviembre','Diciembre'],
        monthNamesShort:['Ene','Feb','Mar','Abr','May','Jun','Jul','Ago','Sep','Oct','Nov','Dic'],
        dayNames:['Lunes','Martes','Miércoles','Jueves','Viernes','Sábado','Domingo'],
        dayNamesShort:['Lun','Mar','Mié','Jue','Vie','Sáb','Dom'],
        buttonText:{
          today:'hoy',
          month:'mes',
          week:'semana',
          day:'día'
        },
        events:[
          {
            title:"All day event",
            start:new Date(y.m,1)
          }
        ]
      });
    });
  </script>

</body>
</html>
