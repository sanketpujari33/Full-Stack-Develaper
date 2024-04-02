package R_JDBC;

import java.util.*;
import java.sql.*;
public class JdbcPreparedStatementDemeo {
    public static void main(String[] args) throws SQLException{
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Employee Number");
        int eno=s.nextInt();
        System.out.println("Enter Employee Name");
        String emname=s.next();
        System.out.println("Enter Employee Salary");
        float salary=s.nextFloat();
        Connection connection=null;
        PreparedStatement statement =null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java16","root","1998");
            System.out.println("Connection");
            /*
            statement = connection.prepareStatement("insert into employee values(?,?,?)");
            statement.setInt(1, eno);
            statement.setString(2, emname);
            statement.setFloat(3, salary);
            statement.executeUpdate();
            System.out.println("Inserted");
             */
            statement = connection.prepareStatement("insert into employee values("+eno+",'"+emname+"',"+salary+")");
            statement.executeUpdate();
            System.out.println("Inserted");
        }
        catch (Exception e){

            System.out.println(e);

        }finally {
            statement.close();
            connection.close();
        }

    }
}
