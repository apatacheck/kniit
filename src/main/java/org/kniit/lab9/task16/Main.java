package org.kniit.lab9.task16;

public class Main {
    public static void main(String[] args) {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                System.out.println(rank + " " + suit);
            }
        }

        System.out.println("\nВсего карт в колоде: " +
                (Suit.values().length * Rank.values().length));
    }
}