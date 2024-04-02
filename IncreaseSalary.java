import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class IncreaseSalary {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/divyani";
        String user = "root";
        String password = "Divyani@123";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
             Statement statement = connection.createStatement()) {

    
            String updateSQL = "UPDATE Student8 SET salary = salary + 10000 WHERE ID IN (1, 2, 3, 4)";
            int rowsAffected = statement.executeUpdate(updateSQL);

            if (rowsAffected > 0) {
                System.out.println("Salary increased for " + rowsAffected + " records.");
            } else {
                System.out.println("No records updated.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



