package com.xworkz.objectMethods.runner;

import com.xworkz.objectMethods.services.Rapido;

public class RapidoRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rapido rapido=new Rapido();
		Rapido Rajesh=new Rapido();
		rapido.userName="Rajesh";
		rapido.password="hfdjrhw";
		rapido.noofusers=3241;
		rapido.isavailable=true;
		
		Rajesh.userName="Rajesh";
		Rajesh.password="hfdjrhw";
		Rajesh.noofusers=3241;
		Rajesh.isavailable=true;
		
		System.out.println("hashcode"+rapido.hashCode());
		System.out.println("hashcode"+rapido.equals(Rajesh));
		System.out.println("hashcode"+rapido);
		

	}

}
