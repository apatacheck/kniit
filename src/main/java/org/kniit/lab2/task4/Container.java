package org.kniit.lab2.task4;

public class Container {
    private double volume;
    public Container (double volume){
        this.volume = volume;
    }
    public String add(Shape shape){
        double shapeVolume = shape.getVolume();
        if (volume < shapeVolume) {
            return "Места нет :(" ;
        } else {
            volume -= shapeVolume;
            return "Фигура добавлена, оставшееся место: " + volume;
        }



    }
}

