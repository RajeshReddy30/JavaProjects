package com.xworkz.bank.things;

public class Location extends UserInformation {
	public String location;
	public Location() {
		
		System.out.println("Location constructor");

}
	public Location(String location) {
		this.location=location;
		System.out.println("location is:"+location);
	}

}
