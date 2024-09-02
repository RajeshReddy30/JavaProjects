package com.xworkz.userdetais.util;

import com.xworkz.userdetais.dto.UserDetailsDto;

public class UserInformationConstant {
	public static void checkAddress(UserDetailsDto userDetailsDto) {
		if(userDetailsDto!=null && userDetailsDto.getAddress().length()>10 && 
				!userDetailsDto.getAddress().isBlank() && !userDetailsDto.getAddress().isEmpty())
			System.out.println("address saved");
		else
			System.out.println("address not saved");
	}
		

}
