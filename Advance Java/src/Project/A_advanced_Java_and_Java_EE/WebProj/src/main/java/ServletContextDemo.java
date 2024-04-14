

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletContextDemo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ServletContext context = getServletContext(); //implemented by genericServlet class
		String goldrate =context.getInitParameter("goldrate");
		out.println("Gold Rate : "+ goldrate);
	}

}
/*
 * web.xml
 * -------
 * <Web-app>
  <context-param> <param-name>goldrate</param-name>
  <param-value>50000</param-value> </context-param>
  </Web-app>
 */
