package com.xworkz.oops.service;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }
}

