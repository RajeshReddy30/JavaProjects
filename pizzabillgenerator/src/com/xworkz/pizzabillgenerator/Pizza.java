package com.xworkz.pizzabillgenerator;

import java.util.Scanner;

public class Pizza {
	private int price;
	private boolean veg;
	private int extraCheesePrice = 100;
	private int extraToppingsPrice = 150;
	private int bagPrice = 20;
	private int basePizzaPrice;
	private boolean isExtraCheeseAdded;
	private boolean isExtraToppingsAdded;
	private boolean isOptedForTakeAway;

	// Constructor to initialize pizza type (veg or non-veg)
	public Pizza(boolean veg) {
		this.veg = veg;
		if (this.veg) {
			this.price = 300; // Veg pizza price
		} else {
			this.price = 400; // Non-veg pizza price
		}
		basePizzaPrice = this.price;
	}

	// Method to add extra toppings
	public void addExtraToppings() {
		isExtraToppingsAdded = true;
		this.price += extraToppingsPrice;
	}

	// Method to add extra cheese
	public void addExtraCheesePrice() {
		isExtraCheeseAdded = true;
		this.price += extraCheesePrice;
	}

	// Method to opt for takeaway
	public void takeAway() {
		isOptedForTakeAway = true;
		this.price += bagPrice;
	}

	// Method to generate and display the bill
	public void getBill() {
		String bill = "";
		System.out.println("Base Pizza Price: " + basePizzaPrice);
		if (isExtraCheeseAdded) {
			bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
		}
		if (isExtraToppingsAdded) {
			bill += "Extra Toppings Added: " + extraToppingsPrice + "\n";
		}
		if (isOptedForTakeAway) {
			bill += "Opted for Takeaway: " + bagPrice + "\n";
		}
		bill += "Total Bill: " + this.price;
		System.out.println(bill);
	}

	// Main method to run the pizza ordering process
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pizza pizza = null;

		// Choose between Base Pizza and Deluxe Pizza
		System.out.println("Choose Pizza Type:");
		System.out.println("1. Base Pizza");
		System.out.println("2. Deluxe Pizza");
		System.out.println("Enter your choice (1 or 2):");

		int pizzaChoice = scanner.nextInt();

		// Execute based on user choice for Pizza type
		switch (pizzaChoice) {
			case 1:
				pizza = new Pizza(false); // Base Pizza (non-veg example)
				System.out.println("Base Pizza selected.");
				break;
			case 2:
				pizza = new DeluxPizza(false); // Deluxe Pizza (non-veg example)
				System.out.println("Deluxe Pizza selected.");
				break;
			default:
				System.out.println("Invalid choice, defaulting to Base Pizza.");
				pizza = new Pizza(false); // Default to Base Pizza
		}

		boolean exit = false;

		// Keep prompting the user until they choose to exit
		while (!exit) {
			System.out.println("Choose your options:");
			System.out.println("1. Add Extra Toppings");
			System.out.println("2. Add Extra Cheese");
			System.out.println("3. Opt for Takeaway");
			System.out.println("4. Exit and Display Bill");
			System.out.println("Enter your choice (1-4):");

			int choice = scanner.nextInt();

			// Execute based on user choice
			switch (choice) {
				case 1:
					pizza.addExtraToppings();
					System.out.println("Extra toppings added.");
					break;
				case 2:
					pizza.addExtraCheesePrice();
					System.out.println("Extra cheese added.");
					break;
				case 3:
					pizza.takeAway();
					System.out.println("Takeaway option selected.");
					break;
				case 4:
					exit = true; // Exit the loop
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
			}
		}

		// Display the final bill after the user exits
		pizza.getBill();
		scanner.close(); // Close the scanner
	}
}





