package com.xworkz.programmingquestions.runner;

public class StringOperations {
	//sum of number in string
	public static void sumOfNumber(String str) {
	int sum=0;
	for(int i=0;i<str.length();i++) {
		if(Character.isDigit(str.charAt(i)))
			sum=sum+Character.getNumericValue(str.charAt(i));
	}
	System.out.println("sum of number in a string is:"+sum);
	
	}
	//removing characters except alphabets
public static void removingCharacters(String s) {
    s=s.replaceAll("[^a-zA-Z]","");
    System.out.println("alphabets except characters:"+s);	
	}
public static void toggleString(String st) {

	 String str = "";
	 for (int i = 0; i < st.length(); i++) {
		if(Character.isUpperCase(st.charAt(i))) 
			 str=str+Character.toLowerCase(st.charAt(i));
		else 
			 str=str+Character.toUpperCase(st.charAt(i));
	}
	System.out.println("Toggle String is : "+str);
	 
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringOperations.sumOfNumber("234wsefsa3223as");
		StringOperations.removingCharacters("hel1456lo56wor%ld");
		StringOperations.toggleString("nmJLNnMj"); 
	   }
	
	}


