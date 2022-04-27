package com.yedam.java.ch02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 문제 2 두 수를 입력 받아 두 수의 대소 관계 및 사치견산을 수행하는 프로그램을 구현하세요.
		// 메뉴는 아래와 같이 구성합니다.
		// input.숫자입력 |+.더하기| |-.빼기| |*.곱하기||/.나누기||?.대소관계(크고작고같은관계)||exit.종료|

		Scanner sc = new Scanner(System.in);

		boolean run = true;

		int num1 = 0;
		int num2 = 0;
		String menu;
		String cal;

		while (run) {
			// 숫자를 입력하지 않았을때 예외처리

			System.out.println("input.숫자입력 | +.더하기 | -.빼기 | *.곱하기 | /.나누기 | ?.대소관계 | exit.종료 |");
			System.out.println("입력 >>>");

			cal = sc.nextLine();

			switch (cal) {

			case "input":
				System.out.println("첫 번째 숫자를 입력하세요. >>");
				num1 = Integer.parseInt(sc.nextLine());
				System.out.println("두 번째 숫자를 입력하세요. >>");
				num2 = Integer.parseInt(sc.nextLine());
				break;

			case "+":
				if (num1 == 0 && num2 == 0) {
					System.out.println("숫자먼저 입력하세요");
				} else {
					System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
				}
				break;

			case "-":
				if (num1 == 0 && num2 == 0) {
					System.out.println("숫자먼저 입력하세요");
				} else {
				System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
				}
				break;
			case "*":
				if (num1 == 0 && num2 == 0) {
					System.out.println("숫자먼저 입력하세요");
				} else {System.out.println(num1 + "x" + num2 + "=" + (num1 * num2));
				}
				break;
			case "/":
				if (num1 == 0 && num2 == 0) {
					System.out.println("숫자먼저 입력하세요");
				}else {
					System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
				}
				break;
			case "?":
				if (num1 == 0 && num2 == 0) {
					System.out.println("숫자먼저 입력하세요");
				}else {
				if (num1 == num2) {
					System.out.printf("%d값과 %d값은 같습니다.\n", num1, num2);
				} else if (num1 > num2) {
					System.out.printf("%d값이 %d값보다 큽니다.\n", num1, num2);
				} else if (num1 < num2) {
					System.out.printf("%d값이 %d값보다 작습니다.\n", num1, num2);
				} else {
					System.out.print("유효하지 않는 값입니다.\n");
				}}
				break;
			case "exit":
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;

			default:
				System.out.println("잘못된 값입니다.");
				break;
			}
		}

	}

}
