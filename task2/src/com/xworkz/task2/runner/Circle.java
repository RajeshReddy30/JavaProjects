package com.xworkz.task2.runner;

public class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    void erase() {
        System.out.println("Erasing a circle");
    }

    @Override
    void move() {
        System.out.println("Moving the circle");
    }
}

