package com.xworkz.programmingquestions.runner;

public class ExceptionRunner {
public static void main(String[] args) throws InsufficientFundsException {
	int amount=100;
	try {
		if(amount>1000) {
			System.out.println("amount "+amount);
		}else {
			System.out.println("amount is less ");
			throw new InsufficientFundsException("insuffecient balance");
		}
	}
		finally {
	
		System.out.println("amount is greater than balance");
	}
}
}
