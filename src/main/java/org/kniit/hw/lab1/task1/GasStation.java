package org.kniit.hw.lab1.task1;

class GasStation {
//На автозаправочной станции только 2 колонки. Если все заняты, машины ждут в очереди.
//Когда колонка освобождается, следующий автомобиль из очереди начинает заправку.
    private int freePumps = 2;

    public synchronized void takePump(String carName) {
        try {
            while (freePumps == 0) {
                System.out.println(carName + " ждет очереди");
                wait();
            }
            --freePumps;
            System.out.println(carName + " заправляется. Свободных колонок: " + freePumps);
        } catch (InterruptedException e) {
            System.out.println("Поток прервали");
        }
    }

    public synchronized void releasePump(String carName) {
        freePumps++;
        System.out.println(carName + " заправился. Свободных колонок: " + freePumps);
        notify();
    }
}