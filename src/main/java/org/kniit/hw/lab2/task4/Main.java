package org.kniit.hw.lab2.task4;

public class Main {
    public static void main(String[] args){
        NewspaperPublisher OnlyTruePublisher = new NewspaperPublisher();

        PersonSubscriber sub1 = new PersonSubscriber("anna");
        PersonSubscriber sub2 = new PersonSubscriber("milo");
        GroupSubscriber sub3 = new GroupSubscriber("We_love_True!!");

        OnlyTruePublisher.subscribe(sub1);
        OnlyTruePublisher.subscribe(sub2);
        OnlyTruePublisher.subscribe(sub3);

        OnlyTruePublisher.setNews("ИНТЕРНЕТ - ВСЁ! ! !");

        OnlyTruePublisher.unsubscribe(sub2);

        OnlyTruePublisher.setNews("ИНТЕРНЕТ -  НЕ ВСЁ! ! !");

    }
}
