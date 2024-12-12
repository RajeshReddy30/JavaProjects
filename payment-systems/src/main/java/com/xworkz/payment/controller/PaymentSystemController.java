package com.xworkz.payment.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.payment.dto.PaymentSystemDto;
import com.xworkz.payment.service.PaymentSystemService;

@RequestMapping("/")
@Component
public class PaymentSystemController {

	@Autowired
	private PaymentSystemService service;

	@PostMapping("/save")
	public String getResponce(@ModelAttribute PaymentSystemDto dto, Model model) {

		dto.setCreatedOn(LocalDateTime.now());
		model.addAttribute("details", dto);
		boolean result = service.onsave(dto);
		if (result != false) {
			model.addAttribute("fails", dto);
			return "fail";
		}
		return "success";
	}
}
