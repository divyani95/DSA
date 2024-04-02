import java.sql.*;
import java.io.*;
public class Storedproc{
public static void main(String args[]){
String url="jdbc:mysql://localhost:3306/divyani";
String username="root";
String password="Divyani@123";
try(Connection conn=DriverManager.getConnection(url,username,password)){
Statement stmt=conn.createStatement();
String queryDrop="DROP PROCEDURE IF EXISTS delete_book";
String queryCreate="CreateProcedure delete_book(IN bookID INT)";
queryCreate="BEGIN";
queryCreate="DELETE FROM book WHERE book_id=bookID";
queryCreate+="END";
stmt.execute(queryDrop);
stmt.close();
System.out.println("stored procedure created successfully");
}
catch(SQLException ex){
ex.printStackTrace();
}
}
}
	
