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
}
