package org.kniit.hw.lab1.task3;


class Consumer extends Thread {
    private Warehouse warehouse;

    public Consumer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        while (true) {
            warehouse.takeProduct();
            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                System.out.println("Прервано");
            }
        }
    }
}