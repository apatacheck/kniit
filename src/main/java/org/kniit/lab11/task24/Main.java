package org.kniit.lab11.task24;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Консольное приложение для управления пользователями. Команды:");
        System.out.println("1. Добавить нового пользователя - add");
        System.out.println("2. Показать всех пользователей - list");
        System.out.println("3. Обновить пользователя - update");
        System.out.println("4. Удалить пользователя - delete");
        System.out.println("5. Выйти - exit");

        while (true) {
            String input = scanner.nextLine().trim();
            String[] parts = input.split("\\s+");

            if (parts.length == 0) continue;
            String command = parts[0];

            try {
                switch (command) {
                    case "add":
                        if (parts.length < 3) {
                            System.out.println("Использование: add [name] [email]");
                        } else {
                            String email = parts[parts.length - 1];
                            StringBuilder nameBuilder = new StringBuilder();
                            for (int i = 1; i < parts.length - 1; i++) {
                                nameBuilder.append(parts[i]);
                                if (i < parts.length - 2) nameBuilder.append(" ");
                            }
                            String name = nameBuilder.toString();
                            userService.registerUser(name, email);
                        }
                        break;

                    case "list":
                        userService.listAllUsers();
                        break;
                    case "delete":
                        if (parts.length < 2) {
                            System.out.println("Использование: delete [id]");
                        } else {
                            int id = Integer.parseInt(parts[1]);
                            userService.deleteUser(id);
                        }
                        break;
                    case "update":
                        if (parts.length < 4) {
                            System.out.println("Использование: update [id] [new_name] [new_email]");
                        } else {
                            int id = Integer.parseInt(parts[1]);
                            String newEmail = parts[parts.length - 1];
                            StringBuilder nameBuilder = new StringBuilder();
                            for (int i = 2; i < parts.length - 1; i++) {
                                nameBuilder.append(parts[i]);
                                if (i < parts.length - 2) nameBuilder.append(" ");
                            }
                            String newName = nameBuilder.toString();
                            userService.updateUser(id, newName, newEmail);
                        }
                        break;
                    case "exit":
                        System.out.println("Выход...");
                        return;
                    default:
                        System.out.println("Неизвестная команда!");
                }
            } catch (SQLException e) {
                System.out.println("Ошибка работы с базой данных: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: ID должен быть числом.");
            }
        }
    }
}

