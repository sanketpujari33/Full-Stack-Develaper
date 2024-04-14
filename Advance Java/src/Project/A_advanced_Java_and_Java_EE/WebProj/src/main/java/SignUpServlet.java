import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class SignUpServlet extends HttpServlet {
	Connection connection = null;
	public void init (ServletConfig config) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/java16","root","1998");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				PrintWriter out = response.getWriter();
				String name= request.getParameter("name");
				String username=request.getParameter("username");
				String password =request.getParameter("password");
				try {
					PreparedStatement statement = connection.prepareStatement("insert into users values('"+name+"', '"+username+"', '"+password+"')");
						statement.executeUpdate();
						out.println("<div>Rigistered successfully<br>");
						out.println("Clicke <a href=\"/WebProj/Login.jsp\">here</a> to login</div>");
				}catch (Exception e) {
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
