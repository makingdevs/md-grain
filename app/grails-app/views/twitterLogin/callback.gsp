<html>
<head>
  <title>. : MakingDevs - Registro de usuario de Twitter : .</title>
  <meta name="layout" content="venera"/>
</head>
<body>
  <section class="section-wrapper create-account-page-w">
    <div class="container">
      <div class="row">
        <div class="span9">
          <div class="white-card extra-padding">
            <g:form action="register">
              <fieldset>
                <div class="row-fluid">
                  <div class="span12">
                    <h1 class="form-header">Login por cuenta de Twitter</h1>
                  </div>
                </div>
                <div class="row-fluid">
                  <div class="span12">
                    <div class="form-side-info">
                    <p>Es importante tu <strong>email, nombre y apellido</strong> correctos por que con ellos estaremos expidiendo tus reconocimientos.</p>
                    <p></p>
                    </div>
                  </div>
                </div>
                <div class="row">
                  <div class="span2">
                    <div class="control-group">
                      <label>Nombre(s)</label>
                      <input name="nombre" class="span2" placeholder="Tu(s) nombre(s)..." type="text" value="${firstName}">
                    </div>
                  </div>
                  <div class="span2">
                    <div class="control-group">
                      <label>Apellido Paterno</label>
                      <input name="apellidoPaterno" class="span2" placeholder="Apellido paterno" type="text" value="${lastName}">
                    </div>
                  </div>
                  <div class="span2">
                    <div class="control-group">
                      <label>Apellido Materno</label>
                      <input name="apellidoMaterno" class="span2" placeholder="Apellido materno" type="text">
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
                          <input name="username" class="span4" placeholder="mail@mail.com" type="text">
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
