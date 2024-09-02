package com.xworkz.objectMethods.runner;

import com.xworkz.objectMethods.services.ChatGpt;

public class ChatGptRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChatGpt chat=new ChatGpt();
		chat.aiName="open five";
		chat.version="gpt4";
		chat.noofUsers=897098709;
		chat.isWorking=true;
		System.out.println("hashcode"+chat.hashCode());
		System.out.println("hashcode"+chat.equals(chat));
		System.out.println("hashcode"+chat.toString());

	}

}
