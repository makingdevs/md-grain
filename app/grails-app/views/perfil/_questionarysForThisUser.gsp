<%@ page import="com.makingdevs.QuestionaryPerInstanceStatus" %>
<div>
    <h4>Tus Cuestionarios</h4>
    <ul>
      <g:each in="${questionaryPerInstanceLinks}" var="questionaryLink">
        <li>
          <p>Titulo: ${questionaryLink.questionaryPerInstance.questionary.title}</p>
          <p>Estatus:
            <g:if test="${questionaryLink?.questionaryPerInstance?.questionaryPerInstanceStatus==QuestionaryPerInstanceStatus.CONTESTADO}">
              <span class="label label-success">Contestado</span>
            </g:if>
            <g:else>
              <span class="label label-info">Sin contestar</span>
            </g:else>
          </p>
          <g:if test="${questionaryLink?.questionaryPerInstance?.questionaryPerInstanceStatus==QuestionaryPerInstanceStatus.CONTESTADO}">
            <g:link class="btn-small btn-primary" controller="evaluate" action="evaluateQuestionary" params="[questionaryPerInstance:questionaryLink?.questionaryPerInstance?.id,questionaryPerInstanceLink:questionaryLink?.id,url:request.forwardURI]">
              <i class='icon-search icon-white'></i> Ver
            </g:link>
          </g:if>
          <g:elseif test="${questionaryLink?.questionaryPerInstance?.questionaryPerInstanceStatus==QuestionaryPerInstanceStatus.SIN_CONTESTAR}">
            <g:link class="btn-small btn-primary" controller="questionary" action="answerQuestionary" params="[id:questionaryLink.questionaryPerInstance.id,idQL:questionaryLink.id,url:request.forwardURI]">
              <i class='icon-pencil icon-white'></i> Contestar
            </g:link>
        </g:elseif>
        </li>
      </g:each>
    </ul>
</div>