package org.kniit.lab3.task6;

public class Main {
    public static void main(String[] args) {

        WarriorGuard warrior = new WarriorGuard("Танк");
        Mage mage = new Mage("Маг");
        Priest priest = new Priest("Мерси");
//пример 1
        warrior.move(0, 0);
        mage.move(10, 10);
        System.out.println("\n");
        warrior.attack(mage);
//пример2
        System.out.println("\n");
        mage.move(2, 1);
        priest.move(1, 1);
        warrior.attack(mage);
        priest.heal(mage);
        mage.castSpell(warrior);
        for (int i = 1; i < 6; i++) {
            warrior.attack(mage);
        }
        priest.heal(mage);
        warrior.attack(mage);



        System.out.println("\n");
        System.out.println(warrior);
        System.out.println(mage);
        System.out.println(priest);
    }
}

