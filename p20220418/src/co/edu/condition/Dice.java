package co.edu.condition;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		//ctrl+shift+o => scanner import
		Scanner sc = new Scanner(System.in);
		//int num = sc.nextInt();
		//ctrl+shift+f 자동정렬
//		while(true) {
//		int num = (int)(Math.random()*6)+1;
//		//Math.random *10
//		// 0<=x<1(double Type)
//		// (0 ~ x ~ 10)+1
//		// => 1 <= x < 11
//		System.out.println("주사위의 수는 : "+num);
//		
//		if(num ==1) {
//			System.out.println("숫자1");
//		} else if(num == 2) {
//			System.out.println("숫자2");
//		}else if(num == 3) {
//			System.out.println("숫자3");
//		}else if(num == 4) {
//			System.out.println("숫자4");
//		}else if(num == 5) {
//			System.out.println("숫자5");
//		}else {
//			System.out.println("숫자6, 탈출");
//			break;
//		}
		// 학점 측정 프로그램
		int grade;
		System.out.println("성적을 입력하세요.");
		grade = Integer.parseInt(sc.nextLine());
		// 문자열 : "85"-> int : 85로 변환
		
		if (grade >= 90) {
			System.out.println("A학점");
		} else if (grade >= 80) {
			System.out.println("B학점");
		} else if (grade >= 70) {
			System.out.println("C학점");
		} else if (grade >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점, 공부하세요.");
		}
		
		}
	}

