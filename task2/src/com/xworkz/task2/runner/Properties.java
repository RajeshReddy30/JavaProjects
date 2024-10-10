package com.xworkz.task2.runner;

public class Properties implements Cloneable{
	public String name;
	public int price;
	@Override
public Properties Clone() throws CloneNotSupportedException {
	return (Properties) super.clone() ;
	
}

@Override
public String toString() {
	return "Properties [name=" + name + ", price=" + price + "]";
}
}
