package org.kniit.hw.lab2.task2;

public class CatFactory extends AnimalFactory {
    public Animal createAnimal(){
        System.out.println("создали кошку");
        return new Cat();
    }
}
