package co.edu.condition;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		//1. 섭씨, 화씨 -> c = 5/9(F-32)
		Scanner sc = new Scanner(System.in);
		System.out.println("화씨를 입력하십시오. >>> ");
		int f = Integer.parseInt(sc.nextLine());
		double c = (double) 5/9*(f-32);
		System.out.printf("해당 화씨의 섭씨 변환 값은... %.2f입니다.",c);
		
		//2. 가위바위보 scanner, random 가위(0), 바위(1), 보(2) 게임, 승/패 출력 (반복문x)
		
		int ai = (int)(Math.random()*3);
		System.out.println("\n\n가위(0), 바위(1), 보(2) 중 입력하십시오. >>>");
		int user = Integer.parseInt(sc.nextLine());
		
		if (user == 0 && ai == 0) {
			System.out.println("비겼습니다.");
		} else if (user == 0 && ai == 1){
			System.out.println("졌습니다.");
		} else if (user == 0 && ai == 2){
			System.out.println("이겼습니다.");
		} else if (user == 1 && ai == 0){
			System.out.println("이겼습니다.");
		}else if (user == 1 && ai == 1){
			System.out.println("비겼습니다.");
		}else if (user == 1 && ai == 2){
			System.out.println("졌습니다.");
		}else if (user == 2 && ai == 0){
			System.out.println("졌습니다.");
		}else if (user == 2 && ai == 1){
			System.out.println("이겼습니다.");
		}else if (user == 2 && ai == 2){
			System.out.println("비겼습니다.");
		}else {
			System.out.println("잘못된 입력값입니다.");
		}
		
		//3. 학점관리프로그램 - switch문만 사용해서 출력하기
		// 100~90:A, 89~80:B, 79~70:C
		
		System.out.println("\n\n학점을 입력하십시오. >>>");
		int grade = sc.nextInt();
		if((grade/10) >= 10) {
			// 100보다 큰 숫자가 들어올 때 10으로 처리
			grade = 10;
		} else {
			grade /= 10; // grade = grade / 10
		}
		
		switch (grade) {
		case 7:
			System.out.println("당신의 학점은 C입니다.");
			break;
		case 8:
			System.out.println("당신의 학점은 B입니다.");
			break;
		case 9:
		case 10:
			System.out.println("당신의 학점은 A입니다.");
			break;
		}

		
	}

}
