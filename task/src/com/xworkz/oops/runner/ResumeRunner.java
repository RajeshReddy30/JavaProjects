package com.xworkz.oops.runner;

import com.xworkz.oops.service.RajeshResume;
import com.xworkz.oops.service.Resume;

public class ResumeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resume resume=new RajeshResume();
		resume.addResumeDetails();
		resume.addpersonalDetails();
		resume.educationDetails();
		resume.projectDetails();
		resume.hobbieDetails();
		resume.technicalDetails();
	}

}
