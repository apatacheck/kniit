package org.kniit.hw.lab1.task5;

public class Main {
    public static void main(String[] args) {
        Conveyor conveyor = new Conveyor();

        StampingWorker stamper = new StampingWorker(conveyor);
        Assembler assembler = new Assembler(conveyor);
        QualityOperator operator = new QualityOperator(conveyor);

        stamper.start();
        assembler.start();
        operator.start();
    }
}