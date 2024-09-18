package com.xworkz.pizzabillgenerator;

public class DeluxPizza extends Pizza {

	// Constructor for Deluxe Pizza
	public DeluxPizza(boolean veg) {
		super(veg); // Calling the base constructor
		// Automatically add extra cheese and toppings for Deluxe Pizza
		super.addExtraCheesePrice();
		super.addExtraToppings();
	}
}

