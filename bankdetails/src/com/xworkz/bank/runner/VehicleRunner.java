package com.xworkz.bank.runner;
import com.xworkz.bank.things.Car;
public class VehicleRunner {
    public static void main(String[] args) {
        Car car = new Car("Tesla", "Model S", 2021, "Red", "Sedan", 4, true, 402.3);
        car.display();
}
}
