package com.xworkz.vendor.runner;

import com.xworkz.vendor.dto.VendorDto;

import com.xworkz.vendor.repository.VendorRepositoryImplimentation;
import com.xworkz.vendor.service.VendorService;
import com.xworkz.vendor.service.VendorServiceImplimentation;

import java.util.Scanner;

public class VendorRunner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		VendorService vendorService = new VendorServiceImplimentation(new VendorRepositoryImplimentation());
		VendorDto newVendorDto = new VendorDto();
		int choice=0;
		while (choice != 5) {
			System.out.println("Vendor Management System");
			System.out.println("1. Add Vendor");
			System.out.println("2. Update Vendor");
			System.out.println("3. Delete Vendor");
			System.out.println("4. Get All Vendors");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			 choice = scanner.nextInt();

			switch (choice) {
			case 1: {
				VendorDto vendorDto = new VendorDto();
				System.out.print("Enter Vendor ID: ");
				vendorDto.setVendorId(scanner.nextInt());
				System.out.print("Enter Vendor Name: ");
				vendorDto.setVendorName(scanner.next());
				System.out.print("Enter Type of Products: ");
				vendorDto.setTypeOfProducts(scanner.next());
				System.out.print("Enter Email: ");
				vendorDto.setEmail(scanner.next());
				System.out.print("Enter Contact: ");
				vendorDto.setContact(scanner.nextLong());

				String result = vendorService.validate(vendorDto);
				System.out.println(result);
				break;
			}
			case 2: {
				System.out.print("Enter Vendor ID to update: ");
				int id = scanner.nextInt();

				System.out.print("Enter New Vendor Name: ");
				newVendorDto.setVendorName(scanner.next());
				System.out.print("Enter New Type of Products: ");
				newVendorDto.setTypeOfProducts(scanner.next());
				System.out.print("Enter New Email: ");
				newVendorDto.setEmail(scanner.next());
				System.out.print("Enter New Contact: ");
				newVendorDto.setContact(scanner.nextLong());

				System.out.println(vendorService.updateById(id, newVendorDto));
				break;
			}
			case 3: {
				System.out.print("Enter Vendor ID to delete: ");
				int id = scanner.nextInt();
				System.out.println(vendorService.deleteById(id, newVendorDto));
				break;
			}
			case 4: {
				System.out.println(vendorService.getAll());
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
