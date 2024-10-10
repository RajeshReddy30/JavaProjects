package com.xworkz.programmingquestions.runner;

public class MethodOverloading {
	public static int c=0;
	public static void add(int a,int b) {
		
		System.out.println("addition of two numbers");
		c=a+b;
		System.out.println(c);
	}
	public static void add(int a,int b,int d) {
		System.out.println("addition of three numbers");
		c=a+b+d;
		System.out.println(c);
	}
	public static void add(int a,int b,int d,int e) {
		System.out.println("addition of four numbers");
		c=a+b+d+e;
		System.out.println(c);
	}
	public static void main(String[] args) {
		MethodOverloading.add(7, 9);
		MethodOverloading.add(8, 8, 8);
		MethodOverloading.add(c, c, c, c);
		
	}

}
