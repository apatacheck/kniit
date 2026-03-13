package org.kniit.hw.lab1.task3;


class Manufacturer extends Thread {
    private Warehouse warehouse;

    public Manufacturer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        while (true) {
            warehouse.addProduct();
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                System.out.println("Прервано");
            }
        }
    }
}