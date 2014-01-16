<html>
<head>
  <meta name='layout' content='venera'/>
  <title>Restableciendo contraseña</title>
</head>

<body>

<section class="section-wrapper login-page-w">
  <div class="container">
    <div class="row">
      <div class="span9">
        <div class="white-card extra-padding">
          <form method='POST' id='recoverForm' class='cssform' action="recover">
            <fieldset>
              <div class="row-fluid">
                <div class="span12">
                  <h1 class="form-header">
                    Restablece tu contraseña
                  </h1>
                  <g:if test='${flash.error}'>
                    <div class="alert alert-error">
                      ${flash.error}
                    </div>
                  </g:if>
                  <g:if test='${flash.success}'>
                    <div class="alert alert-success">
                      ${flash.success}
                    </div>
                  </g:if>
                </div>
              </div>
              <div class="row-fluid">
                <div class="span12">
                  <div class="control-group">
                      <label for='username'>
                        Escribe tu nueva contraseña :
                      </label>
                      <g:hiddenField name="token" value="${forgotToken.token}"/>
                      <div class="input-prepend">
                        <span class="add-on"><i class="icon-lock"></i></span>
                        <input type='password' class='input-xlarge' name='j_password'/>
                      </div>
                  </div>
                  <button type="submit" id="submit" class="btn btn-large">
                   <i class="icon icon-smile"></i> Cambiar mi contraseña
                  </button>
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
