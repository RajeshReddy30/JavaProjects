package com.xworkz.oops.service;

public class OnlineShopping {
	public String applicationName;
	public int noofEmployees;
	public boolean isapplicationUse;
	public char grade;
	public long noofUsers;
	public byte appsize;
	public float applicationRating;
	public double applicationDownloads;

	public int hashcode() {
	if(applicationName == null) { 
		return 0;
	}
	else
	{
		return applicationName.hashCode();
	}
	if(isapplicationUse) {
		return 12333;
	}
	else {
		return 34342;
	}
}}
