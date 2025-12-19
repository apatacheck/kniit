package org.kniit.lab10.task22;
//Создайте класс Dictionary<K, V>, который будет работать как словарь (ключ-значение).
// Реализуйте методы для добавления, удаления и получения элементов.
public class Main {
    public static void main(String[] args) {
        Dictionary<String, Integer> dictionary = new Dictionary<>();

        dictionary.put("Alice", 25);
        dictionary.put("Bob", 30);
        System.out.println(dictionary);

        System.out.println(dictionary.get("Alice"));

        dictionary.put("Alice", 26);
        System.out.println(dictionary.get("Alice"));

        dictionary.remove("Bob");
        System.out.println(dictionary);

        System.out.println(dictionary.get("Bob"));

        dictionary.put("Charlie", 35);
        dictionary.put("David", 40);
        System.out.println(dictionary);
    }
}