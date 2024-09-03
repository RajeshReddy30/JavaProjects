package com.xworkz.billdetails.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import com.xworkz.billdetails.dto.BillDetailsDto;
import com.xworkz.billdetails.service.BillDetails;

public class BillDetailsRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of bill details to store: ");
		int arraySize = scanner.nextInt();

		BillDetails billService = new BillDetails(arraySize);

		for (int i = 0; i < arraySize; i++) {
			BillDetailsDto bill = new BillDetailsDto();

			System.out.print("Enter the name: ");
			bill.setName(scanner.next());

			System.out.print("Enter the bill type: ");
			bill.setBillType(scanner.next());

			System.out.print("Enter the amount: ");
			bill.setAmount(scanner.nextInt());

			System.out.print("Enter the GST type: ");

			bill.setGstType(scanner.next());

			System.out.print("Enter the GST percentage: ");
			bill.setGstPercentage(scanner.nextDouble());

			bill.setDateTime(LocalDateTime.now());
			bill.setPayDate(LocalDate.now());
			bill.setBillGenerated(true);

			String result = billService.onSave(bill);
			System.out.println(result);
		}

		scanner.close();
	}
}
