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

                <fieldset>
                  <div class="row-fluid">
                    <div class="span12">
                      <div class="controls controls-row">
                        <div class="row-fluid">
                          <span class="control-group ${hasErrors(bean:user,field:'nombre','error')}">
                            <input name="nombre" class="span3" placeholder="Tu(s) nombre(s)..." type="text" value="${user?.nombre}">
                          </span>
                          <span class="control-group ${hasErrors(bean:user,field:'apellidoPaterno','error')}">
                            <input name="apellidoPaterno" class="span3 offset1" placeholder="Apellido Paterno" type="text" value="${user?.apellidoPaterno}">
                          </span>
                          <span class="control-group ${hasErrors(bean:user,field:'apellidoMaterno','error')}">
                            <input name="apellidoMaterno" class="span3 offset1" placeholder="Apellido Materno" type="text" value="${user?.apellidoMaterno}">
                          </span>
                        </div>
                      </div>
                      <div class="controls controls-row">
                        <div class="row-fluid">
                          <div class="span12">
                            <span class="control-group ${hasErrors(bean:user,field:'username','error')}">
                              <span class="input-prepend">
                                <input name="username" class="span12" placeholder="mail@mail.com" type="text" value="${user?.username}">
                                <span class="add-on"><i class="icon-envelope"></i></span>
                              </span>
                            </span>
                          </div>
                        </div>
                      </div>
                      <div class="controls controls-row">
                        <span class="control-group ${hasErrors(bean:user,field:'password','error')}">
                          <span class="input-prepend">
                            <span class="add-on"><i class="icon-lock"></i></span>
                            <input name="password" class="span10" placeholder="Tu contraseña..." type="password">
                          </span>
                        </span>
                        <span class="control-group ${hasErrors(bean:user,field:'confirmPassword','error')}">
                          <span class="input-prepend">
                            <span class="add-on"><i class="icon-lock"></i></span>
                            <input name="confirmPassword" class="span10" placeholder="Confirmar contraseña..." type="password">
                          </span>
                        </span>
                      </div>
                    </div>
                    <div class="row-fluid">
                      <div class="span12">
                        <div class="form-actions no-margin-bottom">
                          <button class="btn btn-primary btn-large" name="button" type="submit">Completar el registro</button>
                        </div>
                      </div>
                    </div>
                  </div>
                </fieldset>

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
