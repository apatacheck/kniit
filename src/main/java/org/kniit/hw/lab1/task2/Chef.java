package org.kniit.hw.lab1.task2;

class Chef extends Thread {
    private Tray Tray;

    public Chef(Tray Tray) {
        this.Tray = Tray;
    }

    @Override
    public void run() {
        while (true) {
            Tray.addDish();
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                System.out.println("Прервано");
            }
        }
    }
}


