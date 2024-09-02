package com.xworkz.objectMethods.services;

public class ChatGpt {
	public String aiName;
	public String version;
	public int noofUsers;
	public boolean isWorking;
	@Override
	public int hashCode() {
		final int prime = 23;
		int result = 1;
		result = prime * result + ((aiName == null) ? 0 : aiName.hashCode());
		result = prime * result + (isWorking ? 1231 : 1237);
		result = prime * result + noofUsers;
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null)
			return false;
		ChatGpt other = (ChatGpt) obj;
		if (aiName == null) {
			if (other.aiName != null)
				return false;
		} else if (!aiName.equals(other.aiName))
			return false;
		if (isWorking != other.isWorking)
			return false;
		if (noofUsers != other.noofUsers)
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ChatGpt: [aiName=" + aiName + ", version=" + version + ", noofUsers=" + noofUsers + ", isWorking="
				+ isWorking + "]";
	}
	

}
