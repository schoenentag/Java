package co.edu.loop;

import java.util.Scanner;

public class Exam2_re {

	public static void main(String[] args) {
		// 1. 최소, 최대값 구하기, input 3개 받아 반복문 이용
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하십시오. >>>");
		int first = sc.nextInt();
		System.out.println("값을 입력하십시오. >>>");
		int second = sc.nextInt();
		System.out.println("값을 입력하십시오. >>>");
		int third = sc.nextInt();
		int min, max;
		
		max = first;
		min = first;
		if (max <second) {
			max = second;
		}
		if (max < third) {
			max = third;
		}
		
		if (min > second) {
			min = second;
		}
		if (min > third) {
			min = third;
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
				
		// 2. 두 주사위를 던졌을 때 주사위 합이 6인 데이터 출력, random 데이터 2개 => 합 6
		for (int i = 1; i <= 100; i++) {
			int randomValue = (int)(Math.random()*6)+1;
			int randomValue2 = (int)(Math.random()*6)+1;
		if (randomValue+randomValue2 == 6) {
			System.out.printf("random값 %d와 %d가 나왔습니다!\n",randomValue, randomValue2);
			break;
		}
		}
		// 3. 피보나치 수열(while(value < 50)), 1,2,3,5,8,13...
		int num1 = 1;
		int num2 = 2;
		int num3 = 0;
		while (true) {
			num3 = num1 + num2;
			if(num3>50)
				break;
			System.out.println(num1 +","+num2+"="+num3);
			num1 = num2;
			num2 = num3;
		}
		}
}

	
	