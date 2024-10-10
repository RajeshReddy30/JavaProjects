package com.xworkz.exception.service;

public class ArrayLengthException extends Throwable {
	
	public ArrayLengthException(int array[]) {
		System.out.println("constructor is running:"+array.length);
	}

	

	

}
