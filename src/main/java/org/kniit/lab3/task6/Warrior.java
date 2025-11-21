package org.kniit.lab3.task6;

class Warrior extends Player {
    protected int attackRange = 3;
    public Warrior(String name) {
        super(name, 120, 20, 15);
    }
    //атака
    public void attack(Player player) {
        double distance = Math.sqrt(Math.pow(x - player.x, 2) + Math.pow(y - player.y, 2));
        if (distance > attackRange) {
            System.out.println(name + " слишком далеко, чтобы ударить");
            return;
        }
        System.out.println(name + " атакует " + player.name);
        player.decreaseHealth(damage);
    }
}
