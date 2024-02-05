import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClientTest {
    public static void main(String[] args) throws SQLException {
        String SQL = "INSERT INTO downloaded_files (original_file_name, file_size, file_extension, file_data) VALUES (?, ?, ?, ?)";
        Path dir = Paths.get("InputFiles");

        String dbUrl = "jdbc:mysql://localhost:3306/divyani";
        String dbUser = "root";
        String dbPassword = "Divyani@123";

        try (Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
             PreparedStatement ps = connection.prepareStatement(SQL);
             Stream<Path> list = Files.list(dir)) {

            List<Path> pathList = list.collect(Collectors.toList());
            System.out.println("Following files are saved in the database...");
            for (Path path : pathList) {
                System.out.println(path.getFileName());
                File file = path.toFile();
                String fileName = file.getName();
                long fileLength = file.length();

                ps.setString(1, fileName);
                ps.setLong(2, fileLength);
                ps.setString(3, fileName.substring(fileName.lastIndexOf(".") + 1));
                ps.setCharacterStream(4, new FileReader(file), fileLength);

                ps.addBatch();
            }
            System.out.println("----------------------------------------");
            int[] executeBatch = ps.executeBatch();
            for (int i : executeBatch) {
                System.out.println(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
