package com.makingdevs

class RobotController {

    def index() { }
    def muestraRobot(){
    	String directorio = request.getSession().getServletContext().getRealPath("") 
    	render file: directorio+'/robots.txt', contentType: 'text/plain'
  	}
}
