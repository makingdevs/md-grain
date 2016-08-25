<%@ page import="com.makingdevs.RegistrationStatus" %>

<g:if test="${currentStatus == RegistrationStatus.REGISTERED}">
  <span class="label">
    ${currentStatus}
  </span>
</g:if>

<g:if test="${currentStatus == RegistrationStatus.INSCRIBED_AND_WITH_DEBTH || currentStatus == RegistrationStatus.INSCRIBED_AND_WITH_DEBTH_IN_GROUP}">
  <span class="label label-warning">
    ${currentStatus}
  </span>
</g:if>

<g:if test="${currentStatus == RegistrationStatus.INSCRIBED_AND_PAYED || currentStatus == RegistrationStatus.INSCRIBED_AND_PAYED_IN_GROUP}">
  <span class="label label-success">
    ${currentStatus}
  </span>
</g:if>

<g:if test="${currentStatus == RegistrationStatus.FINISHED}">
  <span class="label label-info">
    ${currentStatus}
  </span>
</g:if>

<g:if test="${currentStatus == RegistrationStatus.CANCELLED}">
  <span class="label label-inverse">
    ${currentStatus}
  </span>
</g:if>