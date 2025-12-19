package org.kniit.lab10.task19;
//Напишите универсальный метод findMax, который принимает массив элементов любого типа, реализующего интерфейс Comparable,
// и возвращает максимальный элемент.
public class Main {
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println(findMax(numbers));

        String[] words = {"apple", "banana", "cherry"};
        System.out.println(findMax(words));

        String[] empty = {};
        System.out.println(findMax(empty));

        Person[] people = {
                new Person("John", 25),
                new Person("Alice", 30),
                new Person("Bob", 20)
        };
        System.out.println(findMax(people));
    }
}


class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}