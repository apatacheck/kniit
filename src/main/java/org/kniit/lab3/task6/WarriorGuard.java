package org.kniit.lab3.task6;

class WarriorGuard extends Warrior {
    private int plusDefense = 10;
    public WarriorGuard(String name) {
        super(name);
        this.defense += plusDefense;
    }
    @Override
    public void decreaseHealth(int value) {
        if (!isAlive) {
            System.out.println(name + " мертв, по нему нельзя нанести урон.");
            return;
        }
        int finalDamage = value - (defense);
        if (finalDamage < 0) finalDamage = 0;
        health -= finalDamage;
        System.out.println(name + " получил урон: " + finalDamage + ". \\ Здоровье " + health);
        if (health <= 0) {
            isAlive = false;
            System.out.println(name + " погиб!");
        }
    }
}
