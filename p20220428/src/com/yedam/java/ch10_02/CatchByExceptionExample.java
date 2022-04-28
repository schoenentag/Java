package com.yedam.java.ch10_02;

public class CatchByExceptionExample {

	public static void main(String[] args) {
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			
			System.out.println(value1 + "+" + value2 + "=" +result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("항상 실행!");
			
		}
		// 출력 예상 값 : 실행 매개값의 수가 부족합니다. \n 항상 실행!
		// 정상작동방법 예상... 10 6 (숫자값 넘기면 OK) > 정상 출력 값 : 10+6=16 \n 항상 실행!

	}

}
