package com.xworkz.oops.runner;

import java.util.Scanner;

import com.xworkz.oops.dto.CoffeeMakerDto;
import com.xworkz.oops.service.CoffeeMakerService;

public class CoffeeMakerRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the Coffee Maker array: ");
        int size = scanner.nextInt();
        CoffeeMakerService coffeeMakerService = new CoffeeMakerService(size);

        
            System.out.println("1. Save Coffee Maker");
            System.out.println("2. Update Brand Name");
            System.out.println("3. Search by Brand Name");
            System.out.println("4. Search by Product Code");
            System.out.println("5. Delete by Product Code");
           System.out.println(("6. to get array length"));
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    CoffeeMakerDto dto = new CoffeeMakerDto();
                    System.out.print("Enter Brand Name: ");
                    dto.setBrandName(scanner.next());
                    System.out.print("Enter Model: ");
                    dto.setModel(scanner.next());
                    System.out.print("Enter Product Code: ");
                    dto.setProductCode(scanner.nextInt());
                    System.out.print("Enter Price: ");
                    dto.setPrice(scanner.nextDouble());
                    System.out.print("Enter Capacity : ");
                    dto.setCapacity(scanner.nextInt());
                    System.out.print("Is it Automatic: ");
                    dto.setAutomatic(scanner.nextBoolean());

                    String saveResult = coffeeMakerService.saveCoffeeMaker(dto);
                    System.out.println(saveResult);
                    break;

                case 2:
                    System.out.print("Enter Product Code to update: ");
                    int productCodeToUpdate = scanner.nextInt();
                    System.out.print("Enter new Brand Name: ");
                    String newBrandName = scanner.next();

                    String updateResult = coffeeMakerService.updateBrandName(productCodeToUpdate, newBrandName);
                    System.out.println(updateResult);
                    break;

                case 3:
                    System.out.print("Enter Brand Name to search: ");
                    String brandName = scanner.next();
                    CoffeeMakerDto searchedByBrand = coffeeMakerService.searchByBrandName(brandName);
                  
                    break;

                case 4:
                    System.out.print("Enter Product Code to search: ");
                    int productCodeToSearch = scanner.nextInt();
                    CoffeeMakerDto searchedByProductCode = coffeeMakerService.searchByProductCode(productCodeToSearch);
                    
                    break;

                case 5:
                    System.out.print("Enter Product Code to delete: ");
                    int productCodeToDelete = scanner.nextInt();
                    boolean deleteResult = coffeeMakerService.delete(productCodeToDelete);
                    
                    break;

                case 6:
                    System.out.println("array length is:"+size);
                    scanner.close();
                    

                default:
                    System.out.println("Please enter a valid option.");
            }
        }
    }


