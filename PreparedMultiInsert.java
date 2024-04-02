import java.sql.*; 
public class PreparedMultiInsert {
 public static void main(String[] args) {
 String jdbcUrl = "jdbc:mysql://localhost:3306/divyani"; 
 String user = "root"; 
 String password = "Divyani@123"; 
 try (Connection conn = DriverManager.getConnection(jdbcUrl, user, password)) {
 System.out.println(conn != null ? "Connection established" : "Connection not established"); 
 String sql = "INSERT INTO student (id, name, course, age) VALUES (?, ?, ?, ?)"; 
 PreparedStatement pstmt = conn.prepareStatement(sql); 
 int[] ids = {7, 8, 9}; 
 String[] names = {"mike", "mike", "kite"}; 
 String[] courses = {"CS", "CS", "CS"}; 
 int[] ages = {24, 25, 23}; 
 for (int i = 0; i < ids.length; i++) { 
 pstmt.setInt(1, ids[i]); 
 pstmt.setString(2, names[i]); 
 pstmt.setString(3, courses[i]); 
 pstmt.setInt(4, ages[i]); 
 pstmt.addBatch(); 
 } 
 int[] result = pstmt.executeBatch(); 
 System.out.println("Number of rows inserted: " + result.length); 
 } catch (SQLException e) {
 System.out.println("An error occurred."); 
 e.printStackTrace(); 
 } 
 } 
}