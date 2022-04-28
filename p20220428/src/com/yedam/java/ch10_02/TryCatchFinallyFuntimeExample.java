package com.yedam.java.ch10_02;

public class TryCatchFinallyFuntimeExample {

	public static void main(String[] args) {
		
		// 다중 catch문을 쓰지 않을 경우 : 예외처리 2번 설정해야함
		String data1 = null;
		String data2 = null;
		
		try {
		data1 = args[0];
		data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} finally {
			System.out.println("항상 실행!");
		}
		
		try {
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		int result = value1 +value2;
		
		System.out.println(value1 + "+" + value2 + "=" +result);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}		
		
		// 출력 값 : 실행 매개값의 수가 부족합니다. \n 항상 실행! \n 숫자로 변환할 수 없습니다.

	}

}
