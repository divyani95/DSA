import java.sql.*;
import java.io.*;
public class Column {
    public static void main(String[] args){    
    try{ 
	    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/divyani", "root", "Divyani@123");

            if (conn != null) {
                System.out.println("Established");
            } else {
                System.out.println("Not");
         }
            Statement stmt = conn.createStatement();
            String alterTableSQL = "ALTER TABLE Student8 ADD COLUMN City VARCHAR(30) DEFAULT 'DELHI' ";
            stmt.execute(alterTableSQL);
	    System.out.println("column city added to the Student8 table with a default value DELHI");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
