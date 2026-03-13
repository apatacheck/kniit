package org.kniit.hw.lab1.task2;

class Waiter extends Thread {
    private Tray Tray;

    public Waiter(Tray Tray) {
        this.Tray = Tray;
    }

    @Override
    public void run() {
        while (true) {
            Tray.takeDish();
            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                System.out.println("Прервано");
            }
        }
    }
}

