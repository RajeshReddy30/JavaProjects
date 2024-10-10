package com.xworkz.programmingquestions.runner;

public class Game implements Playable,Runnable {

	@Override
	public void runnable() {
		System.out.println("runnable");
		
	}

	@Override
	public void playable() {
		System.out.println("playable");
		
	}
	public static void main(String[] args) {
		Game game=new Game();
		game.playable();
		game.runnable();
	}

}
