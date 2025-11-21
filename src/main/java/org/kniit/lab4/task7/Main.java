package org.kniit.lab4.task7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("misc/dictionary.txt"));
        ArrayList<String> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextLine().trim());
        }
        scanner.close();
        String[] words = list.toArray(new String[0]);
        char[] alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя".toCharArray();
        DictionaryStatistic stat = new DictionaryStatistic(words, alphabet);
        System.out.println(stat);
        System.out.println("\nСлучайное слово: " + stat.getRandomWord());
    }
}

