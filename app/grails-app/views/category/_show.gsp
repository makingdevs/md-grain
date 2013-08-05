<div class='row row-separated'>
  <div class="span7">
    <h3 class="section-header">${category.name}</h3>
    <p class="section-paragraph">
      ${category.description}
    </p>
    <p>
      <ul>
        <g:each in="${category.courses}" var="course">
          <li>${course.name}</li>
        </g:each>
      </ul>
    </p>
  </div>
  <div class="span5">
    <r:img alt="Browser-window-2" uri="/assets/images/browser-window.png"/>
  </div>
</div>