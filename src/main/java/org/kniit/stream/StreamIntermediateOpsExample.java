package org.kniit.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOpsExample {

    public static void main(String[] args) {
        // List.of() работает в Java 11
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 4);

        // Пример 1: filter, distinct, map, sorted, peek
        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .distinct()
                .map(n -> n * n)
                .sorted()
                .peek(System.out::println)
                .collect(Collectors.toList());  // ← toList() → collect(Collectors.toList())

        System.out.println("Результат: " + result);

        // Пример 2: takeWhile (Java 9+, работает)
        List<Integer> taken = numbers.stream()
                .takeWhile(x -> x < 4)
                .collect(Collectors.toList());  // ← исправлено

        System.out.println("takeWhile (x < 4): " + taken);

        // Пример 3: dropWhile (Java 9+, работает)
        List<Integer> dropped = numbers.stream()
                .dropWhile(x -> x < 4)
                .collect(Collectors.toList());  // ← исправлено

        System.out.println("dropWhile (x < 4): " + dropped);
    }
}