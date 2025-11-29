package org.kniit.lab4.task7;

import java.util.Random;

class DictionaryStatistic {
    private String[] words;
    private int dictionarySize; // Количество слов
    private int polindrom; // Количество слов полиндромов
    private int maxWordLength; // максимальная длина слова в словаре
    private int minWordLength; // минимальная длина слова в словаре
    private int[] frequency; // частота букв
    private char[] alphabet; // буквы алфавит
    private Random random = new Random();


    public DictionaryStatistic(String[] words, char[] alphabet) {
        this.words = words;
        this.alphabet = alphabet;
        this.frequency = new int[alphabet.length];

        func();
    }

    private void func() {
        dictionarySize = words.length;
        maxWordLength = 0;
        minWordLength = 100;
        polindrom = 0;

        for (String word : words) {
            if (word == null) continue;

            String w = word.toLowerCase();
            int len = w.length();

            // длина слов
            if (len > maxWordLength) maxWordLength = len;
            if (len < minWordLength) minWordLength = len;

            // палиндромы
            if (isPalindrome(w)) {
                polindrom++;
            }

            // частота букв
            for (char c : w.toCharArray()) {
                int index = getAlphabetIndex(c);
                if (index != -1) {
                    frequency[index]++;
                }
            }
        }
    }

    private boolean isPalindrome(String w)
    {
        return w.equals(new StringBuilder(w).reverse().toString());
    }

    private int getAlphabetIndex(char c) {
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == c) return i;
        }
        return -1;
    }

    private String getSymbolsStatString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alphabet.length; i++) {
            sb.append(alphabet[i]).append(" - ").append(frequency[i]).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Кол-во слов: " + dictionarySize + "\n" +
                "Палиндромы: " + polindrom + "\n" +
                "Минимальная длина: " + minWordLength + "\n" +
                "Максимальная длина: " + maxWordLength + "\n" +
                "Частота:\n" + getSymbolsStatString();
    }

    public String getRandomWord() {
        return words[random.nextInt(words.length)];
    }
}