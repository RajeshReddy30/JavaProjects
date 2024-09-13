package com.xworkz.programmingquestions.runner;

import java.nio.charset.StandardCharsets;

public class StringRunner {

	public static void main(String[] args) {
		// String()
		String developer = new String();
		// String(byte[] bytes)
		byte[] bytesArray = { 45, 34, 42, 36 };
		String values = new String(bytesArray);
		System.out.println("byte to string:" + values);
		// String(byte[] bytes,charsets)
		byte[] bytes = { 72, 101, 108, 108, 111 };
		String value = new String(bytes, StandardCharsets.UTF_16BE);
		System.out.println("byte to string with specific charset:" + value);
		// String(byte[] ascii,int hibit)
		byte[] ascii = { 65, 66, 67 };

		@SuppressWarnings("deprecation")
		String deprecatedString = new String(ascii, 1);

		System.out.println("Resulting String : " + deprecatedString);
		// String(byte[] bytes,int offset,int length)
		byte[] asci = { 65, 66, 69, 45, 5, 66, 54, 39 };
		String offset = new String(asci, 2, 4);
		System.out.println("byte to string with start index to specified length:" + offset);
		// String(byte[] bytes,int offset,int length,charsetName)
//		byte[] asc = { 65, 66, 69, 45, 5, 66, 54, 39 };
//		String offsetValue = new String(asc, 2, 4,"UTF_16BE");
//		System.out.println("byte to string with start index to specified length:" + offsetValue);
		// String(byte[] bytes,int offset,int length,charset)
				byte[] asciii = { 65, 66, 69, 45, 5, 66, 54, 39 };
				String offsets = new String(asci, 2, 4, StandardCharsets.UTF_16BE);
				System.out.println("byte to string with start index to specified length and charset:" + offsets);
				//String(char[] value)
				char[] chars = {'H', 'e', 'l', 'l', 'o'};
		        String str = new String(chars);
		        System.out.println("char to string:"+str);
		        //String(char[] values,int offset,int count)
		        char[] cha = {'H', 'e', 'l', 'l', 'o'};
		        String st = new String(cha, 1, 4); 
		        System.out.println(st);
		        //String(String original)
		        String original = "Hello";
		        String copy = new String(original);
		        System.out.println(copy);
		        //
		        StringBuffer buffer = new StringBuffer("Hello World");
		        String string = new String(buffer);
		        System.out.println(string);
	}

}
