package com.xworkz.bank.things;

 public class ComputerScienceDepartment extends University {
	public ComputerScienceDepartment() {
		System.out.println("ComputerScienceDepartment no argument constructor");
	}
    @Override
    public void conductExams() { 
    	System.out.println("Computer Science Department conducts exams"); }
    @Override
    public void hostConvocation() { 
    	System.out.println("Computer Science Department hosts convocation"); }
    @Override
    public void provideLibrary() { 
    	System.out.println("Computer Science Department provides library"); }
    @Override
    public void arrangeSports() { 
    	System.out.println("Computer Science Department arranges sports"); }
    @Override
    public void offerScholarships() {
    	System.out.println("Computer Science Department offers scholarships"); }
    @Override
    public void manageHostels() {
    	System.out.println("Computer Science Department manages hostels"); }
    @Override
    public void conductSeminars() { 
    	System.out.println("Computer Science Department conducts seminars"); }
    @Override
    public void offerCourses() {
    	System.out.println("Computer Science Department offers courses"); }
    @Override
    public void provideLaboratories() { 
    	System.out.println("Computer Science Department provides laboratories"); }
    @Override
    public void maintainCampus() {
    	System.out.println("Computer Science Department maintains campus"); }
}

