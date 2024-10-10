package com.xworkz.task2.runner;

public class CloneRunner {
	public static void main(String[] args) {
		System.out.println("main method");
		Properties properties = new Properties();
		properties.name="Rajesh";
		properties.price=870970;
		System.out.println(properties);
		try {
			Properties properties1=properties.Clone();
			properties1.name="ganesh";
			properties1.price=987098;
			System.out.println(properties1);
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}
}
