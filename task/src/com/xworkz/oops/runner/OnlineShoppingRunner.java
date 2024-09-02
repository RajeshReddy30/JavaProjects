package com.xworkz.oops.runner;

import com.xworkz.oops.service.OnlineShopping;

public class OnlineShoppingRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnlineShopping online=new  OnlineShopping();
		online.applicationName="amazon";
		online.noofEmployees=876876;
		online.isapplicationUse=true;
		online.noofUsers=876875698L;
		online.grade='A';
		online.appsize=100;
		online.applicationRating=4.5f;
		online.applicationDownloads=786876989;
		int name=online.hashCode();
		System.out.println("hashcode is:"+name);
		

	}

}
