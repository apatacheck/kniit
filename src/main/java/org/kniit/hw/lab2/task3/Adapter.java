package org.kniit.hw.lab2.task3;

public class Adapter implements Transport  {
    private Boat boat;
    public Adapter(Boat boat){
        this.boat = boat;
    }
    @Override
    public void Drive(){
        boat.Ride();
    }

}
