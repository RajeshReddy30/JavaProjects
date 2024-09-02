package com.xworkz.oops.runner;

import com.xworkz.oops.service.Ecommerce;

public class EcommerceRunner {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Ecommerce ecommerce=new Ecommerce();
		ecommerce.applicationName="amazon";
		ecommerce.noofEmployees=876876;
		ecommerce.isapplicationUse=true;
		ecommerce.noofUsers=876875698L;
		ecommerce.grade='A';
		ecommerce.appsize=100;
		ecommerce.applicationRating=4.5f;
		ecommerce.applicationDownloads=786876989;
		
		
		
		System.out.println("ecommerce for hashcode is:"+ecommerce.hashCode());

	}

}
