import java.sql.*;
public class JDBCExample{
	public static void main(String[] args){
	// creates connection objects
	Connection conn1=null;
	try{
		//connect way
		String url="jdbc:mysql://localhost:3306/divyani";
                String user="root";
		String password="Divyani@123";
		conn1=DriverManager.getConnection(url,user,password);
	if(conn1!=null){
	System.out.println("connected to the database divyani");	
		}
	

			}

		catch(SQLException ex){
		System.out.println("an error occured");
	

}




}


}

