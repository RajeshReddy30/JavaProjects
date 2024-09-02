package com.xworkz.userdetais.dto;

import com.xworkz.userdetais.constant.GenderConstant;

import lombok.*;
@Setter
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class UserDetailsDto{
	private String userName;
	private String email;
	private long contactNumber;
	private short age;
	private String education;
	private GenderConstant gender;
	private String designation;
	private String address;
	private long aadharNumber;
	
	

}
