package com.makingdevs

class RobotController {

    def index() { }
    def muestraRobot(){
  		render file: 'web-app/robots.txt', contentType: 'text/plain'
  	}
}
