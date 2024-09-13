package com.xworkz.programmingquestions.runner;

public class NumberPrograms {
	public static void main(String[] args) {
		NumberPrograms.replace0To1(67090120);
		NumberPrograms.noOfDaysMonth(2,2023);
	}

// replace all 0's with 1 in a given integer
	public static void replace0To1(int number) {

		String str = Integer.toString(number);
		String str1 = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0')
				str1 = str1 + '1';
			else
				str1 = str1 + str.charAt(i);
		}
		System.out.println("Converted number is: " + str1);

	}
	//count the number of days in a month
	public static void noOfDaysMonth(int month,int year) {
		if((month==2) && ((year%4==0) || ((year%100!=0)&&(year%400==0))))
            System.out.println("Number of days is 29");

        else if(month==2)
            System.out.println("Number of days is 28");

        else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
            System.out.println("Number of days is 31");

        else
            System.out.println("Number of days is 30");


    }
	}


