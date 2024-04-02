import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RowSetExample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/divyani";
        String user = "root";
        String password = "Divyani@123";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, user, password)) {
            CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();
            rowSet.setUrl(jdbcUrl);
            rowSet.setUsername(user);
            rowSet.setPassword(password);

            rowSet.setCommand("SELECT * FROM Student8");
            rowSet.execute(connection);

            while (rowSet.next()) {
                int id = rowSet.getInt("ID");
                String name = rowSet.getString("NAME");
                String course = rowSet.getString("COURSE");
                System.out.println("ID: " + id + ", Name: " + name + ", Course: " + course);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
