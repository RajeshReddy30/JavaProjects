package com.xworkz.oops.service;

public class Ecommerce {
	public String applicationName;
	public int noofEmployees;
	public boolean isapplicationUse;
	public char grade;
	public long noofUsers;
	public byte appsize;
	public float applicationRating;
	public double applicationDownloads;
	@Override
	public int hashCode() {
		
		int result = 1;
		
		result = (int)(23* result + applicationDownloads);
		result = 23 * result + ((applicationName == null) ? 0 : applicationName.hashCode());
		result = (int)(23* result + noofUsers);
		result = 23* result + appsize;
		result = 23* result + grade;
		result = 23* result + (isapplicationUse ? 1222 : 12354);
	result = 23 * result + noofEmployees;
		result = (int)(23* result + applicationRating);
		return result;
	}
	
	

}
