package org.kniit.hw.lab1.task2;

public class Tray {
    private int dishes = 0;

    public synchronized void addDish()
    {
        try {
            while (dishes == 3) {
                System.out.println("Поднос полон. Повар ждет.");
                wait();
            }
            dishes++;
            System.out.println("Блюдо на подносе. Количество: " + dishes);
            notify();
        } catch (InterruptedException e) {
            System.out.println("Поток прервали");
        }
    }

    public synchronized void takeDish()
    {
        try {
            while (dishes == 0) {
                System.out.println("Поднос пуст. Официант ждет.");
                wait();
            }
            dishes--;
            System.out.println("Блюдо забрали с подноса. Количество: " + dishes);
            notify();
        } catch (InterruptedException e) {
            System.out.println("Поток прервали");
        }
    }
}
