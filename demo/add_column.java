import java.sql.*;
import java.io.*;

public class add_column {

    public static void main(String[] args) {
        
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/divyani", "root", "Divyani@123")) {

            if (conn != null) {
Statement stmt = conn.createStatement();
            String sql = "ALTER TABLE employee ADD City VARCHAR(30) DEFAULT 'Noida' AFTER Company;";
            
                System.out.println("Table Alterted");
            } else {
                System.out.println("Not");
            }
            
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}