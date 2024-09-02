package com.xworkz.bank.things;

public class Car extends Vehicle {
    String type;
    int doors;
    boolean isElectric;
    double mileage;

    public Car(String make, String model, int year, String color, String type, int doors, boolean isElectric, double mileage) {
       
        this.type = type;
        this.doors = doors;
        this.isElectric = isElectric;
        this.mileage = mileage;
    }

    
    public void display() {
        
        System.out.println("Type: " + type);
        System.out.println("Doors: " + doors);
        System.out.println("Electric: " + isElectric);
        System.out.println("Mileage: " +mileage);}
}
