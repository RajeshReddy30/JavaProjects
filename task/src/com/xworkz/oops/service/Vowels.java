package com.xworkz.oops.service;

public class Vowels{
public  void vowels(){
	int vowelscount=0;
	int constantcount=0;
	
String name[]={"r","a","j","e","s","h"};
String vowels[]={"a","e","i","o","u"};
for(int index=0;index<name.length;index++){
for(int i=0;i<vowels.length;i++){
if(name[index]==vowels[i]){
System.out.println("matched vowels are:"+name[index]);
vowelscount++;
}else 
constantcount++;

}
System.out.println("Vowels count is:"+vowelscount);
System.out.println("constant count is:"+constantcount);
}}}
