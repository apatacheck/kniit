package org.kniit.hw.lab2.task1;

public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1 == s2);
        //Singleton s = new Singleton(); //
    }
}
