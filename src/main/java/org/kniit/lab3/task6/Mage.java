package org.kniit.lab3.task6;

class Mage extends Player {
    public Mage(String name) {
        super(name, 50, 25, 10);
    }
//заклинание
    public void castSpell(Player player) {
        if (!isAlive) return;
        System.out.println(name + " кастует заклинание на " + player.name);
        player.decreaseHealth(damage);
    }
}
