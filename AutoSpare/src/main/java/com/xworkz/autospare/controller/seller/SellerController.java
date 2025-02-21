package com.xworkz.autospare.controller.seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.autospare.dto.seller.SellerDto;
import com.xworkz.autospare.dto.user.ProjectDto;
import com.xworkz.autospare.service.admin.AdminService;
import com.xworkz.autospare.service.seller.SellerServiceImplements;
import com.xworkz.autospare.service.user.ProjectService;


@Controller
@Component
@RequestMapping("/")
public class SellerController {
	private SellerController() {
		System.out.println("SellerController");
	}
	@Autowired
	private AdminService aservice;
	@Autowired
	private ProjectService pservice;
	
	@Autowired
	private SellerServiceImplements service;
	
	@PostMapping("/seller")
	public String sellerSave(@ModelAttribute SellerDto dto,Model model) {
	    
	    boolean result = service.sellerSave(dto);
	    if (!result) {
	        model.addAttribute("check", "Enter Proper Details");
	        return "register";
	    }
	    model.addAttribute("Save", dto);
	    return "login";
	}
	@PostMapping("/SellerHomePage")
	public String verfiveOtp(@RequestParam String email, @RequestParam int otp, Model model) {
		boolean result = service.verifyOTP(otp, email);
		if (result) {
			model.addAttribute("mail", email);
			return "SellerHomePage";
		}
		model.addAttribute("wrong", "enter the correct otp");
		return "login";
	}
	

	
	@GetMapping("/sellerUpdate")
	public String update(@RequestParam String email, Model model) {
		if(email!=null) {
			System.out.println(email);
			boolean dto = service.getEmail(email);
			model.addAttribute("dto", dto);
			return "sellerUpdate";
		}
		return "view";
		

	}
	
	
	@PostMapping("/sellerupdate")
	public String updateDetails(@ModelAttribute ProjectDto dto,Model model ) {
		System.out.println(dto);
	if(pservice.updateByEmail(dto)) {
		model.addAttribute("update", pservice.updateByEmail(dto));
		
		return "view";
		
	}
		return "sellerUpdate";
		
	}
	
	@GetMapping("/sellerdelete")
	public String delete(@RequestParam String email, Model model) {
		ProjectDto dto = pservice.findByEmail(email);
		pservice.deleteByEmail(dto);
		model.addAttribute("dto", dto);
		return "view";

	}

}
