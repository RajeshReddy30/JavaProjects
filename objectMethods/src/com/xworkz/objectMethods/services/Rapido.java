package com.xworkz.objectMethods.services;

public class Rapido {
	public String userName;
	public String password;
	public int noofusers;
	public boolean isavailable;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isavailable ? 1231 : 1237);
		result = prime * result + noofusers;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rapido other = (Rapido) obj;
		if (isavailable != other.isavailable)
			return false;
		if (noofusers != other.noofusers)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Rapido [userName=" + userName + ", password=" + password + ", noofusers=" + noofusers + ", isavailable="
				+ isavailable + "]";
	}
	

}
