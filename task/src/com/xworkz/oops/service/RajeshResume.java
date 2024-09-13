package com.xworkz.oops.service;

public class RajeshResume implements Resume {

	@Override
	public void addResumeDetails() {
		// TODO Auto-generated method stub
		System.out.println("Resume details");
	}

	@Override
	public void addpersonalDetails() {
		// TODO Auto-generated method stub
		String name="rajesh";
		System.out.println("personal details:"+name+" "+"contact number: "+Resume.contactNo+" "+"email: "+Resume.email);
		
	}

	@Override
	public void projectDetails() {
		// TODO Auto-generated method stub
		String projectName="Plant Disease prediction with CNN model";
		System.out.println("project details");
		System.out.println("project name:"+projectName);
	}

	@Override
	public void hobbieDetails() {
		// TODO Auto-generated method stub
		System.out.println("hobbie details");
	}

	@Override
	public void educationDetails() {
		// TODO Auto-generated method stub
		System.out.println("education details");
	}

	@Override
	public void technicalDetails() {
		// TODO Auto-generated method stub
		System.out.println("technical details");
	}

}
