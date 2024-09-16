package com.xworkz.oops.service;

public class WashingMachine implements Appliance {
    @Override
    public void turnOn() {
        System.out.println("Washing machine is turning on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Washing machine is turning off.");
    }

    @Override
    public void increasePower() {
        System.out.println("Washing machine is increasing power.");
    }
}
