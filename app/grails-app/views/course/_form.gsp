<%@ page import="com.makingdevs.Course" %>

<div class="control-group ${hasErrors(bean: courseInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="course.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="100" required="" value="${courseInstance?.name}" class="span6"/>
</div>

<div class="control-group ${hasErrors(bean: courseInstance, field: 'overview', 'error')} required">
	<label for="overview">
		<g:message code="course.overview.label" default="Overview" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="overview" class="span6" rows="10" maxlength="1000" required="" value="${courseInstance?.overview}"></g:textArea>
</div>

<div class="control-group ${hasErrors(bean: courseInstance, field: 'audience', 'error')} required">
	<label for="audience">
		<g:message code="course.audience.label" default="Audience" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="audience" class="span6" rows="10" maxlength="1000" required="" value="${courseInstance?.audience}"/>
</div>

<div class="control-group ${hasErrors(bean: courseInstance, field: 'prerequisites', 'error')} required">
	<label for="prerequisites">
		<g:message code="course.prerequisites.label" default="Prerequisites" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="prerequisites" class="span6" rows="10" maxlength="1000" required="" value="${courseInstance?.prerequisites}"/>
</div>

<div class="control-group ${hasErrors(bean: courseInstance, field: 'goal', 'error')} required">
	<label for="goal">
		<g:message code="course.goal.label" default="Goal" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="goal" class="span6" rows="10" maxlength="1000" required="" value="${courseInstance?.goal}"/>
</div>

<div class="control-group ${hasErrors(bean: courseInstance, field: 'content', 'error')} required">
	<label for="content">
		<g:message code="course.content.label" default="Content" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="content" class="span6" rows="10" maxlength="1000" required="" value="${courseInstance?.content}"/>
</div>

<div class="control-group ${hasErrors(bean: courseInstance, field: 'courseKey', 'error')} required">
	<label for="courseKey">
		<g:message code="course.courseKey.label" default="Course Key" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="courseKey" maxlength="20" required="" value="${courseInstance?.courseKey}"/>
</div>

<div class="control-group ${hasErrors(bean: courseInstance, field: 'courseStatus', 'error')} required">
	<label for="courseStatus">
		<g:message code="course.courseStatus.label" default="Course Status" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="courseStatus" from="${com.makingdevs.CourseStatus?.values()}" keys="${com.makingdevs.CourseStatus.values()*.name()}" required="" value="${courseInstance?.courseStatus?.name()}"/>
</div>

