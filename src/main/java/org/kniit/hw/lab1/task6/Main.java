package org.kniit.hw.lab1.task6;

import java.util.concurrent.CyclicBarrier;

public class Main {

    public static void main(String[] args) {
        int runners = 5;
        CyclicBarrier startBarrier = new CyclicBarrier(runners, () -> System.out.println("\nВСЕ ГОТОВЫ! СТАРТ!\n"));
        CyclicBarrier finishBarrier = new CyclicBarrier(runners, () -> System.out.println("\nВСЕ ФИНИШИРОВАЛИ! ГОНКА ЗАКОНЧЕНА!\n"));
        for (int i = 1; i <= runners; i++) {
            new Runner("Бегун " + i, startBarrier, finishBarrier).start();
        }
    }
}