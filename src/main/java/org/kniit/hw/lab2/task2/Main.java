package org.kniit.hw.lab2.task2;

public class Main {
    public static void main(String[] args) {
        Animal a1 = Zoo.createAnimal("dog");
        Animal a2 = Zoo.createAnimal("cat");

        a1.speak();
        a2.speak();
    }
}
