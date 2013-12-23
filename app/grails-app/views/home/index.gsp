<html>
  <head>
		<meta name="layout" content="venera"/>
  </head>
  <body>
    
  <div class='carousel slide over-something' id='homepage-carousel'>
    <div class='carousel-inner slider-w'>
      <div class='active item'>
        <div class='container'>
          <h1 class='slider-header'>Making best code, through better developers.</h1>
          <h2 class='slider-sub-header'>Impulsamos la carrera de los desarrolladores de software.</h2>
          <div class='slider-browsers-w clearfix'>
            <div class='slider-browser slider-browser-left hidden-phone' data-position-bottom='-8%'>
              <r:img alt="Browser-window-1" uri="/assets/images/window-1.png" />
            </div>
            <div class='slider-browser slider-browser-center' data-position-bottom='-9%'>
              <r:img alt="Browser-window-2" uri="/assets/images/makingdevs_1.png" />
            </div>
            <div class='slider-browser slider-browser-right hidden-phone' data-position-bottom='-8%'>
              <r:img alt="Browser-window-3" uri="/assets/images/window-3.png" />
            </div>
          </div>
        </div>
      </div>
      <div class='item'>
        <div class='container'>
          <h1 class='slider-header'>Mentoría, entrenamiento y desarrollo de software.</h1>
          <h2 class='slider-sub-header'>Ofrecemos: Técnicas, métodos, metodologías y tecnología.</h2>
          <div class='row zoomed-browsers-w'>
            <div class='span4'>
              <div class='zoomed-browser'>
                <r:img alt="Browser-window-1" uri="/assets/images/window-1.png" />
              </div>
            </div>
            <div class='span4'>
              <div class='zoomed-browser hidden-phone'>
                <r:img alt="Browser-window-2" uri="/assets/images/makingdevs_1.png" />
              </div>
            </div>
            <div class='span4'>
              <div class='zoomed-browser hidden-phone'>
                <r:img alt="Browser-window-3" uri="/assets/images/window-3.png" />
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <a class='carousel-control left' data-slide='prev' href='#homepage-carousel'>
      <i class='icon-chevron-left'></i>
    </a>
    <a class='carousel-control right' data-slide='next' href='#homepage-carousel'>
      <i class='icon-chevron-right'></i>
    </a>
  </div>
  <div class='sub-slider-features'>
    <div class='container'>
      <div class='row'>
        <div class='span4'>
          <div class='info-bullet'>
            <i class='icon-coffee'></i>
            <h5>Apasionados</h5>
            <p>Desarrollar software es una disciplina que nos genera mucha satisfacción, alimenta el entusiasmo.</p>
          </div>
        </div>
        <div class='span4'>
          <div class='info-bullet'>
            <i class='icon-code'></i>
            <h5>Mejor software</h5>
            <p>Estamos en continuo crecimiento y cada vez encontramos mejores formas de desarrollar software.</p>
          </div>
        </div>
        <div class='span4'>
          <div class='info-bullet'>
            <i class='icon-beer'></i>
            <h5>Disfrutamos</h5>
            <p>Resolver retos es inspirador, y queremos compartir nuestro gusto con la comunidad.</p>
          </div>
        </div>
      </div>
    </div>
  </div>
  <section class='section-wrapper under-slider'>
    <div class='container'>
      <div class='row'>
        <div class='span12'>
          <h3 class='section-header'>Nuestra oferta</h3>
        </div>
        <g:each in="${categories}" var="category">
          <div class='span3'>
            <div class='white-card'>
              <div class="img-w hover-fader">
                <!--a href="assets/images/test-square.png" data-rel="lightbox[gallery]"-->
                  <r:img alt="${category.code.toLowerCase()}_main" uri="/assets/images/${category.code.toLowerCase()}_main.png" />
                  <!--span class="hover-fade"-->
                  <!--i class="icon-zoom-in"></i-->
                  <!--/span-->
                </a>
              </div>
              <h5>${category.name}</h5>
              <p>${category.description}</p>
            </div>
          </div>
        </g:each>
      </div>
    </div>
  </section>
  <section class='section-wrapper'>
    <div class='container'>
      <div class='row'>
        <div class='span6'>
          <h3 class='section-header'>Nuestra filosofía</h3>
          <div class='testimonials'>
            <div class='testimonials-users row hidden-phone'>
              <div class='span1'>
                <a class='testimonials-user-w active' data-toggle='testimonial' href='#testimonial1'>
                  <span class='testimonials-user'>
                    <r:img alt="Avatar-1" uri="/assets/images/test-user.png" />
                  </span>
                </a>
              </div>
            </div>
            <div class='testimonials-speeches'>
              <div class="testimonials-speech active" id="testimonial1">
                <p>
                  <strong>Desarrolladores satisfechos y motivados crean mejor software.</strong>
                  Creo que los más importante para un desarrollador deberían ser sus intereses personales, y dándole la oportunidad de atenderlos puede estar mejor enfocado para contribuir en cualquier forma con la solución de un problema, ya sea parcial o total.
                </p>
                <div class="speech-by">José Juan R. Zuñiga, Desarrollador</div>
              </div>
            </div>
          </div>
        </div>
        <div class="span6">
          <h3 class="section-header">Nuestros servicios</h3>
          <div class="accordion" id="accordion">
            <div class="accordion-group">
              <div class="accordion-heading">
                <a class="accordion-toggle" data-parent="#accordion" data-toggle="collapse" href="#collapseOne">
                  Mentoría a grupos 
                </a>
              </div>
              <div class="accordion-body collapse in" id="collapseOne">
                <div class="accordion-inner">
                  Actualmente queremos encontrar mejores formas de lograr objetivos que plantean las organizaciones, o bien, determinar la viabilidad y estimación de un proyecto de software que puede llegar a ser caótico, es por esto, que contamos con un servicio de guía a grupos de trabajo que permitirá mejorar la forma en que realizan estimados, compromisos y viabilidad de funcionalidades en un producto de software.
                </div>
              </div>
            </div>
            <div class="accordion-group">
              <div class="accordion-heading">
                <a class="accordion-toggle" data-parent="#accordion" data-toggle="collapse" href="#collapseTwo">
                  Entrenamiento 
                </a>
              </div>
              <div class="accordion-body collapse" id="collapseTwo">
                <div class="accordion-inner">
                  El uso de técnicas, métodos y tecnologías es importante para los desarrolladores de software, es por esto que contamos con cursos de entrenamiento en los temas de importancia en la industria, aplicados con experiencia obtenida en proyectos realizados por nuestros instructores; además, adoptamos continuamente herramientas que nos ayuden a transmitir el conocimiento preciso a nuestros colegas.
                </div>
              </div>
            </div>
            <div class="accordion-group">
              <div class="accordion-heading">
                <a class="accordion-toggle" data-parent="#accordion" data-toggle="collapse" href="#collapseThree">
                  Desarrollo de software 
                </a>
              </div>
              <div class="accordion-body collapse" id="collapseThree">
                <div class="accordion-inner">
                  Todos los días desarrollamos software, para nosotros mismos o para nuestros clientes; encontramos formas efectivas de resolver retos y estamos en busca de más, si deseas compartir algún problema con nosotros y ayudarte a resolverlo con mucho gusto podemos colaborar contigo para hacerlo. Contáctanos a <strong>info@makingdevs.com</strong>.
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!--section class='section-wrapper stripped'>
    <div class='container'>
      <div class='row clients-w'>
        <div class='span12'>
          <h3 class='section-header'>Comunidades de desarrolladores de software</h3>
        </div>
        <div class='span2'>
          <div class='white-card'>
            <r:img alt="Client-1" uri="/assets/images/artesanos.png" />
          </div>
        </div>
        <div class='span2'>
          <div class='white-card'>
            <r:img alt="Client-2" uri="/assets/images/escala.png" />
          </div>
        </div>
        <div class='span2'>
          <div class='white-card'>
            <r:img alt="Client-3" uri="/assets/images/grails.png" />
          </div>
        </div>
        <div class='span2'>
          <div class='white-card'>
            <r:img alt="Client-4" uri="/assets/images/recursivo.png" />
          </div>
        </div>
        <div class='span2'>
          <div class='white-card'>
            <r:img alt="Client-5" uri="/assets/images/spring.png" />
          </div>
        </div>
        <div class='span2'>
          <div class='white-card'>
            <r:img alt="Client-6" uri="/assets/images/vivecodigo.png" />
          </div>
        </div>
      </div>
    </div>
  </section-->

  </body>
</html>
