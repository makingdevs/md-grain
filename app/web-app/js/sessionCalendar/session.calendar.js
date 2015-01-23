var sessionCalendar = (function(){
  var selectorCalendar = "#calendar",
      urlCourseSessions = "#urlCourseSessions",
      courses = [],
      selectorListCourse = "#listCourseSession",
  //functions
  initModule, getCoursesByMonth, renderListCourse;

  renderListCourse = function(){
    var elementListCourses = $(selectorListCourse);
    var tempElementLi 
    $.each(courses, function(index, course) {
      tempElementLi = "<li><strong>"+course.title+"</strong> <small>"+course.startTime+" a "+course.endTime+" hrs</small></li>"
      elementListCourses.append(tempElementLi);
    });
  };

  getCoursesByMonth = function(){
    var url = $(urlCourseSessions).val();
    $.ajax({
      type: "POST",
      url: url,
      async: false
    })
    .done(function( coursesData ) {
        courses = coursesData;
        renderListCourse();
    });
  };

  initModule = function(){
    getCoursesByMonth();
    $(selectorCalendar).fullCalendar({
      lang: 'es',
      events: courses
    });
  };

  return {
    initModule : initModule
  };
}());

sessionCalendar.initModule();