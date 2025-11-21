package org.kniit.lab3.task6;

class Priest extends Player {

    private int healPower = 20;

    public Priest(String name) {
        super(name, 80, 5, 10);
    }
//лечение
    public void heal(Player player) {
        if (!isAlive) return;
        System.out.println(name + " лечит " + player.name);
        player.increaseHealth(healPower);
    }
}