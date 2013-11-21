$(document).ready(function(){
$("#nextquestion").click(function(){
  $.post("testcontroller.html",function(data,status){
	if(status == "success")
    $("#left").html(data);
  });
});
});
