<html class="no-js">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <meta name="description" content="Impulsamos la carrera de los desarrolladores de software a través de Técnicas, métodos. metodologías y tecnología" />
  <meta name="keywords" content="agile,groovy,grails,spring,jquery,desarrollo de software,entrenamiento,cursos" />
  <title>. : MakingDevs - <g:layoutTitle default="Welcome"/> : .</title>
  <meta name="viewport" content="width=device-width">
  <link href="http://fonts.googleapis.com/css?family=Abel:400|Oswald:300,400,700" media="all" rel="stylesheet" type="text/css" />
  <asset:javascript src="application.js" />
  <asset:stylesheet href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/2.3.2/css/bootstrap.css" />
  <asset:stylesheet href='third-party/bootstrap-wysihtml5/dist/bootstrap-wysihtml5-0.0.2.css' />
  <asset:stylesheet href='third-party/colorpicker/jquery.colorpicker.css' />
  <asset:stylesheet href='third-party/dropzone/dist/basic.css' />
  <asset:stylesheet href='third-party/dropzone/dist/dropzone.css' />
  <asset:stylesheet href='third-party/fullcalendar/dist/fullcalendar.css' />
  <asset:stylesheet href='third-party/fullcalendar/dist/fullcalendar.print.css' />
  <asset:stylesheet href='third-party/lightbox2/dist/lightbox.css' />
  <asset:stylesheet href='third-party/verena/css/theme_venera_blue.css' />
  <asset:stylesheet href='third-party/font-awesome/css/font-awesome.css' />

  <g:layoutHead/>

</head>
<body>

  <g:render template="/common/topMenu" />

  <header class="jumbotron subhead" id="overview">
    <div class="container">
      <div class="docs-header-icon">
        <h1><i class="${pageIco ?: 'icon-laptop'}"></i> · ${mainTitle ?: 'Mi entrenamiento'}</h1>
        <g:set var="username" value="${sec.loggedInUserInfo(field:'username')}"/>
        <p class="lead">${username ?: 'Desarrollador de software'}</p>
      </div>
    </div>
  </header>

  <g:render template="/common/messages" />

  <section class="section-wrapper">
    <div class="container-fluid">
      <div class="row-fluid">
        <div class="span2 well well-small">
          <ul class="nav nav-list">
            <li class="">
              <g:link controller="myTraining">
                <i class="icon-fixed-width icon-book"></i> Mis registros
              </g:link>
            </li>
            <li class="">
              <g:link controller="payment" action="myPayments">
                <i class="icon-fixed-width icon-usd"></i> Mis pagos
              </g:link>
            </li>
            <li class="">
              <g:link controller="attendee" action="mySessions">
                <i class="icon-fixed-width icon-calendar"></i> Mis sesiones
              </g:link>
            </li>
            <!--li class="">
              <a href="#"><i class="icon-fixed-width icon-road"></i> Historial académico</a>
            </li-->
          </ul>
        </div>
        <div class="span10">
          <div class="white-card extra-padding">
            <g:layoutBody/>
          </div>
        </div>
      </div>
    </div>
  </section>

  <g:render template="/common/footer" />

  <r:layoutResources/>
  </body>
</html>
