
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Op")
public class Op extends HttpServlet {
private static final long serialVersionUID = 1L;

/**
* Default constructor.
*/
public Op()
{
	
}

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
*      response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
// TODO Auto-generated method stub
response.setContentType("text/html");
PrintWriter out = response.getWriter();
int id = Integer.parseInt(request.getParameter("id"));
String name = request.getParameter("name");


try {
Class.forName("org.mariadb.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/bijja", "root", "password");
System.out.println("Connected database successfully...");

PreparedStatement st = conn.prepareStatement("insert into book values(?,?)");
st.setInt(1, id);
st.setString(2, name);

st.executeUpdate();
out.print("added successfully");
}

catch (SQLException | ClassNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
*      response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);
}

}