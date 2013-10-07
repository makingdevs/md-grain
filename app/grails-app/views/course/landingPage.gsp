<html>
<head>
  <meta name="layout" content="venera"/>
  <title>${course.name}</title>
</head>
<body>
  <section class="section-wrapper post-w">
    <div class="container">
      <div class="row">
        <div class="span8">
          <div class="single-post-w">
            <h1 class="post-title">${course.name} </h1>
            
            <div class="post-content">
              <p>
              <i class="icon-terminal"></i> ${course.overview}
              </p>
              <p><h4><i class="icon-male"></i> · A quien va dirigido:</h4>
              ${course.audience}
              </p>
              <blockquote class="colored">
                <p>${course.goal}</p>
              </blockquote>
              <p>
              <h4><i class="icon-road"></i> · Temario del entrenamiento:</h4>
              ${course.content}
              </p>
              <p>
              <h4><i class="icon-tasks"></i> · Pre-requisitos:</h4>
              ${course.prerequisites}
              </p>
            </div>
          </div>

        </div>
        <div class="span4">
          <div class="blog-side-bar">

            <g:scheduledCourses currentCourse="${course.id}">
              <div class="blog-recent-tweets widget-tp">
                <h3><i class="icon-calendar"></i>Siguientes fechas:</h3>
                <ul>
                  <g:each in="${scheduledCourses}" var="sc">
                  <li>
                    Inicia: <b>${formatDate(date:sc.beginDate,format:"dd - MMMM - yyyy")}</b><br/>
                    Fecha límite: <b>${formatDate(date:sc.limitRegistrationDate,format:"dd - MMMM - yyyy")}</b><br/>
                    Duración: <b>${sc.durationInHours} horas</b><br/>
                    Costo: <b>$ <g:formatNumber number="${sc.esquemaDePago.cantidadDePago}" format="###,##0.00" locale="es_MX"/> mxn.</b><br/>
                    Aprovecha y alcanza el <b><g:formatNumber number="${sc.esquemaDePago.descuentos.sum(0) { it.porcentaje } }" format="###,##0" locale="es_MX"/>%</b> de descuento.
                    <hr/>
                    <g:link controller="registration" id="${sc.id}" class="btn btn-success">
                      <i class='icon-book'></i> Registrate a este curso!
                    </g:link>
                  </li>
                  </g:each>
                </ul>
              </div>
            </g:scheduledCourses>

            <div class="blog-side-search widget-tp">

              <h3>
                <i class="icon-keyboard"></i>
                ¿Estás listo para tomar el curso?
              </h3>
              <button class="btn btn-large btn-block btn-success" type="button">
                Evaluación previa (Próximamente)
              </button>
            </div>
            <div class="blog-categories widget-tp">
              <g:coursesPerCategory code="${category}" currentCourse="${course.id}"/>
            </div>
            
          </div>
        </div>
      </div>
    </div>
  </section>
</body>
</html>