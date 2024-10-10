import java.util.Scanner;

public class CheckNumberOrNot {
	
	public static void main(String[] args) {
		boolean isNumber=false;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the input:");
		String input=scanner.nextLine();
		char[] ch= input.toCharArray();
		for(char c:ch) {
			if(Character.isDigit(c)) 
				isNumber=true;
		

		}if(isNumber)
			System.out.println("user input contains number");
		else
			System.out.println("user input not contains number");

}}
