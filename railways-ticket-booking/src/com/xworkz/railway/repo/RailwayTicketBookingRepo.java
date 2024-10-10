package com.xworkz.railway.repo;

import com.xworkz.railway.dto.RailwayTicketBookingDto;

public interface RailwayTicketBookingRepo {
	boolean onSave(RailwayTicketBookingDto railwayTicketBookingDto);
	RailwayTicketBookingDto[] read();
	boolean updateByPassengerName(String passengerName,RailwayTicketBookingDto railwayTicketBookingDto);

}
