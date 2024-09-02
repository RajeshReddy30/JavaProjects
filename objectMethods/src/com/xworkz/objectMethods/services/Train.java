package com.xworkz.objectMethods.services;

public class Train {
	public String trainName;
	public String from;
	public String to;
	public boolean isAvailable;
	public int trainNumber;
	@Override
	public boolean equals(Object object) {
		if(object==null)
			return false;
		
		Train train=(Train)object;
		if(!this.trainName.equals(train.trainName)|| !this.from.equals(train.from)|| this.to.equals(train.to) || this.isAvailable!=train.isAvailable
				|| this.trainNumber!=train.trainNumber)
			return false;
		return true;

}}
