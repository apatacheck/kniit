package org.kniit.lab9.task14;

public enum TrafficLight {
    RED("RED"),
    YELLOW("YELLOW"),
    GREEN("GREEN");

    private final String title;

    static final private TrafficLight[] lightOrder = { //порядок переключения
            TrafficLight.RED,
            TrafficLight.YELLOW,
            TrafficLight.GREEN,
            TrafficLight.YELLOW
    };

    private TrafficLight(String title) { //конструктор
        this.title = title;
    }


    public String getNextLight() {
        int currentIndex = -1;
        for (int i = 0; i < lightOrder.length; i++) {
            if (lightOrder[i] == this) {
                currentIndex = i;
                break;
            }
        }
        int nextIndex = (currentIndex + 1) % lightOrder.length;
        return lightOrder[nextIndex].toString();
    }
}