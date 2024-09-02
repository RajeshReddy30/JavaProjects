package com.google.voteridapplication.runner;
import com.google.voteridapplication.things.Student;
public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grades[]= {45,67,88,65};
		Student student=new Student("Rajesh",grades);
		System.out.println("average is:"+student.averageGrade(grades));
		student.highestGrade(grades);
		student.lowestGrade();
	}

}
