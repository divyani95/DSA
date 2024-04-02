import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static final String DB_DRIVER_CLASS = "com.mysql.jdbc.Driver"; // Update with your MySQL driver class
    private static final String DB_USERNAME = "root"; // Update with your database username
    private static final String DB_PASSWORD = "Divyani@123"; // Update with your database password
    private static final String DB_URL = "jdbc:mysql://localhost:3306/divyani"; // Update with your database URL

    private static Connection connection = null;

    static {
        try {
            Class.forName(DB_DRIVER_CLASS);
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}








