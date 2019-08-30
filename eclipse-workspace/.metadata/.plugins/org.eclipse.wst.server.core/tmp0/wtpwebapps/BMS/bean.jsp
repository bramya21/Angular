<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script src="http://getbootstrap.com/dist/js/bootstrap.min.js"></script>
</head>
<body>
<form action="beanbook.jsp">
<%
 String s=request.getParameter("bookdetails");
 if(s.equals("add")){	 
 %>
 
  		<div class="form-group col-xs-5">
    	<label for="exampleFormControlInput1">Book ID</label>
    	<input type="number" class="form-control" id="BookId" placeholder="154"  name="bookid">
  		</div>
  		<div class="form-group col-xs-5">
    	<label for="exampleFormControlInput1">Title</label>
    	<input type="text" class="form-control" id="Title" placeholder="war and peace" name="title">
  		</div>
		<div class="form-group col-xs-5">
    	<label for="exampleFormControlInput1">Author</label>
    	<input type="text" class="form-control" id="Author" placeholder="amulya"  name="author">
  		</div>
		<div class="form-group col-xs-5">
    	<label for="exampleFormControlInput1">Price</label>
    	<input type="number" class="form-control" id="Price" placeholder="154.54" name="price">
  		</div>
  		<div>
  		<button  type="submit">Add a record</button>
  		</div>
	
 <%
 }
 else if(s.equals("view")){
%>
<div class="form-group col-xs-5">
    	<label for="exampleFormControlInput1">Book ID</label>
    	<input type="number" class="form-control" id="BookId" placeholder=""  name="bookid">
    	<br>
    	<button class="btn btn-primary" type="submit">View</button>
  		</div>
  	
<%
}
 else if(s.equals("viewall")){
	 %>
	 <div>
  		<button  class="btn btn-primary" type="submit">View records</button>
  	</div>
	 <% 
 }
else if(s.equals("delete")){
%>	 
	<div class="form-group col-xs-5">
    	<label for="exampleFormControlInput1">Book ID</label>
    	<input type="number" class="form-control" id="BookId" placeholder=""  name="bookid">
    	<br>
    	<button  class="btn btn-danger" type="submit">Delete</button>
  		</div>
  		
 <%
}
else if(s.equals("update")){
 %>
 		<div class="col-xs-7">
		<label for="exampleFormControlInput1">Enter Book ID</label>
    	<input type="number" class="form-control" id="BookId" placeholder=""  name="bookid">
    	<br>
    	<button class="btn btn-primary" align="center" type="submit">Update</button>
  		</div>
  		<div>
  		
  		</div>
 <%
 s="update1";
}
 
/* else{%>
	<div>
  		<button align="center" type="submit">Add a record</button>
  		</div>
<% } */

 %> 
 <input type="hidden" name="s" value="<%=s %>">
 
</form>
</body>
</html>