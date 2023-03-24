package com.inheritance.vehicle;

import com.inheritance.parent.vehicle;

public class Truck extends vehicle {
    private String streeing;
    private String musicSystem;
    private String  airConditioner;
    private int container;

    public Truck(String airConditioner) {
        super();
        this.airConditioner = airConditioner;
    }

    public Truck(String engine, int wheels, int seats, int fuelTanks, String lights, String streeing, String musicSystem, String airConditioner, int container) {
        super(engine, wheels, seats, fuelTanks, lights);
        this.streeing = streeing;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.container = container;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "streeing='" + streeing + '\'' +
                ", musicSystem='" + musicSystem + '\'' +
                ", airConditioner='" + airConditioner + '\'' +
                ", container=" + container +
                ", getEngine()="+getEngine()+ '\'' +", getWheel()="+getWheels()+ '\'' +", getFuelTank()="+getFuelTanks()+ '\''+
                ", getSeats()="+getSeats()+ '\''+", getLights()="+getLights()+
                '}';
    }
    public void run(){
        System.out.println("Running Truck");
        System.out.println(toString());
    }
}
