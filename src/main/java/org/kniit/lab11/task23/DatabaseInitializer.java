package org.kniit.lab11.task23;

import java.sql.Connection;
import java.sql.Statement;

public class DatabaseInitializer {

    public static void main(String[] args) {
        initializeDatabase();
    }

    public static void initializeDatabase() {
        String createTableSQL =
                "CREATE TABLE IF NOT EXISTS users (" +
                        "    id SERIAL PRIMARY KEY," +
                        "    name VARCHAR(100) NOT NULL," +
                        "    email VARCHAR(100) NOT NULL UNIQUE" +
                        ")";

        String insertDataSQL =
                "INSERT INTO users (name, email) VALUES " +
                        "('John Doe', 'john.doe@example.com'), " +
                        "('Jane Smith', 'jane.smith@example.com'), " +
                        "('Alice Johnson', 'alice.johnson@example.com'), " +
                        "('Bob Brown', 'bob.brown@example.com'), " +
                        "('Charlie White', 'charlie.white@example.com') " +
                        "ON CONFLICT (email) DO NOTHING";

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement()) {

            // Создать таблицу
            statement.executeUpdate(createTableSQL);
            System.out.println("Table 'users' created or already exists");

            // Вставить тестовые данные
            int rowsInserted = statement.executeUpdate(insertDataSQL);
            System.out.println("Inserted " + rowsInserted + " test users");

        } catch (Exception e) {
            System.err.println("Error initializing database: " + e.getMessage());
            e.printStackTrace();
        }
    }
}