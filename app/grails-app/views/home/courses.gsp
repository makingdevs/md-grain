<html>
<head>
  <meta name="layout" content="venera"/>
</head>
<body>

  <section class='section-wrapper about-page-w'>
    <div class='container'>
      <h1 class='section-main-header'>Nuestro entrenamiento</h1>
      <g:each in="${categories}" var="category">
        <g:render template="/category/show" model="[category:category]" />
      </g:each>
  </section>

</body>
</html>
