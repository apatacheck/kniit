package org.kniit.hw.lab2.task2;

public class DogFactory extends AnimalFactory {
    public Animal createAnimal(){
        System.out.println("создали собаку");
        return new Dog();
    }
}
