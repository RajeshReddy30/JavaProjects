package com.xworkz.exception.service;

public class NullCheckException extends Throwable {
	public NullCheckException(String message) {
		System.out.println("null check constructor:"+message);
	}

}
