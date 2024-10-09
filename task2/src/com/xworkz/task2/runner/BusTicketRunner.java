package com.xworkz.task2.runner;

import java.util.Scanner;

public class BusTicketRunner {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter from");
			String from = scanner.nextLine();

			System.out.print("Enter destination");
			String destination = scanner.nextLine();

			System.out.print("Enter price ");
			double price = scanner.nextDouble();

			BusTicketDto busTicket = new BusTicketDto(from, destination, price);

			validateBusTicket(busTicket);

			System.out.println("Bus ticket is valid.");

		} catch (DestinationLengthException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (PriceException e) {
			System.out.println("Price Error: " + e.getMessage());
			;
		} finally {
			System.out.println("Validation process completed.");
		}
	}

	public static void validateBusTicket(BusTicketDto busTicket) throws DestinationLengthException, PriceException {

		if (busTicket.getDestination() == null || busTicket.getDestination().length() < 3
				|| busTicket.getDestination().length() > 50) {
			throw new DestinationLengthException("Destination length must be between 3 and 50 characters");
		}

		if (busTicket.getPrice() <= 0) {
			throw new PriceException("Price must be greater than 0");
		}
	}
}
