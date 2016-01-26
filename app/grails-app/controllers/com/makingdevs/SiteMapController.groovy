package com.makingdevs

class SiteMapController {

    def index() { }

    def muestraSiteMap(){
    	String directorio = request.getSession().getServletContext().getRealPath("") 
    	print directorio
  		render file: directorio+'/sitemap.xml', contentType: 'text/xml'
  	}
}
