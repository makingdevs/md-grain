function signinGmailCallback(authResult) {
  if (authResult['access_token']) {
    
    var urlGmailLogin = $('#urlGmailLogin').val();
		$.ajax({
		  type: 'GET',
		  url: urlGmailLogin,
		  data: {access_token:authResult['access_token']},
		  async: false,
		  contentType: "application/json",
		  success: function(dataGmail) {
        location.reload();
		  },
		  error: function(e) {
		    console.log("error en iniciar sesion gmail -> "+e);
		  }
		});

  } else if (authResult['error']) {
    console.log(authResult['error'])
  }
}