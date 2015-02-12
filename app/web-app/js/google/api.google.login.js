function signinGmailCallback(authResult) {
  console.log("entra a callback de google login. Object::::");
	console.log(authResult);
  if (authResult['access_token']) {
    
    var urlGmailLogin = $('#urlGmailLogin').val();
    console.log("url ---------->> "+urlGmailLogin);
    console.log("access_token ->> "+authResult['access_token']);
    $.post(urlGmailLogin, authResult);

  } else if (authResult['error']) {
    // Se ha producido un error.
    // Posibles códigos de error:
    //   "access_denied": el usuario ha denegado el acceso a la aplicación.
    //   "immediate_failed": no se ha podido dar acceso al usuario de forma automática.
    console.log('There was an error: ' + authResult['error']);
  }
}