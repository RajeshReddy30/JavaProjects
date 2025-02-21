package com.xworkz.autospare.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.autospare.entity.user.SignUpEntity;
import com.xworkz.autospare.service.seller.SellerService;
import com.xworkz.autospare.service.user.ProjectService;

@RestController
public class LoginInResource {

	@Autowired
	SellerService service;

 SignUpEntity	 entity = new SignUpEntity();

	@GetMapping("/checkemail")
	public String isEmailPresent(@RequestParam String email) {
		if (email != null) {
			System.out.println("email is not null" + email);
			if (service.getEmail(email)) {
				return "Email Exist";
			}
		}

		return "Email not exist,Please SignUp";
	}
	@GetMapping("/SellerOtp")
	public String sendOtp(@RequestParam String email) {
		boolean result = service.sendOtp(email);
		if(result) {
			return "OTP sent";
		}
		return "OTP not sent";
		
		
	}


}
