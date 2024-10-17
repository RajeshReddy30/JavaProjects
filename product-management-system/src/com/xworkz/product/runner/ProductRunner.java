package com.xworkz.product.runner;

import com.xworkz.product.dto.ProductDto;
import com.xworkz.product.repository.ProductRepositoryImplementation;
import com.xworkz.product.service.ProductService;
import com.xworkz.product.service.ProductServiceImplementation;

import java.util.Scanner;

public class ProductRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductService service = new ProductServiceImplementation(new ProductRepositoryImplementation());
        int choice = 0;
        ProductDto newProductDto = new ProductDto();

        while (choice != 5) {
            System.out.println("Product Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Get All Products");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    ProductDto productDto = new ProductDto();
                    System.out.print("Enter Product ID: ");
                    productDto.setProductId(scanner.nextInt());
                    System.out.print("Enter Product Name: ");
                    productDto.setProductName(scanner.next());
                    System.out.print("Enter Product Type: ");
                    productDto.setProductType(scanner.next());

                    System.out.println(service.validate(productDto));
                    break;
                }
                case 2: {
                    System.out.print("Enter Product ID to update: ");
                    int id = scanner.nextInt();
                   
                    System.out.print("Enter New Product Name: ");
                    newProductDto.setProductName(scanner.next());
                    System.out.print("Enter New Product Type: ");
                    newProductDto.setProductType(scanner.next());

                    System.out.println(service.updateById(id, newProductDto));
                    break;
                }
                case 3: {
                    System.out.print("Enter Product ID to delete: ");
                    int id = scanner.nextInt();
                    System.out.println(service.deleteById(id, newProductDto));
                    break;
                }
                case 4: {
                    System.out.println(service.getAll());
                    break;
                }
                case 5: {
                    System.out.println("Exiting...");
                    break;
                }
                default: {
                    System.out.println("Invalid choice. Please try again.");
                    break;
                }
            }
        }

        scanner.close();
    }
}

