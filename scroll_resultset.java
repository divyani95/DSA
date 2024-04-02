import java.sql.*;
import java.io.*;

public class scroll_resultset {

    public static void main(String[] args) {
        
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/divyani", "root", "Divyani@123")) {

            if (conn != null) {
                System.out.println("Established");
            } else {
                System.out.println("Not");
            }
            
            Statement stmt = conn.createStatement();
            String sql = "UPDATE divyani SET name='Rahul' WHERE id=2";
            stmt.executeUpdate(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



