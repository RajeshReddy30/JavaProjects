package com.xworkz.objectMethods.runner;

import com.xworkz.objectMethods.services.Train;

public class TrainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Train bE=new Train();
		Train mE=new Train();
		bE.trainName="RS Express";
		bE.from="Banglore";
		bE.to="Chennai";
		bE.isAvailable=true;
		bE.trainNumber=9798;
		mE.trainName="RS Express";
		mE.from="Banglore";
		mE.to="Chennai";
		mE.isAvailable=true;
		mE.trainNumber=9798;
		if(bE.equals(mE)) {
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}

	}

}
