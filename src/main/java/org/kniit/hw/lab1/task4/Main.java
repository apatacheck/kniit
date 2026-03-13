package org.kniit.hw.lab1.task4;


public class Main {
    public static void main(String[] args){
        TrafficLight trafficLight = new TrafficLight();
        TrafficLightThread trafficLightThread = new TrafficLightThread(trafficLight);
        trafficLightThread.start();
        for (int i = 1; i <= 6; i++) {
            new Car("Car" + i, trafficLight).start();
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                System.out.println("Прервано");
            }
        }
    }
}

