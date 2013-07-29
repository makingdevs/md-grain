class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/api/categories"(controller:"category",parseRequest:true){
      action = [GET:"apiShow"]
		}

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
