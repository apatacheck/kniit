package org.kniit.hw.lab1.task5;


class Assembler extends Thread {

    private Conveyor conveyor;

    public Assembler(Conveyor conveyor) {

        this.conveyor = conveyor;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String rawPart = conveyor.rawDetails.take();
                System.out.println("Сборщик: " + rawPart + " обработана");
                conveyor.readyDetails.put(rawPart.replace("Заготовка", "Деталь"));
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
    }
}

