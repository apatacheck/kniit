package org.kniit.lab6.task11;

import java.util.Scanner;
import java.util.TreeSet;

public class StudentManager {
    public static void main(String[] args) {
        TreeSet<String> students = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить студента");
            System.out.println("2. Удалить студента");
            System.out.println("3. Показать всех студентов");
            System.out.println("4. Найти студента");
            System.out.println("5. Выйти");
            System.out.print("Выберите опцию: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1": //Добавить студента
                    System.out.print("Введите имя студента: ");
                    String newStudent = scanner.nextLine().trim();
                    if (students.contains(newStudent)) {
                        System.out.println("Ошибка: студент с таким именем уже существует.");
                    } else {
                        students.add(newStudent);
                        System.out.println("Студент добавлен.");
                    }
                    break;

                case "2": //Удалить студента
                    System.out.print("Введите имя студента для удаления: ");
                    String removeStudent = scanner.nextLine().trim();
                    if (students.contains(removeStudent)) {
                        students.remove(removeStudent);
                        System.out.println("Студент удален.");
                    } else {
                        System.out.println("Ошибка: студента с таким именем нет в списке.");
                    }
                    break;

                case "3": //Показать всех студентов
                    if (students.isEmpty()) {
                        System.out.println("Список студентов пуст.");
                    } else {
                        System.out.println("Список студентов:");
                        students.forEach(System.out::println);
                    }
                    break;

                case "4": //Найти студента
                    System.out.print("Введите имя студента для поиска: ");
                    String searchStudent = scanner.nextLine().trim();
                    if (students.contains(searchStudent)) {
                        System.out.println("Студент найден.");
                    } else {
                        System.out.println("Студент не найден.");
                    }
                    break;

                case "5": //Выйти
                    exit = true;
                    System.out.println("Программа завершена.");
                    break;

                default:
                    System.out.println("Неверная опция. Попробуйте снова.");
                    break;
            }
        }

        scanner.close();
    }
}

