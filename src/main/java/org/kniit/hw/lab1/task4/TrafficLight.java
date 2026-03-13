package org.kniit.hw.lab1.task4;

public class TrafficLight {
    private boolean green = true;

    public synchronized void waiting(String carName){
        try {
            while (!green) {
                System.out.println(carName + " ждет светофора.");
                wait();
            }
            System.out.println(carName + " проезжает на зеленый.");
        } catch (InterruptedException e) {
            System.out.println("Поток прервали");
        }
    }

    public synchronized void changeColor(){
        green = !green;
        System.out.println("Цвет изменился на " + (green ? "зеленый" : "красный"));
        if (green){
            notifyAll();
        }
    }
}
