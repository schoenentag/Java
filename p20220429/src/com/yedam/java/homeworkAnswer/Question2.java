package com.yedam.java.homeworkAnswer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		// 1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int) (Math.random() * 100) + 1;

		// 사용자입력을 저장할 공간
		int input = 0;

		// 시도횟수를 세기 위한 변수
		int count = 0;

		do {// 출력결과를 실행하는 코드부분
			
			// 시도 횟수 증가
			count++;
			// 사용자가 숫자를 입력
			// -> 숫자이외의 값을 입력할 경우 예외처리
			try {
				System.out.println("1-100사이의 값을 입력하세요.");
			    input = new Scanner(System.in).nextInt();
			}catch(InputMismatchException e) {
				System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
				continue;
			}
			
			// 컴퓨터가 가지고 있는 숫자 < 사용자가 입력한 숫자
			// -> "더 작은 수를 입력하세요."
		    if(answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			}
			// 컴퓨터가 가지고 있는 숫자 > 사용자가 입력한 숫자
			// -> "더 큰 수를 입력하세요."
			else if(answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			}
			// 컴퓨터가 가지고 있는 숫자 == 사용자가 입력한 숫자
			// -> "맞췄습니다."
			// -> 시도 횟수를 출력
			else {
				System.out.println("맞혔습니다.");
				System.out.println("시도 횟수는 " + count +"번 입니다.");
				break;
			}
			
		} while (true);
	}

}
