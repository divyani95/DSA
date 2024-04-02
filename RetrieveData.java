
import java.sql.*;

public class RetrieveData {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/divyani";
        String user = "root";
        String password = "Divyani@123";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
             Statement stmt = conn.createStatement()) {

            String sql = "SELECT * FROM divyani";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt(1) + ", Name: " + rs.getString(2) + ", Age: " + rs.getInt(3) + ", Course: " + rs.getString(4));
            }
        } catch (SQLException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}



