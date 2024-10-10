package com.xworkz.railway.service;

import com.xworkz.railway.dto.RailwayTicketBookingDto;
import com.xworkz.railway.repo.RailwayTicketBookingRepo;
import com.xworkz.railway.repo.RailwayTicketBookingRepoImplimentation;

public class RailwayTicketBookingImplimentation implements RailwayTicketBooking {
	RailwayTicketBookingRepo repo=new RailwayTicketBookingRepoImplimentation(3);

	@Override
	public String onSave(RailwayTicketBookingDto railwayTicketBookingDto) {
		if(railwayTicketBookingDto!=null) {
			repo.onSave(railwayTicketBookingDto);
			return "saved successfully";
		}
		return "not savedsuccessfully";
	}

	@Override
	public void read() {
		RailwayTicketBookingDto[] dto=repo.read();
		for(RailwayTicketBookingDto dtos: dto) {
			System.out.println("railway ticket details:"+dtos);
		}
		
	}

	@Override
	public String updateByPassengerName(String passengerName, RailwayTicketBookingDto railwayTicketBookingDto) {
		if(passengerName!=null) {
			if(repo.updateByPassengerName(passengerName, railwayTicketBookingDto)) {
				repo.updateByPassengerName(passengerName, railwayTicketBookingDto);
				return "updated successfully";
			}
		}
		return "not updated";
	}

	


}
