package org.kniit.lab11.task24;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Консольное приложение для управления пользователями. Команды: add, delete, update");

        while (true) {
            System.out.print("> ");
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
                            String name = parts[1];
                            String email = parts[2];
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
                            String newName = parts[2];
                            String newEmail = parts[3];
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

