

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class LoginServlet extends HttpServlet {
	  Connection connection;
	private DriverManager out;
	    public void init(ServletConfig config) {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java16", "root", "1998");
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    PrintWriter out = response.getWriter();
	        String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        try {
	        	PreparedStatement statement = connection.prepareStatement("select * from users where username='" + username + "' and password='" + password + "'");
	            ResultSet rs = statement.executeQuery();
	            if (rs.next()) {
	                String name = rs.getString("name");
	                out.println("Welcome " + name);
	                out.println("<br>Click <a href=\"/WebProj/Login.jsp\">Here</a> to login");
	            } else {
	            	out.println("Login Failure");
	            	out.println("<br>Click <a href=\"/WebProj/Login.jsp\">Here</a> to login"); 
	            }
	        }catch(Exception e) {
	        	out.println(e);
			}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	public void destroy() {
		try {
			connection.close();
		}catch(Exception e) {

		}
	}
}
