package com.inheritance.vehicle;

import com.inheritance.parent.vehicle;

public class Car extends vehicle {
    private String streeing;
    private String musicSystem;
    private String airConditioner;
    private String fridge;
    private String entertainmentSystem;

    public Car(String airConditioner) {
        super();
        this.airConditioner = airConditioner;
    }

    public Car(String engine, int wheels, int seats, int fuelTanks, String lights, String streeing, String musicSystem, String airConditioner, String fridge, String entertainmentSystem) {
        super(engine, wheels, seats, fuelTanks, lights);
        this.streeing = streeing;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.fridge = fridge;
        this.entertainmentSystem = entertainmentSystem;
    }

    public String getStreeing() {
        return streeing;
    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    public String getFridge() {
        return fridge;
    }

    public String getEntertainmentSystem() {
        return entertainmentSystem;
    }

    @Override
    public String toString() {
        return "Car{" +
                "streeing='" + streeing + '\'' +
                ", musicSystem='" + musicSystem + '\'' +
                ", airConditioner='" + airConditioner + '\'' +
                ", fridge='" + fridge + '\'' +
                ", entertainmentSystem='" + entertainmentSystem + '\'' +
                ", getEngine()="+getEngine()+ '\'' +", getWheel()="+getWheels()+ '\'' +", getFuelTank()="+getFuelTanks()+ '\''+
                ", getSeats()="+getSeats()+ '\''+", getLights()="+getLights()+
                '}';
    }
    public void run(){
        System.out.println("Running Car");
        System.out.println(toString());
    }
}
