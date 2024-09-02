package com.xworkz.objectMethods.runner;

import com.xworkz.objectMethods.services.Laptop;
import com.xworkz.objectMethods.services.Tech;

public class TechRunner {

	
	    public static void main(String[] args) {
	        
	        Tech myTech = new Laptop();  
	        myTech.displayInfo();  

	        
	        if (myTech instanceof Laptop) { 
	            Laptop myLaptop = (Laptop) myTech; 
	            myLaptop.showSpecs(); 
	        } else {
	            System.out.println("Downcasting not possible.");
	        }
	        }
	}

