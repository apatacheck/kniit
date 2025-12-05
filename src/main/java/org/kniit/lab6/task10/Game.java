package org.kniit.lab6.task10;

import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private static final String[] WORDS = {
            "мама", "море", "кошка", "окно", "рыба",
            "яблоко", "гора", "лес", "книга", "школа",
            "стол", "река", "крот", "ветер", "звезда"
    };

    private int wordLength;
    private String guessedWord;
    private ArrayList<Character> arrayWords;
    private HashSet<Character> setWords;
    private HashSet<Character> setPlayer;
    private int attempt = 6;

    public Game() {
        Random rnd = new Random();
        this.guessedWord = WORDS[rnd.nextInt(WORDS.length)];

        this.wordLength = guessedWord.length();
        this.arrayWords = StringToEmptyList(guessedWord); //создаем пустое слово
        this.setWords = StringToHashSet(guessedWord); //создаем список букв
        this.setPlayer = new HashSet<Character>(); //создаем пустой список букв игрока
    }

    public void startGame() {

        System.out.println(guessedWord);
        Scanner input = new Scanner(System.in);

        while (true) {
            if (attempt == 0) {
                System.out.println("Вы проиграли! Ваше слово: "+ guessedWord);
                break;
            }
            if (setPlayer.equals(setWords)) {
                System.out.println("Вы победили! Ваше слово: "+ guessedWord);
                break;
            }

            print(arrayWords);
            System.out.println("\nВведите букву: ");
            Character userChar = input.nextLine().trim().charAt(0);

            if (setWords.contains(userChar)) {
                setPlayer.add(userChar);
                ArrayFilling(arrayWords, guessedWord, setPlayer);
            } else {
                attempt--;
                System.out.println("Неверно! Осталось попыток: " + attempt);
            }
        }
        input.close();
    }

    public HashSet<Character> StringToHashSet(String str) { //строка в буквы в сет
        HashSet<Character> set = new HashSet<Character>();
        for (Character c : str.toCharArray()) {
            set.add(c);
        }
        return set;
    }

    public void ArrayFilling(ArrayList<Character> list, String word, HashSet<Character> set) { //замена на буквы

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (set.contains(c)) {
                list.set(i, Character.valueOf(c));
            }
        }
    }

    public void print(List<Character> array) { //вывод
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
    }

    public ArrayList<Character> StringToEmptyList(String str) { //заполнение черточками
        ArrayList<Character> list = new ArrayList<Character>();
        for (int i = 0; i < str.length(); i++) {
            list.add('_');
        }
        return list;
    }
}
