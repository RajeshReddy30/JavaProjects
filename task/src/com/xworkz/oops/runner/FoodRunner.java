package com.xworkz.oops.runner;

import com.xworkz.oops.service.Food;
import com.xworkz.oops.service.Poori;

public class FoodRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Food food = new Food();
  Poori poori = new Poori();
  
  food.foodName = "Lemon Rice";
  food.price = 30;
  food.ratings = 4.2f;
  food.location = "Bengaluru";
  food.hotelName = "Udupi Garden";
  poori.price = 50;
  poori.type = "MasalaDosa";
  poori.quality = 4.1f;
  System.out.println("Food name is:"+food.foodName);
  System.out.println("Food Price is:"+food.price);
  System.out.println("Food rating is:"+food.ratings);
  System.out.println("Hotel Location is:"+food.location);
  System.out.println("Hotel Name is:"+food.hotelName);
  System.out.println("Food Type is :"+poori.type);
  System.out.println("Food Quality is :"+poori.quality);
  System.out.println("Food Price is:"+poori.price);
  System.out.println(food.toString());
  Food hotel = poori;
  hotel.getFooddetails();
  hotel.getPrice();
  hotel.getRatings();
  hotel.getLocationdetails();
  hotel.getHotelNamedetails();
  poori.getFooddetails();
  if(food instanceof Poori) {
	  System.out.println("poori is a sub class of Food");
  }else {
	  System.out.println("poori is not a sub class");
  }
  if(hotel instanceof Poori ) {
	  System.out.println("poori is a sub class of Food");
  }else {
	  System.out.println("poori is not a sub class");
  }
  if(poori instanceof Food ) {
	  System.out.println("poori is a sub class of Food");
  }else {
	  System.out.println("poori is not a sub class");
  }
  if(hotel instanceof Poori ) {
	  System.out.println("poori is a sub class of Food");
  }else {
	  System.out.println("poori is not a sub class");
  }
  
  System.out.println("Dynamic Dispatch");
  //Food food = new Food();
  System.out.println("Food details is:"+food);
  
	}

}
