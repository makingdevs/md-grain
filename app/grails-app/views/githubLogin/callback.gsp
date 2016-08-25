<html>
<head>
  <title>. : MakingDevs - Registro de usuario de Github : .</title>
  <meta name="layout" content="venera"/>
</head>
<body>
  <section class="section-wrapper create-account-page-w">
    <div class="container">
      <div class="row">
        <div class="span9">
          <div class="white-card extra-padding">
            <g:form controller="githubLogin" action="register">
              <input name="oauth_verifier" type="hidden" value="${oauth_verifier}"/>
              <fieldset>
                <div class="row-fluid">
                  <div class="span12">
                    <h1 class="form-header">Login por cuenta de GitHub</h1>
                  </div>
                </div>
                <div class="row-fluid">
                  <div class="span12">
                    <div class="form-side-info">
                    <p>Es importante tu <strong>correo electrónico</strong> porque con él estaremos notificandote nuevos eventos.</p>
                    </div>
                  </div>
                </div>
                <div class="row">
                  <div class="span4">
                    <div class="control-group">
                      <label>Correo electrónico</label>
                      <div class="controls">
                        <div class="input-prepend">
                          <span class="add-on"><i class="icon-envelope"></i></span>
                          <input name="email" class="span4" placeholder="mail@mail.com" type="email" required>
                          <input name="name" type="hidden" value="${name}">
                          <input name="username" type="hidden" value="${username}">
                          <input name="code" type="hidden" value="${code}">
                          <input name="githubId" type="hidden" value="${githubId}">
                          <input name="accessToken" type="hidden" value="${accessToken}">
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="span4">
                  </div>
                </div>
                <div class="row-fluid">
                  <div class="span12">
                    <div class="form-actions no-margin-bottom">
                      <button class="btn btn-primary btn-large" name="button" type="submit">Ingresar</button>
                    </div>
                  </div>
                </div>
              </fieldset>
            </g:form>
          </div>
        </div>
        <div class="span3">
          <g:render template="/registration/tips" />
        </div>
      </div>
    </div>
  </section>
</body>
</html>
