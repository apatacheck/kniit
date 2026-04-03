package org.kniit.hw.lab2.task4;

public class PersonSubscriber implements Subscriber {
    private String name;

    public PersonSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " получил новость: " + news);
    }

    @Override
    public String toString() {
        return name;
    }
}