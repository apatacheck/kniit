package org.kniit.hw.lab2.task5;

public class Main {
    public static void main(String[] args) {
        Tv Tele = new Tv();
        Pult pult = new Pult();
        pult.SetCommand(new TvCommand(Tele));
        pult.PressDo();
        pult.PressUndo();
    }
}