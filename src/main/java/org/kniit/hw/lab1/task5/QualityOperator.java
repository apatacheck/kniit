package org.kniit.hw.lab1.task5;


class QualityOperator extends Thread {

    private Conveyor conveyor;

    public QualityOperator(Conveyor conveyor) {

        this.conveyor = conveyor;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String readyDetail = conveyor.readyDetails.take();
                System.out.println("Оператор контроля: " + readyDetail + " проверена и отправлена на склад");
                Thread.sleep(1200);
            }
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
    }
}

