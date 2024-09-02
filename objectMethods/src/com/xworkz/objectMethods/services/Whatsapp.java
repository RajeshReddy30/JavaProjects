package com.xworkz.objectMethods.services;


public class Whatsapp {
	public String userName;
	public int noOfUsers;
	public boolean isOnline;
	public Whatsapp() {
		this("Rajesh",4895,true);
		System.out.println("no arguments constructor");
	}
	public Whatsapp(String userName, int noOfUsers, boolean isOnline) {
		super();
		this.userName = userName;
		this.noOfUsers = noOfUsers;
		this.isOnline = isOnline;
		System.out.println("userName:"+this.userName);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isOnline ? 1231 : 1237);
		result = prime * result + noOfUsers;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object object) {
		if(object==null || this==null)
			return false;
		if(this==object)
			return true;
		if(!(object instanceof Whatsapp))
			return false;
		Whatsapp whatsapp=(Whatsapp)object;
		if(!this.userName.equals(whatsapp.userName)||this.noOfUsers!=whatsapp.noOfUsers||this.isOnline!=whatsapp.isOnline)
			return false;
		return true;

}
	@Override
	public String toString() {
		return "Whatsapp [userName=" + userName + ", noOfUsers=" + noOfUsers + ", isOnline=" + isOnline + "]";
	}
	public   void setDetails() {
		Whatsapp.getDetails(null, 0);
		System.out.println("method chaining");
	}
	public static void getDetails() {
		System.out.println("method overloading");
	}
	public static void getDetails(String version,int noOfcontacts) {
		System.out.println("version is:"+version);
		System.out.println("No of contacts:"+noOfcontacts);
		
	}
	
	public void setDetails(String password) {
		System.out.println("password"+password);
		
		
		
		

	
	
	}}
