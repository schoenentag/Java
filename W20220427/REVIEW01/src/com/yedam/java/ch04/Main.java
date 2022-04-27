package com.yedam.java.ch04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 입력한 수만큼 주사위(1~6)를 굴려서 나온 수들 중
		// 1.최고 수 2. 최저 수, 3. 수들의 합을 구하는 프로그램 구현
		Scanner sc = new Scanner(System.in);

		int[] arr = null; // null로 초기화

		System.out.println("주사위를 굴릴 횟 수를 입력하세요. >>>"); // 입력한 수만큼 주사위 1~6 굴리기
		int num = sc.nextInt();
		arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 6) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// 해당 숫자들로 최대값 구하기
		int max = arr[0];
		int min = arr[0];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("최대값 : " + max);
		// 해당 숫자들로 최소값 구하기
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("최소값 : " + min);
		// 해당 숫자들로 합계 구하기
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("합계 : " + sum);


	}

}
