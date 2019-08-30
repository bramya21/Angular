<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Employee Portal Page</h1>
<hr>
<form action="displayAll" method="post">
<h2>
Click below to view employee records
<hr>
<input type="submit" name="submit" value="Display">
</h2>
</form>
<hr>
<form action="displayEmp" method="post">
<h2>
enter Employee Id <input type="text" name="empid">
<input type="submit" name="submit" value="displayByID"/>
</h2>
</form>
<hr>
<form action="displayByDesig" method="post">
<h2>
enter Designation <input type="text" name="designation">
<input type="submit" name="submit" value="displayByID"/>
</h2>
</form>
<hr>
<form action="displayByAge" method="post">
<h2>

Click her to view employee records sorted by age
enter Designation <input type="text" name="designation"><hr>
<input type="submit" name="submit" value="displayByAge"/>
</h2>
</form>
<hr>
<form action="insertEmp" method="post">
<h2>
enter Employee Id <input type="text" name="empid">
enter Name <input type="text" name="name">
enter Age <input type="text" name="age">
enter Designation<input type="text" name="designation">
<input type="submit" name="submit" value="insert"/>
<input type="reset" name="reset" value="reset"/>
</h2>
</form>
<hr>
<form action="updateEmp" method="post">
<h2>
enter Employee Id <input type="text" name="empid">
enter Name <input type="text" name="name">
enter Age <input type="text" name="age">
enter Designation<input type="text" name="designation">
<input type="submit" name="submit" value="update"/>
<input type="reset" name="reset" value="reset"/>
</h2>
</form>
<hr>
<form action="deleteEmp" method="post">
<h2>
enter Employee Id <input type="text" name="empid">
<input type="submit" name="submit" value="delete"/>
</h2>
</form>
</body>
</html>