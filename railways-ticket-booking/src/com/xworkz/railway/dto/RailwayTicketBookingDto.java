package com.xworkz.railway.dto;

import com.xworkz.railway.constant.LocationConstant;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class RailwayTicketBookingDto {
	private String stationName;
	private int trainNumber;
	private String platformNumber;
	private LocationConstant locations;
	private PassengerDetailsDto passengerDetails;

}
