package com.xworkz.bank.things;

public class Banks extends Object{
	public String bankName;
	public String location;
	public String branchName;
	public int noofEmployes;
	public Banks() {
		System.out.println("Bank constructor");

}
	public Banks(String bankName,String location,String branchName,int noofEmployes) {
		this.bankName=bankName;
		this.location=location;
		this.branchName=branchName;
		this.noofEmployes=noofEmployes;
		
	}
	
	public String toString() {
		return "Bank:["+"bankName:"+this.bankName+","+"location:"+this.location+","+"branchName:"+this.branchName+","+"noofEmployes:"+this.noofEmployes+"]";
}}