package com.xworkz.ticket.runner;

import java.util.Scanner;

import com.xworkz.ticket.dto.BookMyShowDto;
import com.xworkz.ticket.service.BookMyShow;
import com.xworkz.ticket.service.BookMyShowImplimentation;

public class BookMyShowRunner {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the array size:");
	int	arraySize=scanner.nextInt();
	BookMyShowDto book=new BookMyShowDto("Devera","Rajesh@gmail.com" ,9014812209L,"Rajesh","reqiuye32");
	BookMyShow show=new BookMyShowImplimentation();
	show.setArraySize(arraySize);
	System.out.println(show.validateAndSave(book));
	show.read();
	
	}

}
