package com.xworkz.oops.runner;

import com.xworkz.oops.service.ElectronicsProduct;
import com.xworkz.oops.service.ProductDetails;

public class ProductDetailsRunner {

	public static void main(String[] args) {

		ElectronicsProduct product = new ElectronicsProduct("Laptop", "Dell", 1000.0, 5, "Electronics", "Rajesh Suppliers",
				"Black", "Inspiron", 24, 2.5);

		product.displayProductDetails();
		product.displaySupplierDetails();
		product.displayWarranty();

		ProductDetails.printMessage();
		ProductDetails.calculateDiscount(product.getPrice());
		ProductDetails.showCompanyInfo();

		product.calculateTotalCost();
		product.validateProduct();
		product.applyDiscount();
	}
}
