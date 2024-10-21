package com.xworkz.cab.runner;

import com.xworkz.cab.dto.CabDto;
import com.xworkz.cab.repository.CabRepositoryImplementation;
import com.xworkz.cab.service.CabService;
import com.xworkz.cab.service.CabServiceImplementation;

public class CabRunner {
	public static void main(String[] args) {
		CabDto cab=new CabDto();
		cab.setUserName("Rajesh");
		cab.setPassword("uiu0980");
		cab.setContact(7909809800l);
		cab.setEmail("rajesh@gmail.com");
		CabService service=new CabServiceImplementation(new CabRepositoryImplementation());
		System.out.println(service.validate(cab));
		System.out.println(service.getAll());
	}

}
