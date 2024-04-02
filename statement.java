//37/ WAP to create a statement
import java.sql.*;
import java.io.*;
public class statement {
 public static void main(String[] args) {
 try (Connection conn = 
DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/divyani", "root", 
"Divyani@123")) {
 if (conn != null) {
 System.out.println("Established");
 } else {
 System.out.println("Not");
 }
 Statement stmt = conn.createStatement();
 String sql = "CREATE TABLE divyani ("+
 "id INT AUTO_INCREMENT PRIMARY KEY,"+
 "name VARCHAR(20),"+
 "course VARCHAR(20));";
 stmt.executeUpdate(sql);
 } catch (Exception e) {
 e.printStackTrace();
 }
 }
}

