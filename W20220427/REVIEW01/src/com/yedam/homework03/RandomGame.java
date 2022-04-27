package com.yedam.homework03;

import java.util.Scanner;

public class RandomGame {
	public static Keypad gameMode() {

		Keypad game = null;

		int random = (int) (Math.random() * 2);

		switch (random) { // 50%확률로 두 개의 게임 중 하나만 실행
		case 0:
			game = new RPGgame();
			break;
		case 1:
			game = new ArcadeGame();
			break;
		}

		return game;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Keypad game = gameMode();

		boolean run = true;

		while (run) {
			System.out.println(
					"============================================================================================");
			System.out
					.println("1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT ");
			System.out.println(
					"============================================================================================");
			System.out.println("choice>>> ");
			int choice = Integer.parseInt(sc.nextLine());

			switch (choice) {
			case 1:
				game.leftUpButton();
				break;
			case 2:
				game.leftDownButton();
				break;
			case 3:
				game.rightUpButton();
				break;
			case 4:
				game.rightDownButton();
				break;
			case 5:
				game.changeMode();
				break;
			case 0:
				game = gameMode(); // 랜덤으로 뜨지 않을까..?
				
				break;
			case 9:
				run = false;
				System.out.println("게임을 종료합니다.");
				break;

			default:
				System.out.println("유효하지 않는 값입니다.");
			}

		}

	}

}
