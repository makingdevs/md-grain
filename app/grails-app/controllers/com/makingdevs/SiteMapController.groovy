package com.makingdevs

class SiteMapController {

    def index() { }

    def muestraSiteMap(){
  		render file: 'web-app/sitemap.xml', contentType: 'text/xml'
  	}
}
