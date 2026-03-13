package org.kniit.hw.lab1.task3;

public class Warehouse {
    private int product = 0;

    public synchronized void addProduct()
    {
        try {
            while (product == 5) {
                System.out.println("Cклад полон. Производитель ждет.");
                wait();
            }
            product++;
            System.out.println("Продукт на складе. Количество: " + product);
            notify();
        } catch (InterruptedException e) {
            System.out.println("Поток прервали");
        }
    }

    public synchronized void takeProduct()
    {
        try {
            while (product == 0) {
                System.out.println("Склад пуст. Потребитель ждет.");
                wait();
            }
            product--;
            System.out.println("Продукт забрали со склада. Количество: " + product);
            notify();
        } catch (InterruptedException e) {
            System.out.println("Поток прервали");
        }
    }
}
