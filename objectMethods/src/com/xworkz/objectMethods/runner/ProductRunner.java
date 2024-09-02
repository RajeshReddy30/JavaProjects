package com.xworkz.objectMethods.runner;

import com.xworkz.objectMethods.services.Product;

public class ProductRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product=new Product();
		Product name=new Product();
		product.productName="mobile";
		product.noOfProducts=23;
		product.isgood=true;
		product.productSize="10cm";
		name.productName="mobile";
		name.noOfProducts=23;
		name.isgood=true;
		name.productSize="10cm";
		if(product.equals(name))
			System.out.println("same");
		else
			System.out.println("not same");
		System.out.println("hashcode"+product.hashCode());
		
		System.out.println("hashcode"+product.toString());

	}

}
