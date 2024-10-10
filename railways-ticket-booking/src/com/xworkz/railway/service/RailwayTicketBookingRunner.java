package com.xworkz.railway.service;

import com.xworkz.railway.constant.LocationConstant;
import com.xworkz.railway.dto.PassengerDetailsDto;
import com.xworkz.railway.dto.RailwayTicketBookingDto;



public class RailwayTicketBookingRunner {

	public static void main(String[] args) {
		RailwayTicketBookingDto booking=new RailwayTicketBookingDto();
		PassengerDetailsDto details=new PassengerDetailsDto();
		booking.setStationName("Nellore");
		booking.setTrainNumber(2241);
		booking.setPlatformNumber("P2");
		booking.setLocations(LocationConstant.GUDUR);
		booking.setPassengerDetails(details);
		details.setPassengerName("Rajesh");
		details.setAge(22);
		details.setMobileNumber(9080649200L);
		details.setAadharNumber(706089522219L);
		details.setAmount(500);
		RailwayTicketBookingDto bookings=new RailwayTicketBookingDto();
		bookings.setStationName("banglore");
		bookings.setTrainNumber(287098709);
		bookings.setPlatformNumber("P7");
		bookings.setLocations(LocationConstant.CHITTOOR);
		RailwayTicketBooking service=new RailwayTicketBookingImplimentation();
		
		System.out.println(service.onSave(booking));
		System.out.println(service.onSave(bookings));
		bookings.setPassengerDetails(details);
		service.read();
		System.out.println(service.updateByPassengerName("rajesh", bookings));
		service.read();
	}
}
