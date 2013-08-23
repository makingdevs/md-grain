class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		name contact: "/contact" {
			controller = 'home'
			action = 'contact'
		}

		name signup: "/signup" {
			controller = 'signUp'
			action = 'index'
		}

		name login: "/login/$action?"(controller : 'login')

		name logout: "/logout/$action?"(controller : 'logout')

		name me: "/me/$action?"(controller : 'perfil')

		name telefono: "/telefono/$action?"(controller : 'telefono')

		name registration: "/registration/$action?"(controller : 'registration')

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
