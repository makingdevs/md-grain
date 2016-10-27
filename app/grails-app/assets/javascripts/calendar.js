$(function(){
  var date = new Date();
  var d = date.getDate();
  var m = date.getMonth();
  var y = date.getFullYear();
  $('#calendar').fullCalendar({
    monthNames:['Enero','Febrero','Marzo','Abril','Mayo','Junio','Julio','Agosto','Septiembre','Octubre','Noviembre','Diciembre'],
    monthNamesShort:['Ene','Feb','Mar','Abr','May','Jun','Jul','Ago','Sep','Oct','Nov','Dic'],
    dayNames:['Domingo','Lunes','Martes','Miércoles','Jueves','Viernes','Sábado'],
    dayNamesShort:['Dom','Lun','Mar','Mié','Jue','Vie','Sáb'],
    buttonText:{
      today:'hoy',
      month:'mes',
      week:'semana',
      day:'día'
    },
    events: $('input[name=courseInfoForCalendar]').val()
  });
});

