package com.yedam.java.homework;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		// 1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int) (Math.random() * 100) + 1;

		// 시도횟수를 세기 위한 변수
		int count = 0;

		do {
			try {
				count++;	
				Scanner sc = new Scanner(System.in); // 사용자입력을 저장할 공간
				System.out.print("1과 100사이의 값을 입력하세요 :");
				int input = sc.nextInt();
				System.out.println(input);
				System.out.println(answer);
				if (input > answer) {
					System.out.println("더 작은 수를 입력하세요.");
				} else if (input < answer) {
					System.out.println("더 큰 수를 입력하세요");
				} else if (input == answer) {
					System.out.println("맞췄습니다.");
					System.out.println("시도한 횟수는 " + count + "입니다.");
					break;
				}
			}
			catch (Exception e) {
				System.out.println("유효하지 않는 값입니다. 다시 값을 입력하세요.");
				}
			} while (true);
	

}
}
