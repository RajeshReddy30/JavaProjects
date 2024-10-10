package com.xworkz.exception.service;

public class LengthCheckException extends Throwable{
	public LengthCheckException(String name) {
		System.out.println("name length:"+name.length());

}}
