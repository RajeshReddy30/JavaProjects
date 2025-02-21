package com.xworkz.autospare.resources.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.autospare.service.user.ProjectService;


@RestController
@RequestMapping("/")
public class SignUpResource {

	@Autowired
	ProjectService service;

	@GetMapping("/getMail")
	public String isEmailPresent(@RequestParam String email) {
		if (service.getEmail(email)) {
			return "E-mail  already exists.";
		}
		return "Email doesn't exist";
	}
	
	@GetMapping("/getAadhar")
	public String isAadharPresent(@RequestParam long aadharNumber) {
		System.err.println(aadharNumber);
		if(service.getAadharNumber(aadharNumber)) {
			return "AadharNumber already exists";
		}
		return null;
	}
	@GetMapping("/getContact")
	public String isContactPresent(@RequestParam long contactNumber) {
		System.err.println(contactNumber);
		if(service.getContactNumber(contactNumber)) {
			return " ContactNumber already exists";
		}
		return null;
	}

	@GetMapping("/sendOTP")
	public String sendOtp(@RequestParam String email) {
		boolean result = service.sendOtp(email);
		if(result) {
			return "OTP sent";
		}
		return "OTP not sent";
		
		
	}
	

}
