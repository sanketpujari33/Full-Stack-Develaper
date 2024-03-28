package R_JDBC;

import java.sql.*;
public class JdbcStatementDemo {
    public static void main(String[] args) throws SQLException{
        Connection connection=null;
        Statement statement=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java16","root","1998");
            System.out.println("Connection");
//            connection.close();
            statement = connection.createStatement();

//            statement.execute("create table employee (eno int(3), emname varchar(10), salary float(4))");
//            System.out.println("Table created");

//            statement.executeUpdate("insert into employee values (111,'sanket',8000.0)");
//            statement.executeUpdate("insert into employee values (222,'Ram',9000.0)");
//            statement.executeUpdate("insert into employee values (222,'shankara',7000.0)");
//            System.out.println("inserted");

//            int n =statement.executeUpdate("update employee set salary=6000");
//            System.out.println(n+" records Updated");

//            int d = statement.executeUpdate("delete from employee");
//            System.out.println(d+" records deleted");

//            ResultSet rs = statement.executeQuery("select * from employee");
//            while (rs.next())
//            {
//                System.out.println(rs.getInt("eno")+" "+ rs.getString("emname")+" "+ rs.getFloat(3)); // 3 is Column no(salary)
//            }
        }catch (Exception e) {
            System.out.println(e);
        }
        finally {
            connection.close();
            statement.close();
        }
    }
}
