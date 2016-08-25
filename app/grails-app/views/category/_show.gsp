<%@ page import="com.makingdevs.CourseStatus" %>
<div class='row row-separated'>
  <div class="span7">
    <h3 class="section-header">${category.name}</h3>
    <p class="section-paragraph">
      ${category.description}
    </p>
    <p>
      <ul>
        <g:each in="${category.courses}" var="course">
          <li>
            <g:if test="${course.courseStatus == CourseStatus.LIVE}">
              <g:link controller="course" action="landingPage" id="${course.courseKey.toLowerCase()}" params="[category:category.code.toLowerCase()]">
                ${course.name} 
              </g:link>
            </g:if>
            <g:else>
              ${course.name} 
            </g:else>
            <g:if test="${course.courseStatus == CourseStatus.DRAFT}">
              <span class="label label-default">Muy pronto!</span>
            </g:if>
            <g:if test="${course.courseStatus == CourseStatus.NEW}">
              <span class="label label-info">Nuevo</span>
            </g:if>
            <g:if test="${course.courseStatus == CourseStatus.LIVE}">
              <span class="label label-success">Entra!</span>
            </g:if>
          </li>
        </g:each>
      </ul>
    </p>
  </div>
  <div class="span5">
    <g:if test="${category.code}">
      <r:img alt="Browser-window-${category.id}" uri="/assets/images/${category.code.toLowerCase()}.png"/>
    </g:if>
    <g:else>
      <r:img alt="Browser-window-${category.id}" uri="/assets/images/browser-window.png"/>
    </g:else>
  </div>
</div>