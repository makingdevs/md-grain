// Generated by CoffeeScript 1.4.0
(function() {

  window.ButtonLoader = (function() {

    function ButtonLoader(buttonId, labelName) {
      this.buttonId = buttonId;
      this.labelName = labelName;
    }

    ButtonLoader.prototype.preload = function() {
      var c, classes, element, _i, _len;
      element = $("a[name=paymentRegistration" + this.buttonId + "] > i");
      classes = element.attr("class").split(" ");
      for (_i = 0, _len = classes.length; _i < _len; _i++) {
        c = classes[_i];
        element.removeClass(c);
      }
      return element.addClass('icon-refresh icon-spin');
    };

    ButtonLoader.prototype.success = function() {
      var messages, okMessage;
      messages = $("#messages").show();
      okMessage = messages.find("div.ok").clone().removeClass("ok");
      okMessage.appendTo("#messagesArea");
      return okMessage.show();
    };

    ButtonLoader.prototype.complete = function() {
      var c, classes, element, _i, _len;
      element = $("a[name=paymentRegistration" + this.buttonId + "] > i");
      classes = element.attr("class").split(" ");
      for (_i = 0, _len = classes.length; _i < _len; _i++) {
        c = classes[_i];
        element.removeClass(c);
      }
      element.addClass('icon-ok');
      element.parent("a").addClass("disabled");
      return element.parent("a").delay(1000).fadeOut();
    };

    return ButtonLoader;

  })();

}).call(this);
