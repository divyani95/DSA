import java.sql.*;
import java.io.*;

public class emp_table {

    public static void main(String[] args) {
        
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/divyani", "root", "Divyani@123")) {

            if (conn != null) {
          Statement stmt = conn.createStatement();
            String sql = "create table employee1("+
                         "emp_id int auto_increment primary key, "+
                          "emp_name varchar(255),"+
                          "emp_salary int,"+
                           "company varchar(255))";
            stmt.executeUpdate(sql);
                System.out.println("Table Created...");
            } else {
                System.out.println("Not");
            }
            
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}