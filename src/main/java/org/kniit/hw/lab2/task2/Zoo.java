package org.kniit.hw.lab2.task2;

public class Zoo {
    public static Animal createAnimal(String type) {
        if (type.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat();
        }
        throw new IllegalArgumentException("Неизвестный тип животного");
    }
}
