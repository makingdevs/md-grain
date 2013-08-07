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

              </p>
              <p>

              </p>
              <blockquote class="colored">
                <p></p>
              </blockquote>
              <p></p>
              <p>

              </p>
            </div>
          </div>

        </div>
        <div class="span4">
          <div class="blog-side-bar">

            <div class="blog-recent-tweets widget-tp">
              <h3>
              <i class="icon-calendar"></i>
                Siguientes fechas:
              </h3>
              <ul>
                <li>
                  <a href="#">about 7 hours ago</a>
                  Aliquam vehicula tristique turpis dignissim accumsan
                  <a href="#">soziev.com</a>
                </li>
                <li>
                  <a href="#">about 7 hours ago</a>
                  Aliquam vehicula tristique turpis dignissim accumsan
                  <a href="#">soziev.com</a>
                </li>
                <li>
                  <a href="#">about 7 hours ago</a>
                  Aliquam vehicula tristique turpis dignissim accumsan
                  <a href="#">soziev.com</a>
                </li>
              </ul>
            </div>

            <div class="blog-side-search widget-tp">

              <h3>
                <i class="icon-keyboard"></i>
                ¿Estás listo para tomar el curso?
              </h3>
              <button class="btn btn-large btn-block btn-success" type="button">
                Contestar la evaluación
              </button>
            </div>
            <div class="blog-categories widget-tp">
              <g:coursesPerCategory name="${category}" currentCourse="${course.id}"/>
            </div>
            
          </div>
        </div>
      </div>
    </div>
  </section>
</body>
</html>