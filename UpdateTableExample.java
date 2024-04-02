import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTableExample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/divyani";
        String user = "root";
        String password = "Divyani@123";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
             Statement statement = connection.createStatement()) {

            String updateSQL = "UPDATE student SET NAME = 'Ishika', COURSE = 'mca' WHERE ID = 1";
            int rowsAffected = statement.executeUpdate(updateSQL);

            if (rowsAffected > 0) {
                System.out.println("Table updated successfully.");
            } else {
                System.out.println("No rows updated.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


