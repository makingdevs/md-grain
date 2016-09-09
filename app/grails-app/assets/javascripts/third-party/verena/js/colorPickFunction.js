$(function() {
  var $myArray = [ $('#picker1').attr("value"),$('#picker2').attr("value"),$('#picker3').attr("value") ];
  console.log($myArray);
  $('#picker1').colpick({
    layout:'hex',
    submit:0,
    colorScheme:'dark',
    color:$myArray[0],
    onChange:function(hsb,hex,rgb,el,bySetColor) {
      $(el).css('border-color','#'+hex);
      if(!bySetColor) $(el).val(hex);
    }
  }).keyup(function(){
    $(this).colpickSetColor(this.value);
  });
  $('#picker2').colpick({
    layout:'hex',
    submit:0,
    colorScheme:'dark',
    color:$myArray[1],
    onChange:function(hsb,hex,rgb,el,bySetColor) {
      $(el).css('border-color','#'+hex);
      if(!bySetColor) $(el).val(hex);
    }
  }).keyup(function(){
    $(this).colpickSetColor(this.value);
  });
  $('#picker3').colpick({
    layout:'hex',
    submit:0,
    colorScheme:'dark',
    color:$myArray[2],
    onChange:function(hsb,hex,rgb,el,bySetColor) {
      $(el).css('border-color','#'+hex);
      if(!bySetColor) $(el).val(hex);
    }
  }).keyup(function(){
    $(this).colpickSetColor(this.value);
  });
  $('#picker1').css({
    'border-right':'20px solid #'+$myArray[0]
  });
  $('#picker2').css({
    'border-right':'20px solid #'+$myArray[1]
  });
  $('#picker3').css({
    'border-right':'20px solid #'+$myArray[2]
  });
});
