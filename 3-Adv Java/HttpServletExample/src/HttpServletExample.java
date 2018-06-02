import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class HttpServletExample extends HttpServlet {
	
	public void  doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out =res.getWriter();
		out.println("<html><head><title>HttpServletExample</title></head><body>");
		out.println("<b>HttpServletExample Running</b></body>");
		out.close();
		
	}

}
