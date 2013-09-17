class window.ButtonLoader
  constructor : (@buttonId) ->
  preload : ->
    element = $("a[name=paymentRegistration" + @buttonId + "] > i")
    classes = element.attr("class").split(" ")
    element.removeClass(c) for c in classes
    element.addClass('icon-refresh icon-spin')