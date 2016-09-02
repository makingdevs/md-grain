class window.ButtonLoader
  buttonId: 0
  tagName: ''

  constructor : (buttonId, tagName) ->
    @buttonId = buttonId
    @tagName = tagName

  preload : ->
    element = $("a[name="+ @tagName + @buttonId + "] > i")
    classes = element.attr("class").split(" ")
    element.removeClass(c) for c in classes
    element.addClass('icon-refresh icon-spin')
    
  success : (message) ->
    messages = $("#messages").show()
    okMessage = messages.find("div.ok").clone().removeClass("ok")
    okMessage.appendTo("#messagesArea")
    okMessage.find("span.message").html(message)
    okMessage.show()

  complete: ->
    element = $("a[name="+ @tagName + @buttonId + "] > i")
    classes = element.attr("class").split(" ")
    element.removeClass(c) for c in classes
    element.addClass('icon-ok')
    element.parent("a").addClass("disabled")
    element.parent("a").delay(1000).fadeOut()