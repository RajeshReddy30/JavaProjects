package com.xworkz.bank.runner;
import com.xworkz.bank.things.Bank;
public class BankRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new Bank();
		bank.setBankName("SBI");
		bank.setaccountHolderName("Rajesh");
		bank.setaccountNumber(3973234428L);
		if(bank.getaccountNumber()==3973234428L) {
			System.out.println("Account holder name is:"+bank.getaccountHolderName());
			System.out.println("Bank name is:"+bank.getBankName());
		}
		else{
		System.out.println("account number is less than or greater than 10 digits");	
		}
		bank.aadharNumber(69853986398L);
		bank.bank_balance(47328,"SBI","Rajesh");
	
	}
		}
