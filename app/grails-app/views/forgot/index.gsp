<html>
<head>
  <meta name='layout' content='venera'/>
  <title>La olvidaste...</title>
</head>

<body>

<section class="section-wrapper login-page-w">
  <div class="container">
    <div class="row">
      <div class="span9">
        <div class="white-card extra-padding">
          <form action='${postUrl}' method='POST' id='loginForm' class='cssform' autocomplete='off'>
            <fieldset>
              <div class="row-fluid">
                <div class="span12">
                  <h1 class="form-header">
                    Restablece tu contraseña
                  </h1>
                  <g:if test='${flash.message}'>
                    <div class="alert alert-error">
                      ${flash.message}
                    </div>
                  </g:if>
                </div>
              </div>
              <div class="row-fluid">
                <div class="span6">
                  <div class="control-group">
                      <label for='username'>
                        Ingresa el correo electrónico con el que te registraste :
                      </label>
                      <div class="input-prepend">
                        <span class="add-on"><i class="icon-envelope"></i></span>
                        <input type='text' class='input-xlarge' name='j_username' id='j_username'/>
                      </div>
                  </div>
                  <button type="submit" id="submit" class="btn btn-large">
                   <i class="icon icon-smile"></i> Restablecer mi cuenta
                  </button>
                </div>
                <div class="span6">
                  <h3>¿Aún no tienes cuenta?</h3>
                  <div class="well">
                  <g:link controller="signUp" class="btn btn-large btn-block btn-primary">
                    <i class="icon-thumbs-up"></i>
                    Crea una cuenta
                  </g:link>
                  </div>
                </div>
              </div>
            </fieldset>
          </form>
        </div>
      </div>
      <div class="span3">
        <g:render template="/registration/tips" />
      </div>
    </div>
  </div>
</section>

<r:script>
  $(function(){
    $("form#loginForm #j_username").focus();
  });
</r:script>
</body>
</html>
