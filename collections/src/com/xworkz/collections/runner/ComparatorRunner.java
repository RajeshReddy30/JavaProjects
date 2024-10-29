package com.xworkz.collections.runner;

import java.util.Comparator;

public class ComparatorRunner {

	public static void main(String[] args) {
		Comparator<String> comp=new  Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				if(o1.equals(o2)) {
					return 0;
				}
				
				return 1;
			}

	};
	
	System.out.println("result 1 is:"+comp.compare("rajesh", "ganesh"));
	Comparator<String> comparator=(String s1,String s2)->s1.equals(s2)?0:1;
	System.out.println("result 2 is:"+comparator.compare("rajesh","ganesh"));
	Compare com=(String s1,String s2)->s1.equals(s2)?true:false;
	System.out.println("result 3 is:"+com.compare("rajesh","rajesh"));
	
	}

	
	

}
