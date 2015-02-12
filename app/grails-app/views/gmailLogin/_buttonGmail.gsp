<span id="signinButton">
  <span
    class="g-signin"
    data-callback="signinGmailCallback"
    data-clientid="${grailsApplication.config.social.gmail.clientId}"
    data-cookiepolicy="single_host_origin"
    data-requestvisibleactions="http://schemas.google.com/AddActivity"
    data-scope="https://www.googleapis.com/auth/plus.login">
  </span>
</span>
<input id="urlGmailLogin" type="hidden" value="${createLink(controller:'gmailLogin', action:'index')}"/>