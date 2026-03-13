package org.kniit.hw.lab1.task1;

public class Main {
    public static void main(String[] args) {
        GasStation station = new GasStation();
        for (int i = 1; i <= 4; i++) {
            new Car("Car" + i, station).start();
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Прервано");
            }
        }
    }
}