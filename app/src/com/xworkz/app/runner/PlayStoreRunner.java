package com.xworkz.app.runner;

import java.time.LocalDate;
import java.util.Arrays;

import com.xworkz.app.Dto.PlayStoreDto;
import com.xworkz.app.constant.ApplicationNameConstant;
import com.xworkz.app.constant.ApplicationTypeConstant;
import com.xworkz.app.services.PlayStore;

public class PlayStoreRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayStoreDto amazon = new PlayStoreDto(ApplicationNameConstant.AMAZON.toString(),
				ApplicationTypeConstant.ECOMMERS.toString(), "123MB", LocalDate.now());
		PlayStoreDto flipkart = new PlayStoreDto(ApplicationNameConstant.FLIPKART.toString(),
				ApplicationTypeConstant.ECOMMERS.toString(), "123MB", LocalDate.now());
		PlayStoreDto ludo = new PlayStoreDto(ApplicationNameConstant.LUDO.toString(),
				ApplicationTypeConstant.GAMMING.toString(), "123MB", LocalDate.now());
		System.out.println(amazon);
		PlayStore playstore = new PlayStore();
		System.out.println(playstore.onSave(amazon));
		System.out.println(playstore.onSave(flipkart));
		System.out.println(playstore.onSave(ludo));
		playstore.getAllelements();
		System.out.println(playstore.getByApplicationName("amazon"));
		System.out.println(playstore.getByApplicationType("Gamming"));
		System.out.println(playstore.getByCreatedDate(LocalDate.of(2024, 3, 1)));
		System.out.println(playstore.updateByApplicationName("amazon", flipkart));
		
		
		

	}

}
