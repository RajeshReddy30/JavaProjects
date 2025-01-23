package com.xworkz.project.admin;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import lombok.Data;

@Data
@Entity
@NamedQuery(name = "authenticate", query = "SELECT e FROM AdminEntity e WHERE e.email = :email AND e.password = :password")

public class AdminEntity {
	@Id
	private int id;
	private String name;
	private String email;
	private String password;


}
