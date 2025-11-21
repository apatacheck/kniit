package org.kniit.lab3.task6;

abstract class Player {
    protected String name;
    protected int health;
    protected int maxHealth;
    protected boolean isAlive = true;
    protected int x;
    protected int y;
    protected int damage;
    protected int defense;

    public Player(String name, int maxHealth, int damage, int defense) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.damage = damage;
        this.defense = defense;
    }
//добавить здоровье
    public void increaseHealth(int value) {
        if (!isAlive) {
            System.out.println(name + " мертв и не может быть вылечен.");
            return;
        }

        health += value;
        if (health > maxHealth) health = maxHealth;
        System.out.println(name + " восстановил " + value + ". \\ Здоровье: " + health);
}

    //понизить здоровье
    public void decreaseHealth(int value) {
        if (!isAlive) {
            System.out.println(name + " мертв, по нему нельзя нанести урон.");
            return;
        }

        int finalDamage = value - defense;
        if (finalDamage < 0) finalDamage = 0;

        health -= finalDamage;
        System.out.println(name + " получил урон: " + finalDamage + ". \\ Здоровье:" + health);

        if (health <= 0) {
            isAlive = false;
            System.out.println(name + " погиб!");
        }
    }

    //перемещение
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println(name + " переместился на (" + x + ", " + y + ")");
    }
//вывод
    @Override
    public String toString() {
        return name + " [HP=" + health + "/" + maxHealth + ",DMG=" + damage + ", DEF=" + defense + "]";
    }
}
