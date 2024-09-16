package com.xworkz.oops.service;

public class Laptop implements Device {
    @Override
    public void bootUp() {
        System.out.println("Laptop is booting up.");
    }

    @Override
    public void shutDown() {
        System.out.println("Laptop is shutting down.");
    }

    @Override
    public void reset() {
        System.out.println("Laptop is resetting.");
    }
}
