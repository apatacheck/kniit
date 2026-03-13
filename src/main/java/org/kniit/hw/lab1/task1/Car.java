package org.kniit.hw.lab1.task1;

class Car extends Thread{
    private GasStation station;

    public Car(String carName, GasStation station){
        super(carName);
        this.station = station;
    }

    @Override
    public void run(){
        station.takePump(getName());
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
        station.releasePump(getName());
    }

}