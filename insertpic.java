import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class insertpic {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/divyani"; 
        String user = "root"; // Update the username
        String password = "Divyani@123"; 

        String filepath = "Divyani_Photo.JPEG";

        try {
            Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
            String sql = "INSERT INTO dir2 (first_name, last_name, photo) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "divyani"); 
            stmt.setString(2, "mohan"); 

            
            InputStream inputStream = new FileInputStream(filepath);
            stmt.setBlob(3, inputStream);

            int row = stmt.executeUpdate();
            if (row > 0) {
                System.out.println("Data was inserted into the 'dir' table.");
            }
            conn.close();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }
}