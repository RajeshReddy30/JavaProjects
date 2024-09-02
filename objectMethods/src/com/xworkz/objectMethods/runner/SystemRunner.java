package com.xworkz.objectMethods.runner;

import com.xworkz.objectMethods.services.Systems;

public class SystemRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Systems system=new Systems();
		Systems name=new Systems();
		system.name="lenovo";
		system.version=14;
		system.is64Bit=true;
		system.clockSpeed=4324.45;
		
		name.name="lenovo";
		name.version=14;
		name.is64Bit=true;
		name.clockSpeed=4324.45;
		System.out.println("hashcode"+system.hashCode());
		System.out.println("hashcode"+system.equals(name));
		System.out.println("hashcode"+system.toString());

	}

}
