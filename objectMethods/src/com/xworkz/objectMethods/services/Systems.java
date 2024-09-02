package com.xworkz.objectMethods.services;

public class Systems {
	public String name;
    public int version;
    public boolean is64Bit;
    public double clockSpeed;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(clockSpeed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (is64Bit ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + version;
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
		Systems other = (Systems) obj;
		if (Double.doubleToLongBits(clockSpeed) != Double.doubleToLongBits(other.clockSpeed))
			return false;
		if (is64Bit != other.is64Bit)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (version != other.version)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "System [name=" + name + ", version=" + version + ", is64Bit=" + is64Bit + ", clockSpeed=" + clockSpeed
				+ "]";
	}
}
    

    

   
