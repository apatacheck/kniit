package org.kniit.hw.lab2.task4;

public class GroupSubscriber implements Subscriber {
    private String name;

    public GroupSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println("Группа "+ name + " получила новость: " + news);
    }

    @Override
    public String toString() {
        return name;
    }
}