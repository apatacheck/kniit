package org.kniit.lab11.task25;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;

public class FileDAO {

    private static final String INSERT_FILE_SQL = "INSERT INTO files (file_name, file_binary) VALUES (?, ?)";

    public void saveFile(File file) throws SQLException, IOException {
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(INSERT_FILE_SQL)) {

            statement.setString(1, file.getName());  // Имя файла

            // Чтение содержимого файла в бинарный формат
            try (FileInputStream fis = new FileInputStream(file)) {
                byte[] fileBytes = new byte[(int) file.length()];
                fis.read(fileBytes);
                statement.setBytes(2, fileBytes);  // Содержимое файла в формате BYTEA
            }

            statement.executeUpdate();  // Выполняем запрос на добавление
        }
    }

    public void printAllFiles() {
        String sql = "SELECT id, file_name, LENGTH(file_binary) AS size_bytes FROM files";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("Содержимое таблицы files:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("file_name");
                long size = rs.getLong("size_bytes");
                System.out.println(id + " | " + name + " | " + size + " байт");
            }

        } catch (SQLException e) {
            System.out.println("Ошибка при чтении таблицы files");
        }
    }
}
