package com.xworkz.bank.things;

public class Account  {
	public String accountHolderName;
	public long accountNumber;
	public double accountBalance;
	public Account() {
		System.out.println("Account  default constructor");

}
	public Account(String accountHolderName,long accountNumber,double accountBalance) {
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
		this.accountBalance= accountBalance;
		System.out.println("account holder name is:"+accountHolderName);
		System.out.println("account number is:"+accountNumber);
		System.out.println("account balance:"+accountBalance);
	}}
