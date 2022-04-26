package com.yedam.java.homework1;

import java.util.Scanner;

public class GameExe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int random = (int) (Math.random() * 2);

		RPGgame r_game = null;
		ArcadeGame a_game = null;
		
		if (random == 0) {
			a_game = new ArcadeGame();
		} else if (random == 1) {
			r_game = new RPGgame();
			
		} else {
			System.out.println("유효하지 않는 값입니다.");
		}

		while (true) {
			System.out.println(
					"============================================================================================");
			System.out
					.println("1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT ");
			System.out.println(
					"============================================================================================");

			System.out.println("choice>>> ");
			int choice = Integer.parseInt(sc.nextLine());
			if (random == 0 && choice == 1) {
				a_game.leftUpButton();
			} else if (random == 0 && choice == 2) {
				a_game.leftDownButton();
			} else if (random == 0 && choice == 3) {
				a_game.rightUpButton();
			} else if (random == 0 && choice == 4) {
				a_game.rightDownButton();
			} else if (random == 0 && choice == 5) {
				a_game.changeMode();
			} else if (random == 0 && choice == 0) {
				random = 1;
				System.out.println("RPGgame 실행");
			} else if (random == 0 && choice == 9) {
				System.out.println("EXIT");
				break;
			} //else {
				//System.out.println("잘못된 값을 입력하셨습니다.");
			//} // 예외처리까지 같이 출력되서 어떻게 하면 좋을지 모르겠음...

			if (random == 1 && choice == 1) {
				r_game.leftUpButton();
			} else if (random == 1 && choice == 2) {
				r_game.leftDownButton();
			} else if (random == 1 && choice == 3) {
				r_game.rightUpButton();
			} else if (random == 1 && choice == 4) {
				r_game.rightDownButton();
			} else if (random == 1 && choice == 5) {
				r_game.changeMode();
			} else if (random == 1 && choice == 0) {
				random = 0;
				System.out.println("ArcadeGame 실행");
			} else if (random == 1 && choice == 9) {
				System.out.println("EXIT");
				break;
			}// else {
				//System.out.println("잘못된 값을 입력하셨습니다.");
			//}
		}

	}
}
