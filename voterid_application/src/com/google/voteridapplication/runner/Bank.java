package com;

public class Bank {
	String bankName;
	String accountHolderName;
	long accountNumber;
	public void setBankName(String bankName) {
		this.bankName=bankName;
		
	}
	public void setaccountHolderName(String accountHolderName) {
		this.accountHolderName=accountHolderName;
		
	}
	public void setaccountNumber(long accountNumber) {
		this.accountNumber=accountNumber;
		
	}
	public String getBankName() {
		return this.bankName;
		
	}
	public String getaccountHolderName() {
		return this.accountHolderName;
		
	}
	public long getaccountNumber() {
		return this.accountNumber;
		
	}
}
