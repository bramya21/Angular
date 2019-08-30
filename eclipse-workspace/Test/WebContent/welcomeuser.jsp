<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <jsp:useBean id="userinfo" class="Test.Bean"/>  
 <jsp:setProperty property="*" name="userinfo"/> 
You have enterted below details:<br> 
<jsp:getProperty property="name" name="userinfo"/><br> 
<jsp:getProperty property="pl" name="userinfo" /><br>
<%out.println(userinfo.getComments()); %>
</body>
</html>
