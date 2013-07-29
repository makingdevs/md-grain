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
}
