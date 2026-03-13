package org.kniit.hw.lab1.task5;

import org.kniit.hw.lab1.task4.TrafficLight;

class StampingWorker extends Thread {

    private Conveyor conveyor;
    private int partNum = 1;

    public StampingWorker(Conveyor conveyor) {
        this.conveyor = conveyor;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String part = "Заготовка " + partNum;
                partNum++;
                conveyor.rawDetails.put(part);
                System.out.println("Штамповщик: " + part + " создана");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
    }

}
