<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <meta name="description" content="Impulsamos la carrera de los desarrolladores de software a través de Técnicas, métodos. metodologías y tecnología" />
  <meta name="keywords" content="agile,groovy,grails,spring,jquery,desarrollo de software,entrenamiento,cursos" />
  <title>. : MakingDevs - <g:layoutTitle default="Welcome"/> : .</title>
  <meta name="description" content="">
  <meta name="viewport" content="width=device-width">
  <r:require module="venera"/>
  <link href="http://fonts.googleapis.com/css?family=Abel:400|Oswald:300,400,700" media="all" rel="stylesheet" type="text/css" />
  <g:layoutHead/>
  <r:layoutResources/>
</head>
<body>
<!--[if lt IE 7]>
  <p class="chromeframe">You are using an outdated browser. <a href="http://browsehappy.com/">Upgrade your browser today</a> or <a href="http://www.google.com/chromeframe/?redirect=true">install Google Chrome Frame</a> to better experience this site.</p>
  <![endif]-->
  <header id='header'>
    <div class='navbar navbar-fixed-top'>
      <div class='navbar-inner'>
        <div class='container'>
          <a class='btn btn-navbar' data-target='.nav-collapse' data-toggle='collapse'>
            <span class='icon-bar'></span>
            <span class='icon-bar'></span>
            <span class='icon-bar'></span>
          </a>
          <g:link controller="home" class="brand">makingdevs</g:link>
          <div class='nav-collapse subnav-collapse collapse pull-right' id='top-navigation'>
            <ul class='nav'>
              <li>
                <g:link controller="home">Home</g:link>
              </li>
              <li>
                <g:link mapping="training">Cursos</g:link>
              </li>
              <li>
                <g:link controller="home" action="contact">Contacto</g:link>
              </li>
              <sec:ifLoggedIn>
              <li>
                <g:link controller="perfil">Mi perfil</g:link>
              </li>
              <li>
                <g:link controller="payment">Pagos</g:link>
              </li>
              <li>
                <g:link controller="logout">Salir</g:link>
              </li>
              </sec:ifLoggedIn>
            </ul>
            <div class='top-account-control visible-desktop'>
              <sec:ifNotLoggedIn>
                <g:link controller="signUp" class="top-create-account">Crear cuenta</g:link>
                <g:loginForm/>
              </sec:ifNotLoggedIn>
              <sec:ifLoggedIn>
                <sec:loggedInUserInfo field="username"/>
              </sec:ifLoggedIn>
            </div>
          </div>
        </div>
      </div>
    </div>
  </header>

  <g:render template="/common/messages" />
        
  <g:layoutBody/>

  <footer>
    <div class='pre-footer'>
      <div class='container'>
        <div class='row'>
          <div class='span4'>
            <div class='footer-logo'>
              <a>Making<strong>Devs</strong></a>
            </div>
            <ul class='footer-address'>
              <li>
                <strong>Dirección:</strong>
                Av. México 145, Int. 404<br/>
                Del Carmen Coyoacán, Coyoacán, MX
              </li>
              <li>
                <strong>Teléfono:</strong>
                6363 - 8147
              </li>
              <li>
                <strong>Correo:</strong>
                info@makingdevs.com
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
    <div class='deep-footer'>
      <div class='container'>
        <div class='row'>
          <div class='span6'>
            <div class='copyright'>Copyright &copy; 2013 MakingDevs SC. All rights reserved.</div>
          </div>
        </div>
      </div>
    </div>
  </footer>

  <r:layoutResources/>
  <g:googleAnalyticsTracker/>
  </body>
</html>
