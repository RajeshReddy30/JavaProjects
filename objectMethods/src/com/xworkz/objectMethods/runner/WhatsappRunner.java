package com.xworkz.objectMethods.runner;

import com.xworkz.objectMethods.services.Whatsapp;

public class WhatsappRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Whatsapp rajesh =new Whatsapp("Rajesh",98779,true);
		Whatsapp raj=new Whatsapp();
		
		
		if(rajesh.equals(rajesh)) 
			System.out.println("instances are same");
		
		else
			System.out.println("instances are  not same");
		int num=rajesh.hashCode();
		System.out.println("hashcode is:"+num);
		String name=rajesh.toString();
		System.out.println("to string is:"+name);
		Whatsapp.getDetails("12.4",9879);
		rajesh.setDetails();
		Whatsapp.getDetails();
		rajesh.setDetails("19748301");

	}


}
