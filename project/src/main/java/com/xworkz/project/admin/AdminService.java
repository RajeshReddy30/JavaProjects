package com.xworkz.project.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class AdminService {
	@Autowired
	private AdminRepo repo;

	public boolean findByEmailAndPassword(String email, String password) {
		if (email != null && password != null) {
			if (repo.findByEmailAndPassword(email, password) != null) {
				return true;
			}

		}

		return false;

	}

}
