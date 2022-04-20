package co.edu.array;

import java.util.Scanner;

public class AraayExam5 {

	public static void main(String[] args) {
		// 향상된 for문
		// 참조 타입(String) 배열 생성

//		String[] strAry = { "김", "이", "박", "최" };
//		// for문 생성시 배열데이터타입과 생성하는 데이터타입이 동일해야한다.
//		for (String name : strAry) {
//			System.out.printf("%s ", name); // 향상된 for문을 이용해서 각각의 배열 요소를 출력
//		}
//		System.out.println();

		// 혼공자 p.201 6번 연습문제 - 학생들의 점수를 입력받아, 최고 점수 및 평균 점수 구하기
		Scanner sc = new Scanner(System.in);

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;

		while (run) {
			// 1.학생수 : 배열크기설정, 2.점수입력 : 배열데이터입력, 3.점수리스트 : 배열데이터 출력
			// 4.분석 : 최대값, 평균 구하기, 5.종료 : 반복문 종료
			System.out.println("==================================================");
			System.out.println(" 1.학생수 | 2.점수입력 | 3. 점수리스트 | 4.분석 | 5.종료");
			System.out.println("==================================================");
			System.out.println("선택 >>>");

			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				System.out.println("학생 수를 입력하십시오. >>>");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
				System.out.printf("%d명 입력되었습니다.\n", studentNum);
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("학생 점수를 입력하십시오. >>>");
					scores[i] = Integer.parseInt(sc.nextLine());
					System.out.println(scores[i] + "점이 등록되었습니다.");
				}

			} else if (selectNo == 3) {
				for (int score : scores) {
					System.out.println("등록된 학생 점수 : " + score);
				}
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				for (int i = 0; i < scores.length; i++) {
					max = max < scores[i] ? scores[i] : max;
					// if (max < scores[i]) {
					// max = scores[i];
					// }
					sum += scores[i];
				}
				System.out.println("학생들의 최고 점수는 " + max + "점 입니다.");
				System.out.printf("학생들의 평균 점수는 %.2f 점입니다.\n", (double) sum / scores.length);
			} else if (selectNo == 5) {
				run = false;
			} else {
				System.out.println("잘못된 입력값입니다. 다시 입력하세요.");
			}

		}
		System.out.println("프로그램을 종료합니다.");
	}
}
