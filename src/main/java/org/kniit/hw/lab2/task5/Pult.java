package org.kniit.hw.lab2.task5;

public class Pult {
    Command command;

    public Pult() {
    }

    public void SetCommand(Command command) {
        this.command = command;
    }

    public void PressDo() {
        command.Execute();
    }

    public void PressUndo() {
        command.Undo();
    }
}
