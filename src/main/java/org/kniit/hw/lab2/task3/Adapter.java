package org.kniit.hw.lab2.task3;

public class Adapter implements Transport  { //адаптер совместим с Transport
    private Boat boat;
    public Adapter(Boat boat){
        this.boat = boat;
    }

    public void Drive(){
        boat.Swim();
    }

}
