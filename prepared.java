import java.sql.*; 
public class Prepared { 
 public static void main(String[] args) {
 String jdbcUrl = "jdbc:mysql://localhost:3306/divyani"; 
 String user = "root"; 
 String password = "Divyani@123"; 
 try (Connection conn = DriverManager.getConnection(jdbcUrl, user, password)) {
 System.out.println(conn != null ? "Established" : "Not"); 
 String sql = "INSERT INTO divyani (id, name, course, age) VALUES " + 
 "(4, 'Rohan', 'mca', 26)," + 
 "(5, 'Mohan', 'mca', 27)"; 
 PreparedStatement pstmt = conn.prepareStatement(sql); 
 pstmt.executeUpdate(); 
 System.out.println("Data inserted successfully."); 
 } catch (SQLException e) {
 System.out.println("An error occurred."); 
 e.printStackTrace(); 
 } 
 } 
}