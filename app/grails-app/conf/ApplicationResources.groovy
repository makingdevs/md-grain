modules = {
  application {
    resource url:'assets/javascripts/application.js'
  }

  venera {
    dependsOn 'jquery'
    resource url:'assets/stylesheet/less/theme_venera_blue.less',attrs:[rel: "stylesheet/less", type:'css']
    resource url:'assets/javascripts/bootstrap.js'
    resource url:'assets/javascripts/prettify.js'
    resource url:'assets/javascripts/lightbox.js'
    resource url:'assets/javascripts/main.js'
    dependsOn 'googleLogin'
  }

  estilos {
    dependsOn 'venera'
  }

  wysihtml5 {
    dependsOn 'jquery'
    resource url:'assets/javascripts/wysihtml5/img/glyphicons-halflings.png'
    resource url:'assets/javascripts/wysihtml5/js/wysihtml5-0.3.0_rc2.min.js'
    resource url:'assets/javascripts/wysihtml5/bootstrap-wysihtml5-0.0.2.css'
    resource url:'assets/javascripts/wysihtml5/bootstrap-wysihtml5-0.0.2.min.js'
    resource url:'assets/javascripts/wysihtml5/wysihtml-init.js'
  }

  telefono {
    resource url:'assets/javascripts/telefono/index.js'
  }

  buttonLoader {
    resource url:'assets/javascripts/util/loader.js'
  }

  upload {
    resource url:'assets/javascripts/upload/css/basic.css'
    resource url:'assets/javascripts/upload/css/dropzone.css'
    resource url:'assets/javascripts/upload/dropzone.min.js'

  }

  colorPicker{
    resource url:'assets/stylesheets/colpick.css'
    resource url:'assets/javascripts/colPick/colpick.js'
    resource url:'assets/javascripts/colPick/colorPickFunction.js'
  }

  perfil{
    resource url:'assets/stylesheets/perfil.css'
  }

  fullCalendar{
    resource url:'assets/stylesheets/fullcalendar.min.css'
    resource url:'assets/javascript/fullcalendar/lib/moment.min.js'
    resource url:'assets/javascripts/fullcalendar/lib/jquery.min.js'
    resource url:'assets/javascripts/fullcalendar/fullcalendar.js'
    resource url:'assets/javascripts/fullcalendar/lang-all.js'
  }

  sessionCalendar{
    dependsOn 'fullCalendar'
    resource url:'assets/javascripts/sessionCalendar/session.calendar.js'
  }

  googleLogin{
    resource url:'assets/javascripts/google/api.google.login.js'
  }
}
