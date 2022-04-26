package com.yedam.java.homework1;

public class Main {

	public static void main(String[] args) {
		RPGgame game = new RPGgame();
		game.leftUpButton();
		game.rightUpButton();
		game.changeMode();
		game.modeInfo();
		game.rightUpButton();
		game.rightDownButton();
		game.leftDownButton();
		game.changeMode();
		game.modeInfo();
		game.rightDownButton();
		
		System.out.println("======================");
		ArcadeGame game2 = new ArcadeGame();
		game2.leftUpButton();
		game2.rightUpButton();
		game2.leftDownButton();
		game2.changeMode();
		game2.modeInfo();
		game2.rightUpButton();
		game2.leftUpButton();
		game2.rightDownButton();
		
	}

}
