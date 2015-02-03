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

		name myTraining: "/myTraining/$action?"(controller : 'myTraining')

		name notification: "/notification/$action?"(controller : 'notification')
	  
	  name evaluate: "/evaluate/$action?"(controller : 'evaluate')

	  name test: "/test/$action?"(controller:'questionaryUser')

	  name prueba: "/developer/$nickname?"{
 			controller='user'
 			action= 'perfilUser'
 		}

 		name piedritas: "/piedritas"{
 			controller='user'
 			action= 'piedritas'
 		}

	  name questionary: "/questionary"{
	  	controller= 'questionary'
	  	action='answerQuestionary'
	  }
	  name questionary: "/textQuestion"{
	  	controller= 'textQuestionController'
	  }

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

		name mySessions : "/mySessions/" {
			controller = 'attendee'
			action = 'mySessions'
		}

		name mySessions : "/courseSessionCalendar" {
			controller = 'attendee'
			action = 'sessionByMonth'
		}

		name paypalCancel : "/paypal/cancel" {
			controller = 'payment'
			action = 'paypalCancel'
		}

		name paypalPayed : "/paypal/payed" {
			controller = 'payment'
			action = 'paypalPayed'
		}

		name registration: "/registration"{
			controller='registration'
			action='addMe'
		}

		name scheduledCourseInfo : "/courseInfo" {
			controller = 'registration'
			action = 'index'
		}
		name scheduledCourseInfo : "/twitterLogin" {
			controller = 'twitterLogin'
			action = 'index'
		}
		name scheduledCourseInfo : "/twitterCallback" {
			controller = 'twitterLogin'
			action = 'callback'
		}
		name nextTraining : "/nextTraining" {
			controller = 'notification'
			action = 'scheduledCourses'
		}

		name calendar : "/calendar/$action?" {
			controller = 'calendar'
		}

		name uploadReceipt : "/uploadReceipt/$action?/$id?" {
			controller = 'paymentReceipt'
		}

		name forgot : "/forgot/$action?" {
			controller = "forgot"
		}

		"/"(controller:"home")
		"500"(view:'/error')
		"404"(view:'/notFound')
	}
}
