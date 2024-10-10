package com.xworkz.oops.runner;

public class TestRunner {
	public String listOfCaptains[]= {"rajesh","ganesh"};
	public String listOfPlayers[]= {"sashi"};
	boolean arrayEquals;
	public void compareArrays() {
		
		for(int i=0;i<listOfCaptains.length;i++) {
			for(int j=0;j<listOfPlayers.length;j++) {
				if(listOfCaptains[i].equals(listOfPlayers[j])) {
					arrayEquals=true;
				}
			}
		}
		if(arrayEquals) {
			System.out.println("arrays are equal");
		}else {
			System.out.println("arrays are not equal");
		}
	}
	public static void main(String[] args) {
		TestRunner test=new TestRunner();
		test.compareArrays();
		
	}

}
