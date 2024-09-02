package com;
import com.google.voteridapplication.runner.Bank;
public class BankRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new Bank();
		bank.setBankName("SBI");
		bank.setaccountHolderName("Rajesh");
		bank.setaccountNumber(3973234428L);
		if(bank.getaccountNumber()==3973234428L) {
			System.out.println("Account holder name is:"+getaccountHolderName());
		}}}
	


