<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
 
<html>
   <head>
      <title>JINSERT Operation</title>
   </head>
   
   <body>
      <sql:setDataSource var = "snapshot" driver = "com.sql.jdbc.driver"
         url = "jdbc:mysql://localhost/TEST"
         user = "root"  password = "password"/>
         <sql:update dataSource = "${snapshot}" var = "result">
         INSERT INTO book VALUES (3,"cde");
      </sql:update>
 
      <sql:query dataSource = "${snapshot}" var = "result">
         SELECT * from book;
      </sql:query>
 
     
 
   </body>
</html>