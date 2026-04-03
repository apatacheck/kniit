package org.kniit.hw.lab2.task2;

public  abstract class AnimalFactory {
    public abstract Animal createAnimal(); //фабричный метод, подклассы определяют тип животного

    public void sounder(){  //общая логика
        Animal animal = createAnimal(); //
        System.out.println("И вот неожиданно...Cреди тишины...Мы услышали");
        animal.speak();
    }
}
