package org.kniit.hw.lab2.task2;

public class Main {
    public static void main(String[] args) {
        AnimalFactory doggy = new DogFactory();
        AnimalFactory kitty = new CatFactory();

        doggy.sounder();
        kitty.sounder();
    }
}
