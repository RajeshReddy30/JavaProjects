package com.google.voteridapplication.things;

public class SoftwareTrainees {
	String trainees[]=new String[4];
	int index=0;
	public SoftwareTrainees() {
		System.out.println("Software Trainees detais are");
	}
	public String arraySize() {
		return trainees.length;
	}
	public String setDetails(String name) {
		if(this.index<this.arraysize()) {
			trainees[index]=this.name;
			index++;
		}
		return "can't update array";
	}

}
