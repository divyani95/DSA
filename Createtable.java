import java.sql.*;
public class Createtable{
	public static void main(String[] args){
	try{
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/divyani","root"Divyani@123");
	if(conn!=null){
	System.out.println("connection established");	
		}
	else{
	System.out.println("connection not established");
      		}

		Statement stmt=conn.createStatement();
		String sql="CREATE TABLE divyani"+
			   "(ID INT NOT NULL,"+
			    "NAME VARCHAR(40),"+
			    "AGE INT,"+
			    "PRIMARY KEY(ID))";
		stmt.executeUpdate(sql);
		System123

			}
}

