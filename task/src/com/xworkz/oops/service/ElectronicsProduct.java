package com.xworkz.oops.service;

public class ElectronicsProduct extends ProductDetails {

	public ElectronicsProduct(String productName, String brandName, double price, int quantity, String category,
			String supplier, String color, String model, int warrantyPeriod, double weight) {
		super(productName, brandName, price, quantity, category, supplier, color, model, warrantyPeriod, weight);
	}

	@Override
	public void calculateTotalCost() {
		System.out.println("Total Cost: " + (getPrice() * getQuantity()));
	}

	@Override
	public void validateProduct() {
		System.out.println("Validating product: " + getProductName());
	}

	@Override
	public void applyDiscount() {
		System.out.println("Applying discount to: " + getProductName());
	}

}
