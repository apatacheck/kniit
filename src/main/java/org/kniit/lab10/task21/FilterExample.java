package org.kniit.lab10.task21;
//Напишите универсальный метод filter, который принимает список элементов и предикат (интерфейс Predicate<T>). Метод должен возвращать новый список,
// содержащий только те элементы, которые удовлетворяют предикату.
import java.util.*;
import java.util.function.Predicate;

public class FilterExample {

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();

        for (T item : list) {
            if (predicate.test(item)) {
                result.add(item);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<String> filtered = filter(words, s -> s.startsWith("b"));
        System.out.println(filtered);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = filter(numbers, n -> n % 2 == 0);
        System.out.println(evenNumbers);


        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 17),
                new Person("Charlie", 30),
                new Person("David", 16)
        );

        List<Person> adults = filter(people, p -> p.getAge() >= 18);
        System.out.println(adults);
    }
}


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}