package com.xworkz.task2.runner;

public class Car {
    
    private Engine engine;

    public Car() {
        engine = new Engine(); 
    }

    public void startCar() {
        engine.start(); 
        System.out.println("Car is starting");
}
}
