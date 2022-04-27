package com.yedam.java.ch01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 2,3,5입력받았을 경우 2+3=5를 출력하세요.

		System.out.println("첫 번째 값 입력>>>");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("두 번째 값 입력>>>");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("세 번째 값 입력>>>");
		int num3 = Integer.parseInt(sc.nextLine());

		if (num1 + num2 == num3) {
			System.out.printf("%d + %d = %d\n", num1, num2, num3);

		} else if (num1 - num2 == num3) {
			System.out.printf("%d - %d = %d\n", num1, num2, num3);

		} else if (num1 * num2 == num3) {
			System.out.printf("%d * %d = %d\n", num1, num2, num3);

		} else if (num1 / num2 == num3) {
			System.out.printf("%d / %d = %d\n", num1, num2, num3);

		} else {
			System.out.println("계산할 수 없는 값입니다.");
		}

	}

}
