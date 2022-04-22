package co.edu.array;

import java.util.Scanner;

public class ArrayExam2 {

	public static void main(String[] args) {
		// 배열을 이용한 최대값, 최소값 찾기 (뭔가 버블정렬하는 느낌...)
		int[] ary1 = { 5, 10, 4, 7, 8 };

		int max = 0; // 최대값 변수
		int min = ary1[0]; // 최소값 변수

		for (int i = 0; i < ary1.length; i++) {
			// 최대값 구하기
			if (max < ary1[i]) {
				max = ary1[i];
			}
			// 최소값 구하기
			if (min > ary1[i]) {
				min = ary1[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

		System.out.println("==========");

		Scanner sc = new Scanner(System.in);
		int[] ary2 = null; // 배열은 만들되 사이즈는 정하지 않음
		System.out.println("배열의 사이즈를 입력하세요.");
		int num = sc.nextInt(); // 배열 사이즈 입력
		ary2 = new int[num]; // 배열 사이즈 입력한 값으로 배열 사이즈 설정

		for (int i = 0; i < ary2.length; i++) {
			ary2[i] = i + 1; // 1~배열의 크기만큼 데이터 입력
		}
		// 2의 배수 출력하기
		System.out.println("2의 배수 : ");
		for (int i = 0; i < ary2.length; i++) {
			if (ary2[i] % 2 == 0) {
				System.out.printf("%d ", ary2[i]);
			}
		}
		System.out.println("\n홀수 : ");
		for (int i = 0; i < ary2.length; i++) {
			if (ary2[i] % 2 == 1) {
				System.out.printf("%d ", ary2[i]);
			}
		}
		System.out.println();
		// 현재 ary2, ary3 배열을 총 2개 만듦
		int[] ary3 = new int[num];
		for (int i = 0; i < ary3.length; i++) {
			ary3[i] = i;
		}
		// 중첩 반복문, 조건문을 이용한 데이터 출력
		for (int i = 0; i < ary2.length; i++) {
			for (int j = 0; j < ary3.length; j++) {
				// 조건 : ary2 data && ary3 data < 10 이 나오는 경우
				if (ary2[i] + ary3[j] < 10) {
					System.out.println("ary2의 배열의값 :" + ary2[i] + ", ary3의 배열의값 : " + ary3[j]);
				}

			}


		}
	}
}
