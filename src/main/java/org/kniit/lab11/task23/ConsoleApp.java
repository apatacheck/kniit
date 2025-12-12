package org.kniit.lab11.task23;

import java.util.List;
import java.util.Scanner;

public class ConsoleApp {
    private final UserService userService;
    private final Scanner scanner;

    public ConsoleApp() {
        this.userService = new UserService();
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.println("=== User Management System ===");
        System.out.println("Commands: add [name] [email], list, delete [id], update [id] [name] [email], exit");

        while (true) {
            System.out.print("\nCommand: ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) continue;

            String[] parts = input.split("\\s+", 4);
            String command = parts[0].toLowerCase();

            try {
                switch (command) {
                    case "add":
                        handleAdd(parts);
                        break;
                    case "list":
                        handleList();
                        break;
                    case "delete":
                        handleDelete(parts);
                        break;
                    case "update":
                        handleUpdate(parts);
                        break;
                    case "exit":
                        System.out.println("Goodbye!");
                        return;
                    default:
                        System.out.println("Unknown command");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private void handleAdd(String[] parts) throws Exception {
        if (parts.length < 3) {
            throw new Exception("Usage: add [name] [email]");
        }

        String name = parts[1];
        String email = parts[2];

        if (parts.length > 3) {
            for (int i = 2; i < parts.length - 1; i++) {
                name += " " + parts[i];
            }
            email = parts[parts.length - 1];
        }

        userService.registerUser(name, email);
        System.out.println("User added successfully!");
    }

    private void handleList() throws Exception {
        List<User> users = userService.listAllUsers();
        if (users.isEmpty()) {
            System.out.println("No users found");
        } else {
            for (User user : users) {
                System.out.println("ID: " + user.getId() + ", Name: " + user.getName() + ", Email: " + user.getEmail());
            }
        }
    }

    private void handleDelete(String[] parts) throws Exception {
        if (parts.length != 2) {
            throw new Exception("Usage: delete [id]");
        }

        try {
            int id = Integer.parseInt(parts[1]);
            userService.deleteUser(id);
            System.out.println("User deleted successfully!");
        } catch (NumberFormatException e) {
            throw new Exception("ID must be a number");
        }
    }

    private void handleUpdate(String[] parts) throws Exception {
        if (parts.length < 4) {
            throw new Exception("Usage: update [id] [name] [email]");
        }

        try {
            int id = Integer.parseInt(parts[1]);
            String name = parts[2];
            String email = parts[3];

            if (parts.length > 4) {
                for (int i = 3; i < parts.length - 1; i++) {
                    name += " " + parts[i];
                }
                email = parts[parts.length - 1];
            }

            userService.updateUser(id, name, email);
            System.out.println("User updated successfully!");
        } catch (NumberFormatException e) {
            throw new Exception("ID must be a number");
        }
    }

    public static void main(String[] args) {
        ConsoleApp app = new ConsoleApp();
        app.run();
    }
}