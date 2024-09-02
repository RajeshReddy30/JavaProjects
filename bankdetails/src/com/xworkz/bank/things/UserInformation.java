package com.xworkz.bank.things;

public class UserInformation extends Account {
	public int noofUserAccounts;
	public UserInformation() {
		super();
		System.out.println("UserInformation constructor");	
	}
	public UserInformation(int noofUserAccounts) {
		
		this.noofUserAccounts=noofUserAccounts;
		System.out.println("number of user accounts is:"+noofUserAccounts);
		

}

}
