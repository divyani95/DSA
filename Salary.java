import java.sql.*;
import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
public class Salary {
   public static void main(String[] args){
        try{ 
	    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student8", "root", "Divyani@123");
            if (conn != null) {
                System.out.println("Established");
            } else {
                System.out.println("Not");
         }  
            Statement stmt = conn.createStatement();
            String updateSQL = "UPDATE  Student8 SET  Salary= salary + 10000 WHERE (ID > 0 AND ID < 5) ";
	    int rowsAffected = stmt.executeUpdate(updateSQL);
	    if(rowsAffected > 0){
	  System.out.println("salary increased for " + rowsAffected + " records " );   }
        } catch (Exception e) {
            e.printStackTrace();  } } }
