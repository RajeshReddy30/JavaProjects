package com.xworkz.oops.service;

public interface Device {

    void powerOn();
    void powerOff();

    static void deviceCategory() {
        System.out.println("Device Category: Electronic devices.");
    }

    static void deviceUsage() {
        System.out.println("Device Usage: Can be used for multiple purposes.");
    }


    default void softwareVersion() {
        System.out.println("Device software version: 1.0");
    }

    default void connectivity() {
        System.out.println("Connectivity: Supports Bluetooth and WiFi.");
    }
}