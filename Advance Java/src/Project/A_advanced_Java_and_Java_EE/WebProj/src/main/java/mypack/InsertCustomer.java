package mypack;
import java.sql.*;
public class InsertCustomer {
		public static boolean saveCustomer(Customer customer) 
		{
			int n=0;
			String custname =customer.getCustname();
			String username=customer.getUsername();
			String password=customer.getPassword();
			int age=customer.getAge();
			String email=customer.getEmail();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java16","root","1998");
				PreparedStatement st =con.prepareStatement("INSERT INTO Customer VALUES('"+custname+"','"+username+"','"+password+"','"+age+"','"+email+"')");
				n=st.executeUpdate();
			}catch(Exception e) {
				System.out.println(e);
			}
			if(n==1)
				return true;
			else
				return false;
	}
}

/*
 * ORM Framework(Hibernate)
 * ------------------------
 * public boolean saveCustomer(customer customer)
 * {
 * 			save(customer);
 * }
*/