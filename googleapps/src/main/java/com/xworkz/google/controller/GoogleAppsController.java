package com.xworkz.google.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@RequestMapping
@Component
public class GoogleAppsController {

	
	@GetMapping("/submit")
	public String getResponce(@RequestParam String appName,@RequestParam int appSize ,@RequestParam String appDesc ,@RequestParam String appofferby ,@RequestParam int appRate,  Model model ) {
        System.out.println("Received Application Details:");
        System.out.println("App Name: " + appName);
        System.out.println("App Size: " + appSize);
        System.out.println("App Description: " + appDesc);
        System.out.println("Offered By: " + appofferby);
        System.out.println("App Rating: " + appRate);
		
		model.addAttribute("appName", appName);
		model.addAttribute("appSize", appSize);
		model.addAttribute("appDescr", appDesc);
		model.addAttribute("appofferBy", appofferby);
		model.addAttribute("appRates", appRate);
		
		return "success.jsp";
	}
}
