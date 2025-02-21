package com.xworkz.autospare.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.autospare.service.user.ProjectService;

@RequestMapping("/")
@Component
public class ResetController {
	@Autowired
	private ProjectService service;

	
	@PostMapping("/ResetPassword")
	public String verfiveOtp(@RequestParam String email, @RequestParam int otp, Model model) {
		boolean result = service.verifyOTP(otp, email);
		if (result) {
			model.addAttribute("mail", email);
			return "passwordreset";
		}
		model.addAttribute("wrong", "enter the correct otp");
		return "reset";
	}

	@PostMapping("/Reset")
	public String resetPassword(@RequestParam("email") String email, @RequestParam("password") String password) {
		boolean result = service.updatePasswordByEmail(password, email);
		if (result) {
			return "signin";
		}

		return "passwordreset";
	}
}
