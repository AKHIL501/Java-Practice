

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registration extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		try {
			String fname=request.getParameter("fname");
			String lname=request.getParameter("lname");
			String email=request.getParameter("email");
			String password=request.getParameter("pwd");			
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");  
			PreparedStatement stmt=cn.prepareStatement("insert into registration values(?,?,?,?)");
			stmt.setString(1,fname);
			stmt.setString(2,lname);
			stmt.setString(3,email);
			stmt.setString(4,password);
			stmt.executeUpdate();
			int i=stmt.executeUpdate();  
			out.print(i+" records inserted");  
			cn.close();
		}
			catch (Exception e) {
				out.print(e);
			}
		out.close();
	}
	

}
