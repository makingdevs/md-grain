class UrlMappings {

	static mappings = {
		"/admin/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		name contact: "/contact" {
			controller = 'home'
			action = 'contact'
		}

		name signup: "/signUp/$action?"(controller:'signUp')

		name login: "/login/$action?"(controller : 'login')

		name logout: "/logout/$action?"(controller : 'logout')

		name me: "/me/$action?"(controller : 'perfil')

		name telefono: "/telefono/$action?"(controller : 'telefono')

		name registration: "/registration/$action?"(controller : 'registration')

		name myTraining: "/myTraining/$action?"(controller : 'myTraining')

		name notification: "/notification/$action?"(controller : 'notification')

		name training: "/training" {
			controller = 'home'
			action = 'courses'
		}

		name course: "/training/$id" {
			controller = 'course'
			action = 'landingPage'
		}

		name myPayments : "/myPayments/" {
			controller = 'payment'
			action = 'myPayments'
		}

		"/"(controller:"home")
		"500"(view:'/error')
	}
}
