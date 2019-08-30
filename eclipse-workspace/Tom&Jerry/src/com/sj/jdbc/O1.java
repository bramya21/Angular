package com.sj.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
@WebServlet("O1")
public class O1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mariadb://localhost:3306/bijja","root","password");
			System.out.println("Connection Established");
			Statement st = con.createStatement();
			System.out.println("Displaying database...");
			ResultSet rs=st.executeQuery("select * from book;");
			ResultSetMetaData rsmd=rs.getMetaData();    
			int columnsNumber=rsmd.getColumnCount(); 
			while(rs.next())
			{
				 for (int i = 1; i <= columnsNumber; i++) {
				        System.out.print(rs.getString(i)+" ");
				     
				    }
				    System.out.println();
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 

	}
}
