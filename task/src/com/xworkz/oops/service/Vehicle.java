package com.xworkz.oops.service;

public interface Vehicle {

    void start();
    void stop();

    static void printVehicleInfo() {
        System.out.println("Vehicle Info: All vehicles have an engine");
    }

    static void printCommonRules() {
        System.out.println("Vehicle Rule: All vehicles must follow traffic laws.");
    }

    default void fuelType() {
        System.out.println("The vehicle uses petrol.");
    }

    default void maxSpeed() {
        System.out.println("The vehicle can go up to 120 km/h.");
    }
}