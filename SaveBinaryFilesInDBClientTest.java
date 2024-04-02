import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SaveBinaryFilesInDBClientTest {
    public static void main(String[] args) {
        saveBinaryFilesInDatabase();
    }

    private static void saveBinaryFilesInDatabase() {
        String SQL = "INSERT INTO storebinaryfile_table (file_name, file_size_in_kb, file_extension, file_content) VALUES (?, ?, ?, ?)";
        String directoryPath = "InputFiles"; // Update with the path to your files

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(SQL)) {
            List<Path> pathList;
            try (Stream<Path> list = Files.list(Paths.get(directoryPath))) {
                pathList = list.collect(Collectors.toList());
            }

            System.out.println("Inserting files into the database...");
            for (Path path : pathList) {
                File file = path.toFile();
                String fileName = file.getName();
                long fileLength = file.length();
                long fileLengthInKb = fileLength / 1024;

                ps.setString(1, fileName);
                ps.setLong(2, fileLengthInKb);
                ps.setString(3, fileName.substring(fileName.lastIndexOf(".") + 1));

                FileInputStream fis = new FileInputStream(file);
                ps.setBinaryStream(4, fis, fileLength);

                ps.executeUpdate();
            }
            System.out.println("Insertion complete.");
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}










 
