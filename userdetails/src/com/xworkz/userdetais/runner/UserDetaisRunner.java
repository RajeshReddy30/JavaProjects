package com.xworkz.userdetais.runner;

import com.xworkz.userdetais.abstracts.AbstractUserInformation;
import com.xworkz.userdetais.dto.UserDetailsDto;
import com.xworkz.userdetais.service.UserInformation;

public class UserDetaisRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractUserInformation user= new UserInformation();
		UserDetailsDto details=new UserDetailsDto();
		
		
		details.setUserName("rajesh");
		details.setEmail("rajesh@gmail");
		System.out.println(user.onSave(details));	
		
		System.out.println(user.delete("rajeh@gmail"));
		System.out.println(user.read(details));
		
		
		

	}

}
