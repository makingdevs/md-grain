function signinGmailCallback(authResult) {
  if (authResult['access_token']) {
    
    var urlGmailLogin = $('#urlGmailLogin').val();
    console.log("url ajax ---------->> "+urlGmailLogin);
    console.log("access_token  ajax ->> "+authResult['access_token']);
		$.ajax({
		  type: 'GET',
		  url: urlGmailLogin,
		  data: {access_token:authResult['access_token']},
		  async: false,
		  contentType: "application/json",
		  success: function(dataGmail) {
		    console.log("success +++++++++++========>>>>>>>> "+dataGmail.url);
		  },
		  error: function(e) {
		    // Gestiona el error
		    // console.log(e);
		    // Puedes indicar a los usuarios que se desconecten de forma manual si se produce un error
		    // https://plus.google.com/apps
		    console.log("===============ERROR====================");
		  }
		});

  } else if (authResult['error']) {
    // Se ha producido un error.
    // Posibles códigos de error:
    //   "access_denied": el usuario ha denegado el acceso a la aplicación.
    //   "immediate_failed": no se ha podido dar acceso al usuario de forma automática.
    console.log('There was an error: ' + authResult['error']);
  }
}