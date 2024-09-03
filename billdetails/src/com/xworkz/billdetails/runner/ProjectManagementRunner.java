package com.xworkz.billdetails.runner;

import java.time.LocalDate;
import java.util.Scanner;

import com.xworkz.billdetails.dto.ProjectManagementDto;

public class ProjectManagementRunner {
	public static void main(String[] args) {
		ProjectManagementDto management = new ProjectManagementDto();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the projet name:");
		management.setProjectName(scanner.next());
		System.out.println("enter the client name:");
		management.setClientName(scanner.next());
		System.out.println("enter the project duration:");
		management.setProjectDurationInMonths(scanner.nextInt());
		System.out.println("enter the project budget:");
		management.setProjectBudget(scanner.nextDouble());
		System.out.println("enter the team size:");
		management.setTeamSize(scanner.nextInt());
		System.out.println("enter the project manager name:");
		management.setProjectManager(scanner.next());
	management.setProjectStartDate(LocalDate.now());
	management.setProjectEndDate(LocalDate.MIN);
	management.setProjectCompleted(true);
	}

}
