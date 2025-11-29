package org.kniit.lab5.task9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<String> words = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("misc/dictionary.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (scanner.hasNext()){
            words.add(scanner.nextLine());
        }
        scanner.close();

        int totalWords = 0;
        int corrWords = 0;
        Scanner inputScanner = new Scanner(System.in);
        Random random = new Random();

        long start = System.currentTimeMillis();
        long finish = start + 60000;
        System.out.println("Правила: вводите слова, которые появляются на экране!! У вас одна минута, время пошло!!");
        while (System.currentTimeMillis()< finish){
            String randomWord = words.get(random.nextInt(words.size()));
            System.out.print("\nСлово: " + randomWord + " --> ");
            String userWord = inputScanner.nextLine();
            totalWords++;
            if (userWord.equals(randomWord)){
                corrWords++;
            }
        }
        inputScanner.close();
        System.out.println("Минута прошла!!\nВаши результаты:"+"\nВсего слов: " + totalWords + "\nПравильно введенных слов: "+ corrWords);

    }
}
