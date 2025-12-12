package org.kniit.lab8.task13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class UserManager {
    private static final String FILE_NAME = "users.ser";

    public static void saveUsers(List<User> users) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(users);
            System.out.println("Список успешно сохранён в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении файла: " + e.getMessage());
        }
    }

    public static List<User> loadUsers() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<User>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при загрузке файла: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
