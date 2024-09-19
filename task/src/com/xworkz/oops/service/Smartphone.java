package com.xworkz.oops.service;

public class Smartphone {

   
    private String brand;
    private String model;
    private String operatingSystem;
    private int ram; 
    private int storage;
    private double screenSize; 
    private int batteryCapacity; 
    private int cameraResolution; 
    private boolean has5G;
    private double price; 

   
    public static int totalSmartphonesSold;
    public static String manufacturerCountry = "South Korea";

    
    public Smartphone(String brand, String model, String operatingSystem, int ram, int storage, double screenSize,
            int batteryCapacity, int cameraResolution, boolean has5G, double price) {
        this.brand = brand;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
        this.cameraResolution = cameraResolution;
        this.has5G = has5G;
        this.price = price;
        
    }

   

    public static void showTotalSmartphonesSold() {
        System.out.println("Total smartphones sold: " + totalSmartphonesSold);
    }

    public static void showManufacturerCountry() {
        System.out.println("Manufacturer Country: " + manufacturerCountry);
    }

   

    public void displaySmartphoneDetails() {
        System.out.println("display details");
    }

    public void applyDiscount(double discountPercentage) {
        double discountAmount = (price * discountPercentage) / 100;
        this.price -= discountAmount;
        System.out.println("Discount applied New price: rs" + this.price);
    }}
