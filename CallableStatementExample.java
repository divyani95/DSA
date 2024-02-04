
import java.sql.*; 
public class CallableStatementExample { 
 public static void main(String[] args) {
 String jdbcUrl = "jdbc:mysql://localhost:3306/divyani"; 
 String user = "root"; 
 String password = "Divyani@123"; 
 try (Connection conn = DriverManager.getConnection(jdbcUrl, user, password)) {
 System.out.println(conn != null ? "Connection established" : "Connection not established"); 
 
 CallableStatement callableStmt = conn.prepareCall("{CALL AddNumbers(?, ?)}"); 
 callableStmt.setInt(1, 10); 
 callableStmt.setInt(2, 20); 
 boolean hasResults = callableStmt.execute(); 
 if (hasResults) { 
 ResultSet rs = callableStmt.getResultSet(); 
 while (rs.next()) { 
 int result = rs.getInt(1); 
 System.out.println("Result of addition: " + result); 
 } 
 } 
 } catch (SQLException e) {
 System.out.println("An error occurred."); 
 e.printStackTrace(); 
 } 
 } 
}