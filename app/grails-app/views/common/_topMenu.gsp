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
                <g:link mapping="calendar">Calendario</g:link>
              </li>
              <li>
                <g:link controller="home" action="contact">Contacto</g:link>
              </li>

              <sec:ifLoggedIn>
              <li>
                <g:link controller="myTraining" action="index">Mi entrenamiento</g:link>
              </li>
              <li>
                <g:link controller="perfil">Mi perfil</g:link>
              </li>
              <!--li>
                <g:link mapping="myPayments">Pagos</g:link>
              </li-->
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