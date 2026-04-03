package org.kniit.hw.lab1.task6;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ThreadLocalRandom;

class Runner extends Thread {
    private CyclicBarrier startBarrier;
    private CyclicBarrier finishBarrier;
    public Runner(String name, CyclicBarrier startBarrier, CyclicBarrier finishBarrier) {
        super(name);
        this.startBarrier = startBarrier;
        this.finishBarrier = finishBarrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " готов к старту");
            startBarrier.await();
            System.out.println(getName() + " СТАРТОВАЛ");
            int time = ThreadLocalRandom.current().nextInt(500, 3000);
            Thread.sleep(time);
            System.out.println(getName() + " финишировал");
            finishBarrier.await();

        } catch (InterruptedException | BrokenBarrierException e) {
            System.out.println("Прервано");
        }
    }
}=