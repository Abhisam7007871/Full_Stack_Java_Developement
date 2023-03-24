package com.inheritance;

import com.inheritance.vehicle.Bike;
import com.inheritance.vehicle.Car;
import com.inheritance.vehicle.Truck;

public class Demo {
    public static void main(String[] args) {
        Bike bike = new Bike("long","diesel",2,3,12,"Bulb");
        bike.run();
        Car car = new Car("Petrol",4,4,23,"LED","Yes","Sony","Voltas","Samsung","Google");
        car.run();
        Truck truck = new Truck("Diesel",4,5,45,"bulb","yes","boat","sansui",323);
        truck.run();
    }
}
