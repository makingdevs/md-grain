// This is a manifest file that'll be compiled into application.js.
//
// Any JavaScript file within this directory can be referenced here using a relative path.
//
// You're free to add application-wide JavaScript to this file, but it's generally better
// to create separate JavaScript files as needed.
//
//= require third-party/jquery/dist/jquery
//= require third-party/bootstrap/docs/assets/js/bootstrap
//= require third-party/verena/js/prettify
//= require third-party/verena/js/js/lightbox
//= require third-party/verena/js/main
//= require api.google.login
//= require third-party/wysihtml5/dist/wysihtml5-0.3.0
//= require third-party/bootstrap-wysihtml5/src/bootstrap-wysihtml5
//= require third-party/bootstrap-wysihtml5/dist/bootstrap-wysihtml5-0.0.2
//= require telefono/index
//= require util/loader
//= require third-party/dropzone/dist/dropzone
//= require third-party/verena/js/colpick
//= require third-party/verena/js/colPickFunction
//= require third-party/moment/min/moment.min
//= require third-party/fullcalendar/dist/fullcalendar
//= require third-party/fullcalendar/dist/lang-all
//= require analytics
//= require_self

if (typeof jQuery !== 'undefined') {
  (function($) {
    $('#spinner').ajaxStart(function() {
      $(this).fadeIn();
    }).ajaxStop(function() {
      $(this).fadeOut();
    });
  })(jQuery);
}
