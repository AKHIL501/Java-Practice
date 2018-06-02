

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		try
		{
			String email= request.getParameter("email");
			String password= request.getParameter("pwd");
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");  
			PreparedStatement stmt=cn.prepareStatement("select email,password from registration where email=? and password=? ");
			stmt.setString(1,email);
			stmt.setString(2,password);
			ResultSet rs=stmt.executeQuery();   
			while(rs.next())
			{
				/*String mail=rs.getString("email");
				String pwd=rs.getString("password");
				if(mail.equals(email)&&pwd.equals(password))
				{
					response.sendRedirect("Welcomepage.html");
				return;
				}
				else
				{
					System.out.println("error");
					return;
				}*/
					//out.print("Invalid");
				response.sendRedirect("Welcomepage.html");
				return;
				
			}
			cn.close();
			response.sendRedirect("Registration.html");
			return;
		}
		catch (Exception e) {
			// TODO: handle exception
			out.print(e);
		}
		
		out.close();
		
	}

}



