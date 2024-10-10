package com.xworkz.railway.dto;

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
public class PassengerDetailsDto {
	private String passengerName;
	private int age;
	private long mobileNumber;
	private long aadharNumber;
	private double amount;

}
