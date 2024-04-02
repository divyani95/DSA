import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.*;
public class DownloadFiles {
 public static void main(String[] args) throws SQLException {
 downloadBinaryFilesFromDB();
 }
 private static void downloadBinaryFilesFromDB() throws SQLException {
 String sql = "SELECT * from storebinaryfile_mytable";
 String outputDirectory = "C:\Users\DELL\OneDrive\Desktop\DIVYANI_124"; // Specify your output directory
 try (Connection conn = dbutil.getConnection();
 PreparedStatement statement = conn.prepareStatement(sql);
 ResultSet result = statement.executeQuery()) {
 System.out.println("Following files are retrieved from the database");
 while (result.next()) {
 int fileId = result.getInt("id");
 String fileName = result.getString("file_name");
 String fileExtension = result.getString("file_extension");
 long fileSize = result.getLong("file_size_in_kb");
 System.out.println("File Id: " + fileId);
 System.out.println("File Name: " + fileName);
 System.out.println("File Size in kb: " + fileSize);
 System.out.println("File Extension: " + fileExtension);
 Blob blob = result.getBlob("file_content");
 try (InputStream inputStream = blob.getBinaryStream()) {
 Path outputPath = Paths.get(outputDirectory, fileName);
 Files.copy(inputStream, outputPath, StandardCopyOption.REPLACE_EXISTING);
 System.out.println("File saved to: " + outputPath);
 } catch (IOException e) {
 throw new RuntimeException("Error saving file: " + e.getMessage(), e);
 }
 System.out.println("-----------------------------------------------------------------");
 }
 } catch (SQLException e) {
 System.out.println("SQL Error: " + e.getMessage());
 }
 }
}

