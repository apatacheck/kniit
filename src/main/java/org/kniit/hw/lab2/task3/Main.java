package org.kniit.hw.lab2.task3;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Car auto = new Car();
        driver.Travel(auto);
        Boat boat = new Boat();
        Transport boatTransport = new Adapter(boat);
        driver.Travel(boatTransport);
    }
}
