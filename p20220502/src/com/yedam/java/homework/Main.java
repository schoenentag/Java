package com.yedam.java.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String answer = null;
		boolean run = true;
		// 1. 배열 만들기 => ArrayList 이용
		List<String> list = new ArrayList<String>();
		list.add("Orange");
		list.add("Game");
		list.add("Phone");
		list.add("Smart");
		//list = list.toLowerCase(); 소문자바꾸기... ERROR

		// int size = list.size(); // 리스트안에 있는 값의 갯수 : 4개 OK!

		// 프로그램이 실행되면 문제는 Orange, Game, Phone, Smart 중 하나가 랜덤으로 선정
		int random = (int) (Math.random() * 4);
		// System.out.println(random);
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			// 만약에 랜덤값이 list의 인덱스값과 같다면 그 문자열을 새로운 변수에 담는다.
			// System.out.println(i);
			if (i == random) {
				answer = list.get(i);
				// System.out.println(list.get(i));
				// System.out.println("if문 안의 answer : " + answer); // answer에 들어간것 확인
			}
			System.out.println(answer); //answer에 들어간것 확인
		} // for문 끝

		while (run) {

			System.out.println("------------------------------------------------");
			System.out.println(" 1.문자하나 | 2.단어 | 3.입력내역 | 4.새 게임 | 5.종료 ");
			System.out.println("------------------------------------------------");

			Scanner sc = new Scanner(System.in);
			int menu = Integer.parseInt(sc.nextLine()); // 사용자가 입력하는 메뉴
			switch (menu) {
			case 1:
				List<String> inputArr = new ArrayList<String>(); // 배열 인덱스 0,1,2,3,4
				
//				1) 문자 하나를 입력하여 문제를 구성하는 문자가 맞는 지 확인합니다.
//			    2) 순서와 상관없이 문제를 구성하는 모든 문자가 입력되면 더이상 입력할 수 없습니다.
				System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
				//System.out.println(inputArr);// 입력된 값과 random값이 일치할 경우 표기

				System.out.println("입력값 >>");
				String input = sc.nextLine();
				
				if (answer.indexOf(input) != -1) {
				inputArr.add(input);
				System.out.println("문자열을 구성하는 문자입니다.");
				if (input.length() == answer.length()) {
					System.out.println("문자열을 구성하는 문자를 다 입력하셨습니다.");
				}else {
					System.out.println("문자열을 구성하는 문자가 아닙니다.");};

					// true : 문자열을 구성하는 문자입니다.
					// false : 문자열을 구성하는 문자가 아닙니다.
					// 모두 입력되면 : 문자열을 구성하는 문자를 다 입력하셨습니다.
					// 만약 answer에 저장된 값이면 inputArr로 들어감
				}
				break;

			case 2:
//				1) 단어를 입력하여 문제를 구성하는 문자가 순서에 맞게 입력되었는 지 확인합니다.
//			    2) 단어의 길이와 문제의 길이가 다를 경우 안내 메세지를 출력합니다.

				break;

			case 3:
//				1) 현재까지 맞게 입력한 문자들을 출력합니다.

				break;

			case 4:
				// 새 문제를 선정하고 입력된 내역을 초기화합니다.

			case 5:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;

			default:
				System.out.println("유효하지 않는 값입니다.");
				break;
			}

		} // while문 끝
	}

}
