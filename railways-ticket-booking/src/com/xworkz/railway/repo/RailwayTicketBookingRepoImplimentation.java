package com.xworkz.railway.repo;

import com.xworkz.railway.dto.RailwayTicketBookingDto;

public class RailwayTicketBookingRepoImplimentation implements RailwayTicketBookingRepo {
	RailwayTicketBookingDto[] listOfRailwayTicketBookingDto;
	int index=0;
	public RailwayTicketBookingRepoImplimentation(int arraySize) {
		listOfRailwayTicketBookingDto=new RailwayTicketBookingDto[arraySize];
	}
	
	@Override
	public boolean onSave(RailwayTicketBookingDto railwayTicketBookingDto) {
		if(listOfRailwayTicketBookingDto!=null) {
			if(this.index<this.listOfRailwayTicketBookingDto.length)
				listOfRailwayTicketBookingDto[index]=railwayTicketBookingDto;
			index++;
			return true;
		}
		return false;
	}

	@Override
	public RailwayTicketBookingDto[] read() {
		
		return listOfRailwayTicketBookingDto ;
	}

	@Override
	public boolean updateByPassengerName(String passengerName, RailwayTicketBookingDto railwayTicketBookingDto) {
		if(passengerName!=null) {
			for(int i=0;i<listOfRailwayTicketBookingDto.length;i++) {
				if(listOfRailwayTicketBookingDto[i]!=null && listOfRailwayTicketBookingDto[i].getPassengerDetails().getPassengerName().equalsIgnoreCase(passengerName)) {
				listOfRailwayTicketBookingDto[i].setStationName(railwayTicketBookingDto.getStationName());
				listOfRailwayTicketBookingDto[i].setPlatformNumber(railwayTicketBookingDto.getPlatformNumber());
				listOfRailwayTicketBookingDto[i].setLocations(railwayTicketBookingDto.getLocations());
				listOfRailwayTicketBookingDto[i].setTrainNumber(railwayTicketBookingDto.getTrainNumber());
				
				return true;
			}
			}
		}
		return false;
	}

	
	

}
