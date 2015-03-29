<%@ page import="com.makingdevs.Category" %>



<div class="fieldcontain ${hasErrors(bean: categoryInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="category.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="100" required="" value="${categoryInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: categoryInstance, field: 'description', 'error')} required">
	<label for="description">
		<g:message code="category.description.label" default="Description" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="description" cols="40" rows="5" maxlength="1000" required="" value="${categoryInstance?.description}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: categoryInstance, field: 'code', 'error')} ">
	<label for="code">
		<g:message code="category.code.label" default="Code" />
		
	</label>
	<g:textField name="code" maxlength="25" value="${categoryInstance?.code}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: categoryInstance, field: 'courses', 'error')} ">
	<label for="courses">
		<g:message code="category.courses.label" default="Courses" />
		
	</label>
	<g:select name="courses" from="${com.makingdevs.Course.list()}" multiple="multiple" optionKey="id" size="5" value="${categoryInstance?.courses*.id}" class="many-to-many"/>
</div>

