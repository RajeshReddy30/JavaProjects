package com.xworkz.userdetais.runner;

public class ValidateRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Rajsheldflk";
		char[] ch = str.toCharArray();
		if (str != null && ch.length >= 8 && ch.length <= 16 && Character.isUpperCase(str.charAt(0))
				&& Character.isLowerCase(str.charAt(ch.length - 1)) && Character.isDigit(str.charAt(3)))
		{
			if (ch.length >= 10 &&  Character.isLowerCase(str.charAt(10))) 
				System.out.println("entered password is valid");
		}
			else
				System.out.println("entered password is invalid");

	}

}
