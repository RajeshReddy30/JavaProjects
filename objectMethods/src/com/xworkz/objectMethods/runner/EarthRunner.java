package com.xworkz.objectMethods.runner;

import com.xworkz.objectMethods.constant.Days;
import com.xworkz.objectMethods.constant.Months;
import com.xworkz.objectMethods.constant.Places;
import com.xworkz.objectMethods.constant.Planet;
import com.xworkz.objectMethods.services.Earth;

public class EarthRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Earth earth=new Earth(Months.APR,Days.MONDAY,Planet.EARTH,Places.BANGLORE);
		Earth rajesh=new Earth(Months.APR,Days.MONDAY,Planet.EARTH,Places.BANGLORE);
		if(earth.equals(rajesh))
			System.out.println("both instance are same");
		else
			System.out.println("both instance are not same");
int name=earth.hashCode();
System.out.println("hashcode of earth is:"+name);
String water= earth.toString();
System.out.println("tostring of earth is:"+water);
int num=rajesh.hashCode();
System.out.println("hashcode of rajesh instance is:"+num);

System.out.println("tostring of rajesh instance is:"+rajesh.toString());
 

	}

}
