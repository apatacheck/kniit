package org.kniit.hw.lab2.task4;

import java.util.ArrayList;
import java.util.List;

public class NewspaperPublisher implements Publisher {  //издатель
    private String currentNews;
    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println("Добавили " + subscriber + " в подписчики.");
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println("Убрали " + subscriber + " из подписчиков.");
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(currentNews);
        }
    }

    public void setNews(String news) { //внутреннее состояние - изменяем объект
        this.currentNews = news;
        System.out.println("НОВОСТИ!! " + news);
        notifySubscribers();
    }
}
