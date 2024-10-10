package com.xworkz.exception.runner;

import com.xworkz.exception.service.ArrayLengthException;

public class ArrayLengthExceptionRunner {

	public static void main(String[] args) throws ArrayLengthException {
		int listOfArray[]= {12,34,43,434};
		throw new ArrayLengthException(listOfArray);

	}

}
