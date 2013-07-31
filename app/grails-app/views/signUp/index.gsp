<html>
<head>
  <title>. : MakingDevs - SignUp : .</title>
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
                    <h1 class="form-header">Crea una cuenta</h1>
                    <g:if test="${user?.errors}">
                    <div class="alert alert-error">
                      <ul>
                        <g:eachError bean="${user}" var="err">
                          <li><g:message error="${err}" /></li>
                        </g:eachError>
                      </ul>
                    </div>
                    </g:if>
                  </div>
                </div>
                <div class="row-fluid">
                  <div class="span12">
                    <div class="form-side-info">
                    <p>Es importante tu <strong>nombre y apellido</strong> correctos por que con ellos estaremos expidiendo tus reconocimientos.</p>
                    </div>
                  </div>
                </div>
                <div class="row">
                  <div class="span4">
                    <div class="control-group">
                      <label>Nombre(s)</label>
                      <input name="name" class="span4" placeholder="Tu(s) nombre(s)..." type="text" value="${user?.name}">
                    </div>
                  </div>
                  <div class="span4">
                    <div class="control-group">
                      <label>Apellidos</label>
                      <input name="lastName" class="span4" placeholder="Tus apellidos..." type="text" value="${user?.lastName}">
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
                          <input name="username" class="span4" placeholder="mail@mail.com" type="text" value="${user?.username}">
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="span4">
                  </div>
                </div>
                <div class="row">
                  <div class="span4">
                    <div class="control-group">
                      <label>Contraseña</label>
                      <div class="controls">
                        <div class="input-prepend">
                          <span class="add-on"><i class="icon-lock"></i></span>
                          <input name="password" class="span3" placeholder="Tu contraseña..." type="password">
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="span4">
                    <div class="control-group">
                      <label>Confirmación de contraseña</label>
                      <div class="controls">
                        <div class="input-prepend">
                          <span class="add-on"><i class="icon-lock"></i></span>
                          <input name="confirmPassword" class="span3" placeholder="Confirmar contraseña..." type="password">
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
                <div class="row-fluid">
                  <div class="span12">
                    <div class="form-actions no-margin-bottom">
                      <button class="btn btn-primary btn-large" name="button" type="submit">Complete Registration</button>
                    </div>
                  </div>
                </div>
              </fieldset>
            </g:form>
          </div>
        </div>
        <div class="span3">
          <div class="blog-side-text-block widget-filled widget-yellow">
            <h3>Algunos tips:</h3>
            <ul class="big-iconed-tips">
              <li>
                <i class="icon-credit-card"></i>
                El registro es gratis 
              </li>
              <li>
                <i class="icon-lock"></i>
                Tus datos están seguros
              </li>
            </ul>
            <p>Una vez que te registres tendrás la oportunidad de inscribirte a cursos de entrenamiento y eventos relacionados con el desarrollo de software.</p>
          </div>
        </div>
      </div>
    </div>
  </section>
</body>
</html>
