$(document).ready(function(){
$("#send").click(function(){
	var phone=$("#phoneNo").val();
	var msg=$("#msg").val();
	
	if(mobileValidation(phone)==false) {
		return ;
	}
	if(msg=="Message To Send")
	{
		alert("Please enter msg");
		return ;
	}
	var param={"phoneNo":phone,"msg":msg};
	$.post("sendsms.html", param,function(result){alert(result);$("#phoneNo").val("");$("#msg").val("");});
});
$("#msg").keypress(function(){

$("#count").html(100-$("#msg").val().length);

});
$("#msg").change(function(){

$("#count").html(100-$("#msg").val().length);

});
});
function mobileValidation(a)
{
if(a=="")
{
alert("please Enter the Contact Number");
return false;
}
if(isNaN(a))
{
alert("Enter the valid Mobile Number(Like : 9566137117)");
return false;
}
if((a.length < 1) || (a.length > 10))
{
alert(" Your Mobile Number must be 1 to 10 Integers");
return false;
}
}