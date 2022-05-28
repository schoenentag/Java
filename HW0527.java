package first;

import java.util.Arrays;
import java.util.Scanner;

public class HW0527 {
	public static void main(String[] args) {
		// 주어진 배열을 이용하여 다음 내용을 구현하세요.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };

		// 문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 60) {
				System.out.println("60의 값이 있는 인덱스는 arr1[" + i + "]입니다.");
			}
		}

		// 문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		/*
		 * 결과 10 20 30 3 -3 실패.. for (int i = 0; i < arr1.length; i++) { if (i >= 3) {
		 * arr1[i] = arr1[i++]; } System.out.print(arr1[i] + " "); }
		 */
		for (int i = 0; i < arr1.length; i++) {
			if (i != 3) {
				System.out.print(arr1[i] + " ");
			}
			if (i == 3) {
				// System.out.print("");
			}
		}
		System.out.println();

		// 문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
		// 입력) 인덱스: 3 -> {10, 20, 30, 1000, 3, 60, -3}
		Scanner sc = new Scanner(System.in);
		System.out.println("변경하고 싶은 값의 인덱스 번호를 입력하세요. >>>");
		int chg = Integer.parseInt(sc.nextLine());
		arr1[chg] = 1000;
		System.out.println(Arrays.toString(arr1));

		// 문제4. 주어진 배열의 요소에서 최대값과 최소값을 구해보자.
		int max = 0;
		int min = arr1[0];

		for (int i = 0; i < arr1.length; i++) {
			if (max < arr1[i]) {
				max = arr1[i];
			}
			if (min > arr1[i]) {
				min = arr1[i];
			}
		}
		System.out.println("arr1의 최대값 : " + max);
		System.out.println("arr1의 최소값 : " + min);

		// 문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		int[] arr2 = new int[10];
		for (int i = 0; i < 10; i++) {
			try {
				System.out.printf("배열 %d번째 들어갈 양수값을 입력하세요. >>>", i);
				int arrNum = Integer.parseInt(sc.nextLine());
				if (arrNum > 0) {
					arr2[i] = arrNum;
				} else {
					System.out.println("양수의 값만 입력하세요.");
					--i;
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하세요.");
				--i;
			}
		}
		System.out.println("입력받은 arr2 배열 : "+Arrays.toString(arr2));
		System.out.println("배열의 값중 3의 배수 :" );
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] %3 == 0)
				System.out.print(arr2[i]+ " ");
		}
		

	}

}
