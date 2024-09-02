package com.xworkz.bank.runner;

import com.xworkz.bank.services.Laptop;

public class LaptopRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop laptop=new Laptop();
		laptop.setLaptopName("Lenovo");
		laptop.setLaptopVersion("Version 8");
		System.out.println(laptop.getLaptopName());
		System.out.println(laptop.getLaptopVersion());
		laptop.getLaptopVersion();
	}

}
