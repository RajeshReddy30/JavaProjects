package com.xworkz.app.runner;

import com.xworkz.app.Dto.ResortDto;
import com.xworkz.app.constant.ResortTypeConstant;
import com.xworkz.app.services.Resort;

public class ResortRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResortDto resort = new ResortDto("Ganesh Resort", "Nellore", 4.2, ResortTypeConstant.BEACH.toString());
		System.out.println(resort);
		System.out.println(resort);
		System.out.println(resort);
		System.out.println(resort);
		Resort res = new Resort();

		System.out.println(res.onSave(resort));

	}

}
