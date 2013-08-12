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
            <h1 class="post-title">${course.name}.</h1>
            
            <div class="post-content">
              <p>
              ${course.overview}
              </p>
              <p><h4>A quien va dirigido:</h4>
              ${course.audience}
              </p>
              <blockquote class="colored">
                <p>${course.goal}</p>
              </blockquote>
              <p>
              <h4>Pre-requisitos:</h4>
              ${course.prerequisites}
              </p>
            </div>
          </div>

        </div>
        <div class="span4">
          <div class="blog-side-bar">

            <g:scheduledCourses currentCourse="${course.id}">
            </g:scheduledCourses>

            <div class="blog-side-search widget-tp">

              <h3>
                <i class="icon-keyboard"></i>
                ¿Estás listo para tomar el curso?
              </h3>
              <button class="btn btn-large btn-block btn-success" type="button">
                Contestar la evaluación(Próximamente)
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