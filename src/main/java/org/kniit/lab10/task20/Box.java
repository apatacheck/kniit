package org.kniit.lab10.task20;
//Создайте класс Box с ограничением типа T extends Number.
// Реализуйте метод для вычисления суммы всех чисел, хранящихся в контейнере.
import java.util.ArrayList;
import java.util.List;

public class Box<T extends Number> {
    private List<T> numbers;

    public Box() {
        numbers = new ArrayList<>();
    }

    public void add(T number) {
        numbers.add(number);
    }

    public double sum() {
        double total = 0.0;
        for (T number : numbers) {
            total += number.doubleValue();
        }
        return total;
    }
}


class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.add(10);
        integerBox.add(20);
        integerBox.add(30);
        System.out.println("Сумма целых чисел: " + integerBox.sum()); // 60.0


        Box<Double> doubleBox = new Box<>();
        doubleBox.add(1.5);
        doubleBox.add(2.5);
        doubleBox.add(3.0);
        System.out.println("Сумма вещественных чисел: " + doubleBox.sum()); // 7.0


        Box<Float> floatBox = new Box<>();
        floatBox.add(1.1f);
        floatBox.add(2.2f);
        System.out.println("Сумма float чисел: " + floatBox.sum()); // 3.3000000715255737

        Box<Long> longBox = new Box<>();
        longBox.add(100L);
        longBox.add(200L);
        System.out.println("Сумма long чисел: " + longBox.sum()); // 300.0
    }
}