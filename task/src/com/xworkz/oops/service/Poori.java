package com.xworkz.oops.service;


public class Poori extends Food {
 public int price;
 public String type;
 public float quality;
 
 public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public float getQuality() {
	return quality;
}
public void setQuality(float quality) {
	this.quality = quality;
}
public void setPrice(int price) {
	this.price = price;
}

@Override
public String toString() {
	return "Poori: [price=" + price + ", type=" + type + ", quality=" + quality + "]";
}
public void getFooddetails() {
		System.out.println("Getting food details from poori");
	}
	public void getPrice()
	{
	System.out.println("getting food price details of poori");	
	}
	public void getRatings() {
		System.out.println("Getting ratings details from poori");
	}
	public void getHotelNamedetails() {
		System.out.println("Getting hotelname details from poori");
	}
	public void getLocationdetails() {
		System.out.println("Getting Location details from poori");
	}
}

