package org.kniit.lab8.task13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserApp {
    private static List<User> users = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        users = UserManager.loadUsers();
        System.out.println("Добро пожаловать в систему управления пользователями!");

        boolean exit = false;
        while (!exit) {
            showMenu();
            System.out.print("Введите номер действия: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> addUser();
                case 2 -> showUsers();
                case 3 -> UserManager.saveUsers(users);
                case 4 -> users = UserManager.loadUsers();
                case 5 -> {
                    UserManager.saveUsers(users);
                    System.out.println("Программа завершена.");
                    exit = true;
                }
                default -> System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\nВыберите действие:");
        System.out.println("1. Добавить нового пользователя");
        System.out.println("2. Показать всех пользователей");
        System.out.println("3. Сохранить список пользователей в файл");
        System.out.println("4. Загрузить список пользователей из файла");
        System.out.println("5. Выйти");
    }

    private static void addUser() {
        System.out.print("Введите имя пользователя: ");
        String name = scanner.nextLine();
        System.out.print("Введите возраст: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите email: ");
        String email = scanner.nextLine();

        users.add(new User(name, age, email));
        System.out.println("Пользователь добавлен.");
    }

    private static void showUsers() {
        if (users.isEmpty()) {
            System.out.println("Список пользователей пуст.");
        } else {
            System.out.println("Список пользователей:");
            int i = 1;
            for (User user : users) {
                System.out.println(i++ + ". " + user);
            }
        }
    }
}
