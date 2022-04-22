package co.edu.array;

import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		// 배열 : 같은 데이터 타입을 연속된 공간에 저장
		// int타입(정수) 배열, 5개의 데이터를 넣을 수 있는 공간
		int[] ary = new int[5];

		// 1) 데이터 저장 하는 방법
		ary[0] = 1;
		ary[1] = 2;
		ary[2] = 3;
		ary[3] = 4;
		ary[4] = 5;

		// 2) 데이터 저장 하는 방법
		int[] ary1 = { 1, 2, 3, 4, 5 };

		// 1. 배열 만들고, Scanner 통해서 데이터를 넣는 프로그램
		Scanner sc = new Scanner(System.in);
		int[] ary2 = new int[5]; // 공간 5개인 정수형 타입 배열 생성
		// 반복문을 이용해 배열에 데이터 저장
//		for (int i = 0; i < ary2.length; i++) {
//			System.out.println("데이터를 입력하세요.");
//			ary2[i] = sc.nextInt(); // 반복문을 통해 ary2[0],ary[1]...번째에 input
//			System.out.printf("데이터 %d(이)가 저장되었습니다.\n",ary2[i]);
//		}

		for (int i = 0; i < ary2.length; i++) {
			System.out.println("점수를 입력하세요. >>>");
			ary2[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < ary2.length; i++) {
			sum += ary2[i]; // sum = sum +ary2[i]
		}
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f\n",(double)(sum/ary2.length)); 
		System.out.println("평균 : " + (double) (sum / ary2.length));

		// 1~100까지 합을 구하는 방법
		int[] ary3 = new int[100];
		for (int i = 0; i < ary3.length; i++) {
			ary3[i] = i + 1; // 변수 i를 이용해서 데이터를 저장함
		}
		sum = 0; // 0으로 초기화
		for (int i = 0; i < ary3.length; i++) {
			sum += ary3[i]; // sum에 배열 0~99번째까지 데이터 누적
		}
		System.out.println("1~100까지의 합계 : " + sum);

		sum = 0;
		for (int i = 0; i < ary3.length; i++) {
			// 100번째 배열자리에 1~99 더한 값을 저장
			if (i == 99) {
				ary3[i] = sum;
				break;
			}
			sum += ary3[i];
		}
		System.out.println("0~99까지의 합계 : " + ary3[99]);
		// System.out.println(ary3[100]); // ERROR 인덱스 100번째값이 없음.
		// 0~99(100개)배열의 공간을 나타낼 때 인덱스 값
		// ※ 처음 생성시 new int[100] 100개의 공간을 만듦, 0~99번째 공간까지 생성되었으므로 ary3[100]은 없음
	}

}
