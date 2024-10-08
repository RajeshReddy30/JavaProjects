package com.xworkz.task2.runner;

 import java.util.Scanner;

public class TryWithResourceScannerDemo {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();  

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();  

        } 
        
    }
}
