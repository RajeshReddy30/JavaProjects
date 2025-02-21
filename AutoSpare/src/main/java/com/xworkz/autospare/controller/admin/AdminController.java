package com.xworkz.autospare.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.autospare.dto.user.ProjectDto;
import com.xworkz.autospare.service.admin.AdminService;
import com.xworkz.autospare.service.user.ProjectService;
@RequestMapping("/")
@Component
public class AdminController {
	@Autowired
	private AdminService service;
	@Autowired
	private ProjectService pservice;
	@PostMapping("/admin")
	public String Adminsignin(@RequestParam String email, @RequestParam String password, Model model) {
		System.out.println("admin SignIn Save Method is running");
		boolean result = service.findByEmailAndPassword(email, password);
		if (!result) {
			model.addAttribute("check", "Enter valid email and password");
			return "admin";
		}
		model.addAttribute("email", email);
		return "view";
	}
	@GetMapping("/Activeusers")
	public String viewAll(Model model) {
		model.addAttribute("save", service.findActive());
		return "view";
		
	}
	
	@GetMapping("/InActiveusers")
	public String view(Model model) {
		model.addAttribute("viewInActive", service.findInActive());
		return "view";
		
	}
	
	@GetMapping("/Adminupdate")
	public String update(@RequestParam String email, Model model) {
		if(email!=null) {
			System.out.println(email);
			ProjectDto dto = pservice.findByEmail(email);
			model.addAttribute("dto", dto);
			return "Adminupdate";
		}
		return "view";
		

	}
	@GetMapping("/adminupdateinactive")
	public String updateinactive(@RequestParam String email, Model model) {
		if(email != null) {
			System.out.println(email);
			ProjectDto dto = pservice.getInActiveEmail(email);
			
			model.addAttribute("dto", dto);
			return "Adminupdate";
		}
		return "view";
	}
	
	@PostMapping("/Adminupdate")
	public String updateDetails(@ModelAttribute ProjectDto dto,Model model ) {
		System.out.println(dto);
	if(pservice.updateByEmail(dto)) {
		model.addAttribute("update", pservice.updateByEmail(dto));
		
		return "view";
		
	}
		return "Adminupdate";
		
	}
	
	@GetMapping("/Admindelete")
	public String delete(@RequestParam String email, Model model) {
		ProjectDto dto = pservice.findByEmail(email);
		pservice.deleteByEmail(dto);
		model.addAttribute("dto", dto);
		return "view";

	}

}
