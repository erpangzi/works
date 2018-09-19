<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<%-- 	<script type="text/javascript" src="${pageContext.request.contextPath }/back/script/jquery.js"></script>
		
	<script type="text/javascript">
		window.onload(function() {
			function pathphoto(path){
				document.getElementsByName("photo")[0].value="/springmvc"+path;
			}
		})
	</script> --%>
	
  </head>
  
  <body>
  	
  <!-- iframe:
  			1.页面无刷新文件上传
  			2.头像的回显
  			3.父子之说:
  					1.iframe所在的网页为父网页
  					2.iframe包含的网页为子网页
  					3.使用iframe做无刷新的文件上传iframe的name与表单的target属性一致
  			4.iframe一定要在web环境下	 -->
  	<iframe  width="500px" height="500px" name="frame"></iframe>
	<form action="/springmvc/upload/upload1" method="post" target="frame" enctype="multipart/form-data">
		头像路径:<input type="text" name="photo" readonly="readonly" /><br>
		<script type="text/javascript">
			function pathphoto(path){
				document.getElementsByName("photo")[0].value="/springmvc"+path;
			}
		</script>
		文件上传:<input type="file" name="aaa"><br>
		<input type="submit" value="上传">
		
	</form>
   
  </body>
</html>
