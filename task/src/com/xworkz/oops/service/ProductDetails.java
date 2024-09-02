package com.xworkz.oops.service;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public abstract class ProductDetails {

	private String productName;
	private String brandName;
	private double price;
	private int quantity;
	private String category;
	private String supplier;
	private String color;
	private String model;
	private int warrantyPeriod;
	private double weight;

	public ProductDetails(String productName, String brandName, double price, int quantity, String category,
			String supplier, String color, String model, int warrantyPeriod, double weight) {
		this.productName = productName;
		this.brandName = brandName;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
		this.supplier = supplier;
		this.color = color;
		this.model = model;
		this.warrantyPeriod = warrantyPeriod;
		this.weight = weight;
	}

	public void displayProductDetails() {
		System.out.println("Product Name: " + productName);
		System.out.println("Brand Name: " + brandName);
		System.out.println("Price: " + price);
	}

	public void displaySupplierDetails() {
		System.out.println("Supplier: " + supplier);
		System.out.println("Quantity: " + quantity);
	}

	public void displayWarranty() {
		System.out.println("Warranty Period: " + warrantyPeriod + " months");
	}

	public static void printMessage() {
		System.out.println("This is a static method: printMessage");
	}

	public static void calculateDiscount(double price) {
		System.out.println("Discounted Price: " + (price * 0.9));
	}

	public static void showCompanyInfo() {
		System.out.println("Company: Xworkz Corporation");
	}

	public abstract void calculateTotalCost();

	public abstract void validateProduct();

	public abstract void applyDiscount();
}
