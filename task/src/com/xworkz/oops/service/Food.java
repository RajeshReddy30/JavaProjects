package com.xworkz.oops.service;

public class Food {
	public String foodName;
	public int price;
	public float ratings;
	public String hotelName;
	public String location;
	
	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "Food [foodName=" + foodName + ", price=" + price + ", ratings=" + ratings + ", hotelName=" + hotelName
				+ ", location=" + location + "]";
	}
	
public void getFooddetails() {
	System.out.println("Getting food details from Food");
}
public void getPrice()
{
System.out.println("getting food price details");	
}
public void getRatings() {
	System.out.println("Getting ratings details from Food");
}
public void getHotelNamedetails() {
	System.out.println("Getting hotelname details from Food");
}
public void getLocationdetails() {
	System.out.println("Getting Location details from Food");
}
}
