<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
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
          <a href="index.html" class="brand">MakingDevs</a>
          <div class='nav-collapse subnav-collapse collapse pull-right' id='top-navigation'>
            <ul class='nav'>
              <li class='active'>
                <g:link controller="home">Home</g:link>
              </li>
              <li class=''>
                <a href="contact.html">Contact</a>
              </li>
            </ul>
            <div class='top-account-control visible-desktop'>
              <a href="features/pricing_tables.html" class="top-create-account">Crear cuenta</a>
              <a href="#" class="top-sign-in">Ingresa</a>
              <div class='login-box'>
                <a class='close login-box-close' href='#'>&times;</a>
                <h4 class='login-box-head'>Login Form</h4>
                <div class='control-group'>
                  <label>Username</label>
                  <input class='span2' placeholder='Input username...' type='text'>
                </div>
                <div class='control-group'>
                  <label>Password</label>
                  <input class='span2' placeholder='Input password...' type='text'>
                </div>
                <div class='login-actions'>
                  <button class='btn btn-primary'>Log Me In</button>
                </div>
              </div>
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
                (551) 850-3073
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
            </body>
          </html>
