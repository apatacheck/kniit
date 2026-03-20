package org.kniit.hw.lab2.task1;

public class Singleton {

    private Singleton() {}

    private static final Singleton INSTANCE = new Singleton();

    public static Singleton getInstance() {
        return INSTANCE;
    }
}