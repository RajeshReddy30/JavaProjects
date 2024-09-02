package com.google.voteridapplication.things;

public class Student {
	String name;
	int grades[];
	public Student(String name,int grades[]) {
		this.name=name;
		this.grades=grades;
		System.out.println("Student detais are:  name is:"+this.name);
		for(int index=0;index<grades.length;index++) {
			System.out.println("Grades are:"+this.grades[index]);
		}
	}
	public int averageGrade(int grades[]) {
		
		int average=0;
		int sum=0;
		for(int index=0;index<grades.length;index++) {
		average=(grades[index]+sum)/grades.length;
		}
		return average;
	
	}
	public int highestGrade(int grades[]) {
		int temp=0;
		for(int index=0;index<grades.length;index++) {
			
			if(grades[index]<grades[index++]){
				temp=grades[index++];
				System.out.println("highest grade is:"+grades[index]);
			}
		}
		return temp;
	}
	public int lowestGrade() {
		for(int index=0;index<grades.length;index++) {
			if(grades[index]<2) {
				System.out.println("lowest grade is:"+grades[index]);
			}
		}
		return 0;
	}

}
