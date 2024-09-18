package com.xworkz.oops.service;

public interface Appliance {


    void turnOn();
    void turnOff();

    static void warrantyPeriod() {
        System.out.println("Appliance Warranty: All appliances have a 2-year warranty.");
    }

    static void energyEfficiencyRating() {
        System.out.println("Energy Efficiency: Appliances should be energy efficient.");
    }

    
    default void voltage() {
        System.out.println("The appliance operates at 220V.");
    }

    default void brand() {
        System.out.println("Brand: Default Appliance Brand");
    }
}
