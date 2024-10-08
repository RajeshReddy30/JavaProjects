package com.xworkz.task2.runner;

public class ShallowCloning implements Cloneable {
	public String name;
	public int age;
	public String city;
	public String state;
	public String designation;
	public double salary;
	public int yearsOfExperience;
	public String companyName;

	public ShallowCloning(String name, int age, String city, String state, String designation, double salary,
			int yearsOfExperience, String companyName) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.state = state;
		this.designation = designation;
		this.salary = salary;
		this.yearsOfExperience = yearsOfExperience;
		this.companyName = companyName;
	}

	@Override
	public  Object clone() throws CloneNotSupportedException {
		return super.clone(); 
	}

	@Override
	public String toString() {
		return "ShallowCloning{name=" + name + ", age=" + age + ", city=" + city + ", state=" + state + ", designation="
				+ designation + ", salary=" + salary + ", yearsOfExperience=" + yearsOfExperience + ", companyName="
				+ companyName + "}";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		ShallowCloning original = new ShallowCloning("Amit", 30, "Mumbai", "Maharashtra", "Software Developer", 70000,
				3, "TechSolutions");
		ShallowCloning clone = (ShallowCloning) original.clone();

		System.out.println("Original: " + original);
		System.out.println("Clone: " + clone);
	}
}
