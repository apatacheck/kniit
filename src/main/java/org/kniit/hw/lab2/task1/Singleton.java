package org.kniit.hw.lab2.task1;

public class Singleton {

    private Singleton() {} //создание экземпляров класса возможно только ВНУТРИ этого класса

    private static final Singleton INSTANCE = new Singleton(); //создаем единственный экземляр класса

    public static Singleton getInstance() { //этот экземпляр будет доступен всем через этот геттер
        return INSTANCE;
    }
}