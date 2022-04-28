package com.yedam.java.ch10_01;

// 실행 예외 : 코드상에는 오류가 없지만 실행했을시 오류가 나는 예외처리

public class NullpointerExceptionExample {

	public static void main(String[] args) {
		String data = null;
		System.out.println(data.toString()); // 코드 상에는 오류가 없음
		
		// 실행시 오류 : Exception in thread "main" java.lang.NullPointerException
		// at p20220428/com.yedam.java.ch10_01.NullpointerExceptionExample.main(NullpointerExceptionExample.java:9)
		

	}

}
