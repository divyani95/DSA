import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateResultSetExample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/divyani"; // Update the database name
        String user = "root";
        String password = "Divyani@123";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {

            String sql = "SELECT * FROM divyani WHERE ID = 1"; // Update the table name and condition
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                // Update the record
                rs.updateString("NAME", "Nakiwansaka"); // Update column names
                rs.updateInt("AGE", 56); // Update column names
                rs.updateString("COURSE", "mca"); // Update column names
                rs.updateRow();
                System.out.println("Record updated successfully.");
            } else {
                System.out.println("Record not found.");
            }

        } catch (SQLException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
