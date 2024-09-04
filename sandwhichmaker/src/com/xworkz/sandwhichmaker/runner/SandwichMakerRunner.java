package com.xworkz.sandwhichmaker.runner;

import java.time.LocalDate;
import java.util.Scanner;

import com.xworkz.sandwhichmaker.dto.SandwichMakerDto;
import com.xworkz.sandwhichmaker.service.SandwichMaker;

public class SandwichMakerRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        

        SandwichMaker maker = new SandwichMaker(arraySize);

        boolean running = true;
        while (running) {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Get the length of the array");
            System.out.println("2. Save a sandwich");
            System.out.println("3. Read a sandwich by index");
            System.out.println("4. Search for a sandwich by type");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
           

            switch (choice) {
                case 1:
                    System.out.println("The length of the array is: " + maker.getArrayLength());
                    break;
                case 2:
                    System.out.println("Enter the number of sandwiches to save:");
                    int instanceCount = scanner.nextInt();
                    scanner.nextLine(); 

                    if (instanceCount <= arraySize) {
                        for (int i = 0; i < instanceCount; i++) {
                            SandwichMakerDto sandwich = new SandwichMakerDto();

                            System.out.print("Enter sandwich type: ");
                            sandwich.setSandwichType(scanner.nextLine());

                            System.out.print("Enter bread type: ");
                            sandwich.setBreadType(scanner.nextLine());

                            System.out.print("Enter filling type: ");
                            sandwich.setFillingType(scanner.nextLine());

                            System.out.print("Is the sandwich toasted? : ");
                            sandwich.setToasted(scanner.nextBoolean());

                            System.out.print("Does the sandwich have cheese? : ");
                            sandwich.setHasCheese(scanner.nextBoolean());

                            System.out.print("Does the sandwich have sauce? : ");
                            sandwich.setHasSauce(scanner.nextBoolean());

                            System.out.print("Enter sandwich size: ");
                            sandwich.setSandwichSize(scanner.nextInt());

                            System.out.print("Enter calories: ");
                            sandwich.setCalories(scanner.nextInt());
                            

                            System.out.print("Enter sandwich maker name: ");
                            sandwich.setSandwichMakerName(scanner.nextLine());

                            System.out.print("Enter sandwich shop name: ");
                            sandwich.setSandwichShopName(scanner.nextLine());

                            System.out.print("Enter price: ");
                            sandwich.setPrice(scanner.nextDouble());

                            sandwich.setManufactureDate(LocalDate.now());

                            System.out.print("Is the sandwich vegetarian? (true/false): ");
                            sandwich.setVegetarian(scanner.nextBoolean());

                            System.out.print("Enter packaging type: ");
                            
                            sandwich.setPackagingType(scanner.nextLine());

                            System.out.print("Enter shelf life (in days): ");
                            sandwich.setShelfLife(scanner.nextInt());
                            

                            System.out.println("Save result: " + maker.onSave(sandwich));
                        }
                    } else {
                        System.out.println("Instance count exceeds array size.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the index to read: ");
                    int index = scanner.nextInt();
                    SandwichMakerDto sandwich = maker.read(index);
                    System.out.println("Sandwich at index " + index + ": " + sandwich);
                    break;
                case 4:
                    System.out.print("Enter sandwich type to search for: ");
                    String type = scanner.next();
                    SandwichMakerDto foundSandwich = maker.search(type);
                    System.out.println("Found sandwich: " +foundSandwich);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Please enter a valid option.");
            }
        }
        scanner.close();
    }
}

