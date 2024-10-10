package com.xworkz.programmingquestions.runner;

public class Bike extends Vehicle {
	@Override
	public void start() {
System.out.println("bike start method");
}
public static void main(String[] args) {
	Vehicle vehicle=new Vehicle();
	vehicle.start();
	Bike bike=new Bike();
	bike.start();
	Car car =new Car();
	car.start();
}
}
