package org.kniit.hw.lab1.task4;

class Car extends Thread {
    private TrafficLight trafficLight;

    public Car(String carName, TrafficLight trafficLight) {
        super(carName);
        this.trafficLight = trafficLight;
    }

    @Override
    public void run() {
        trafficLight.waiting(getName());
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }

    }

}
