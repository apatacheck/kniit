package org.kniit.hw.lab1.task2;

public class Main {
    public static void main(String[] args) {
        Tray tray = new Tray();

        Chef chef = new Chef(tray);
        Waiter waiter = new Waiter(tray);

        chef.start();
        waiter.start();
    }
}