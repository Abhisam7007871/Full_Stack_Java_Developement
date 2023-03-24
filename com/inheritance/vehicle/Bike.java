package com.inheritance.vehicle;

import com.inheritance.parent.vehicle;


public class Bike extends vehicle {
    private String handle;

    public Bike() {
        super();
        this.handle = "short";
    }

    public Bike(String handle,String engine, int wheels, int seats, int fuelTanks, String lights) {
        super(engine,wheels,seats,fuelTanks,lights);
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }

    @Override
    public String toString() {
        return "Bike[getHandle()="+ getHandle() +", getEngine()="+getEngine()+", getWheel()="+getWheels()+", getFuelTank()="+getFuelTanks()+
                ", getSeats()="+getSeats()+", getLights()="+getLights()+"]";
    }

    public void run(){
        System.out.println("Running Bike");
        System.out.println(toString());
    }

}
