package com.yedam.java.ch03;

public class Main {

	public static void main(String[] args) {
		// 문제3) 로또 번호를 구하는 프로그램을 작성하세요. 랜덤 숫자 6개 (1~45번까지)

		int[] lotto = new int[6]; // 6개의 공간을 가진 배열 생성

		System.out.print("로또 번호 : ");

		for (int i = 0; i < lotto.length; i++) {        // 배열[i]번째에 값을 입력하기 위한 반복문
			lotto[i] = (int) (Math.random() * 46) + 1;  // lotto[i]번째에 random값 입력
			for (int j = 0; j < i; j++) { 				// i번째와 j번째를 비교하기 위해 반복문 
				if (lotto[i] == lotto[j]) { 			// i번째 값과 j 번째값이 동일하면... 
					i--; 								//i-1번째로가서 다시 랜덤값 출력
				}

			}

		}
		for (int i = 0; i < lotto.length; i++)			// lotto[i]번째 출력값을 위한 반복문
		System.out.print(lotto[i] + " ");
	}
}
