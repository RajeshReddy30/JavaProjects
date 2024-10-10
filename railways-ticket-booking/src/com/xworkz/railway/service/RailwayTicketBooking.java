package com.xworkz.railway.service;

import com.xworkz.railway.dto.RailwayTicketBookingDto;

public interface RailwayTicketBooking {
	String onSave(RailwayTicketBookingDto railwayTicketBookingDto);
	void read();
	String updateByPassengerName(String passengerName,RailwayTicketBookingDto railwayTicketBookingDto);
}
