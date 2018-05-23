import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class GenericServletExample
 */
@WebServlet("/GenericServletExample")
public class GenericServletExample extends GenericServlet
{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");  
		  
		PrintWriter out=response.getWriter();  
		out.print("<html><body>");  
		out.print("<b>hello generic servlet</b>");  
		out.print("</body></html>");  
		
	}

}