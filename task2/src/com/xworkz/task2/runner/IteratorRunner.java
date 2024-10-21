package com.xworkz.task2.runner;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorRunner {
	public static void main(String[] args) {
		
	
	List<String> list=new LinkedList<String>();
	list.add("hello");
	Iterator<String> iterator= list.iterator();
	System.out.println(iterator.hasNext());
}
}