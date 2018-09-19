<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
  </head>
  
  <body>
  	<h1>基本参数类型传递</h1>
    <form action="/springmvc/param/test" method="post">
    	<table>
    		<tr><td>&nbsp;&nbsp;id:<input type="text" value="1"  name="cid" /> </td></tr>
			<tr><td>&nbsp;&nbsp;name:<input type="text" value="name" name="name" /> </td></tr>
    		<tr><td>&nbsp;&nbsp;<input type="submit" value="提交" /> </td></tr>
    	</table>
    </form><hr/>
    
      	<h1>对象参数类型传递</h1>		<!-- stringmvc 对象不用再user.name直接 name ,属性名相同在controller处理-->
    <form action="/springmvc/param/test11" method="post">
    	<table>
    		<tr>
    			<td>&nbsp;&nbsp;user.id:<input type="text" value="1"  name="user.id" /> </td>
    		</tr>
    		<tr>
    			<td>&nbsp;&nbsp;user.name:<input type="text" value="name" name="user.name" /> </td>
    		</tr>
    		<tr>
    			<td>&nbsp;&nbsp;order.id:<input type="text" value="1"  name="order.id" /> </td>
    		</tr>
    		<tr>
    			<td>&nbsp;&nbsp;order.name:<input type="text" value="name" name="order.name" /> </td>
    		</tr>
    		<tr>
    			<td>&nbsp;&nbsp;<input type="submit" value="提交" /> </td>
    		</tr>
    	</table>
    </form><hr/>
   
    <h1>日期参数类型传递</h1>
    <form action="/springmvc/param/test2" method="post">
    	<table>
    		<tr><td>&nbsp;&nbsp;birthday:<input type="text"  name="birthday" /> </td></tr>
    		<tr><td>&nbsp;&nbsp;<input type="submit" value="提交" /> </td></tr>
    	</table>
    </form><hr/>
   
       <h1>数组参数类型传递</h1>
    <form action="/springmvc/param/test3" method="post">
    	<table>
    		<tr><td>&nbsp;&nbsp;string[0]:<input type="text"  name="str" /> </td></tr>
    		<tr><td>&nbsp;&nbsp;string[1]:<input type="text"  name="str" /> </td></tr>
    		<tr><td>&nbsp;&nbsp;string[2]:<input type="text"  name="str" /> </td></tr>
    		<tr><td>&nbsp;&nbsp;<input type="submit" value="提交" /> </td></tr>
    	</table>
    </form><hr/>
   
          <h1>List集合接收对象类型参数类型传递</h1>
    <form action="/springmvc/param/test4" method="post">
    	<table>
    		<tr><td>&nbsp;&nbsp;list[0]:<input type="text"  name="list" /> </td></tr>
    		<tr><td>&nbsp;&nbsp;list[1]:<input type="text"  name="list" /> </td></tr>
    		<tr><td>&nbsp;&nbsp;list[2]:<input type="text"  name="list" /> </td></tr>
    		<tr><td>&nbsp;&nbsp;<input type="submit" value="提交" /> </td></tr>
    	</table>
    </form><hr/>
   
             <h1>集合类型泛型为基本类型参数类型传递</h1>
    <form action="/springmvc/param/test5" method="post">
    	<table>
    		<tr><td>&nbsp;&nbsp;user[0].id:<input type="text" value="1"  name="users[0].id" /> </td></tr>
			<tr><td>&nbsp;&nbsp;user[0].name:<input type="text" value="name" name="users[0].name" /> </td></tr>
			<tr><td>&nbsp;&nbsp;user[1].id:<input type="text" value="1"  name="users[1].id" /> </td></tr>
			<tr><td>&nbsp;&nbsp;user[1].name:<input type="text" value="name" name="users[1].name" /> </td></tr>
    		<tr><td>&nbsp;&nbsp;<input type="submit" value="提交" /> </td></tr>
    	</table>
    </form><hr/>
   
                <h1>Map[String,Integer]参数类型传递</h1>
    <form action="/springmvc/param/test6" method="post">
    	<table>
    		<tr><td>&nbsp;&nbsp;maps:<input type="text" value="1"  name="maps['123']" /> </td></tr>
			<tr><td>&nbsp;&nbsp;maps:<input type="text" value="name" name="maps['456']" /> </td></tr>
			<tr><td>&nbsp;&nbsp;maps:<input type="text" value="1"  name="maps['789']" /> </td></tr>
    		<tr><td>&nbsp;&nbsp;<input type="submit" value="提交" /> </td></tr>
    	</table>
    </form><hr/>
   
                   <h1>Map[Integer,User]参数类型传递</h1>
    <form action="/springmvc/param/test7" method="post">
    	<table>
    		<tr><td>&nbsp;&nbsp;mapss:<input type="text" value="1"  name="mapss[123].id" /> - <input type="text" value="1"  name="mapss[123].name" /></td></tr>
			<tr><td>&nbsp;&nbsp;mapss:<input type="text" value="name" name="mapss[456].id" /> - <input type="text" value="1"  name="mapss[456].name" /></td></tr>
			<tr><td>&nbsp;&nbsp;mapss:<input type="text" value="1"  name="mapss[789].id" /> - <input type="text" value="1"  name="mapss[789].name" /></td></tr>
    		<tr><td>&nbsp;&nbsp;<input type="submit" value="提交" /> </td></tr>
    	</table>
    </form><hr/>
   
   
  </body>
</html>





