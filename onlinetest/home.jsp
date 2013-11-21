<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@page  contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<title>Home</title>
<jsp:include page="base/head.jsp"></jsp:include>
</head>
<body>
<div id="wrapper">
  <div id="content">
   <jsp:include page="base/menu.jsp"></jsp:include>
   <jsp:include page="base/search.jsp"></jsp:include>
    <div class="x"></div>
   <jsp:include page="base/slider.jsp"></jsp:include>
    <!-- main content -->
    <div id="left">
      <jsp:include page="home/content.jsp"></jsp:include>
	  </div>
    <!-- sidebar -->
    <div id="right">
     <jsp:include page="home/login.jsp"></jsp:include>
    </div>
    <div class="x"></div>
    <div class="break"></div>
    <!-- small posts -->
    <div id="feature">
      <div class="small-post"> <img src="images/clean.jpg" alt="" />
        <h1><a href="#">Clean and Simple</a></h1>
        <p><strong>DesignHQ</strong> is a sleek modern theme best suited for business or portfolio site. It's ready out of the box and comes with all needed pages - home, category, inner and contact form with all css styled elements.</p>
      </div>
      <div class="small-post"> <img src="images/newtech.jpg" alt="" />
        <h1><a href="#">jQuery Powered</a></h1>
        <p>This template uses jQuery to enhance usability and visual performance:</p>
        <ul>
          <li>Custom drop down menu</li>
          <li>Ajax powered contact form</li>
          <li>preetyPhoto plugin</li>
        </ul>
      </div>
      <div class="small-post last"> <img src="images/contact.jpg" alt="" />
        <h1><a href="#">Contact Us</a></h1>
        <p>Contact form is ready to use. It works with ajax and simple PHP script that sends user submited data directly to your email. Contact form is build with Javascript math captcha to protect you from spam.</p>
      </div>
      <div class="x"></div>
    </div>
  </div>
  <jsp:include page="base/footer.jsp"></jsp:include>
</div>
<!-- gallery starter and prettyPhoto starter -->
<script type="text/javascript">
jGallery('slider');
$(document).pngFix();
$(document).ready(function(){
	$("a[rel^='prettyPhoto']").prettyPhoto();
});
</script>
</html>
