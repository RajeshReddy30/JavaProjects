package com.xworkz.bank.things;

public class Bank {
	private String bankName;
	private String accountHolderName;
	private long accountNumber;
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
	public long aadharNumber(long aadharNumber) {
		if(aadharNumber==7075639712l) {
		System.out.println("aadhar number matches");	
		}
		else
		{

		return 0;
}
	public double bank_balance(double bankBalance,String bankName,String accountHolderName) {
		double totalBalance=0;
		double intrest=0;
		double remainingBalance=0;
	if(bankBalance<500) 
		System.out.println("please maintain bank balance");
	else if(bankBalance>500 && bankBalance<10000) {
		intrest=bankBalance*0.1;
		totalBalance=bankBalance+intrest;
		System.out.println("total balance after 10 percent intrest is:"+totalBalance);}
		else if(bankBalance>10000 && bankBalance<50000) {
			intrest=bankBalance*0.2;
			totalBalance=bankBalance+intrest;
			System.out.println("total balance after 20 percent intrest is:"+totalBalance);
		
		}
	if(bankBalance<1000)
		System.out.println("Account balance is low you can't withdraw");
	else if(bankBalance>1000) {
		 remainingBalance=bankBalance-1000;
		System.out.println("remaining balance is:"+remainingBalance);
	}
	return 0;
			}
}