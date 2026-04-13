package org.kniit.hw.lab2.task5;

public class TvCommand implements Command { //реализация команд
    Tv tv;

    public TvCommand(Tv receiver) {
        tv = receiver;
    }

    public void Execute() {
        tv.On();
    }

    public void Undo() {
        tv.Off();
    }
}
