modules = {
  application {
    resource url:'js/application.js'
  }

  venera {
    dependsOn 'jquery'
    resource url:'assets/less/theme_venera_blue.less',attrs:[rel: "stylesheet/less", type:'css']
    resource url:'assets/js/bootstrap.js'
    resource url:'assets/js/prettify.js'
    resource url:'assets/js/lightbox.js'
    resource url:'assets/js/main.js'
  }

  estilos {
    dependsOn 'venera'
  }

  wysihtml5 {
    dependsOn 'jquery'
    resource url:'js/wysihtml5/img/glyphicons-halflings.png'
    resource url:'js/wysihtml5/js/wysihtml5-0.3.0_rc2.min.js'
    resource url:'js/wysihtml5/bootstrap-wysihtml5-0.0.2.css'
    resource url:'js/wysihtml5/bootstrap-wysihtml5-0.0.2.min.js'
    resource url:'js/wysihtml5/wysihtml-init.js'
  }

  telefono {
    resource url:'js/telefono/index.js'
  }
  
  buttonLoader {
    resource url:'js/util/loader.js'
  }

  upload {
    resource url:'js/upload/css/basic.css'
    resource url:'js/upload/css/dropzone.css'
    resource url:'js/upload/dropzone.min.js'

  }

  colorPicker{
    resource url:'css/colpick.css'
    resource url:'js/colPick/colpick.js'
    resource url:'js/colPick/colorPickFunction.js'
  }

  perfil{
    resource url:'css/perfil.css'
  }

  fullCalendar{
    resource url:'css/fullcalendar.min.css'
    resource url:'js/fullcalendar/lib/moment.min.js'
    resource url:'js/fullcalendar/lib/jquery.min.js'
    resource url:'js/fullcalendar/fullcalendar.js'
    resource url:'js/fullcalendar/lang-all.js'
  }

  sessionCalendar{
    dependsOn 'fullCalendar'
    resource url:'js/sessionCalendar/session.calendar.js'
  }

  googleLogin{
    resource url:'js/google/api.google.login.js'
  }
}
