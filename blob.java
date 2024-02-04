import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class blob {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/divyani", "root", "Divyani@123")){
            if (conn!=null) {
                try {
                    String file_path = "C:\Users\DELL\OneDrive\Desktop\\java.png";
                    String sql = "INSERT INTO person(name,image) VALUES(?,?);";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.setString(1, "flower");
                    InputStream is = new FileInputStream(new File(file_path));
                    ps.setBlob(2, is);
                    ps.execute();
                    System.out.println("done");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}