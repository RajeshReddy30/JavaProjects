package com.xworkz.oops.service;

//Interface 1
interface Animal {
 void sound();
}

//Interface 2
interface Vehicle {
 void speed();
}

//Class that implements multiple interfaces
class Robot implements Animal, Vehicle {
 // Implement the sound() method from Animal interface
 @Override
 public void sound() {
     System.out.println("Robot mimics animal sound: Beep Beep!");
 }

 // Implement the speed() method from Vehicle interface
 @Override
 public void speed() {
     System.out.println("Robot moves at 10 km/h.");
 }
}

//Main class
public class MultipleInheritanceExample {
 public static void main(String[] args) {
     Robot robot = new Robot();
     
     // Access methods from both interfaces
     robot.sound();  // from Animal interface
     robot.speed();  // from Vehicle interface
 }
}
