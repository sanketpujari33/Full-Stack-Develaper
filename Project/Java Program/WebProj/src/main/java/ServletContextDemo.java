

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletContextDemo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out= response.getWriter();
			ServletContext context= getServletContext();// implemented by GenericServlet class
			String goldrate =context.getInitParameter("goldrate");
			out.println("Gold Rate : "+ goldrate);
	}
}

 /*
  Web.xml
  --------
  <web-app>
       <context-param>
  			<param-name>goldrate</param-name>
  			<param-value>5000000</param-value>
        </context-param>
 </web-app>
*/