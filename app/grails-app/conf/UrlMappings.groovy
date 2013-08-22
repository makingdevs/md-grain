class UrlMappings {

	static mappings = {
		"/admin/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		name contac: "/contact" {
			controller = 'home'
			action = 'contact'
		}

		name training: "/training" {
			controller = 'home'
			action = 'courses'
		}

		name course: "/training/$id" {
			controller = 'course'
			action = 'landingPage'
		}

		"/"(controller:"home")
		"500"(view:'/error')
	}
}
