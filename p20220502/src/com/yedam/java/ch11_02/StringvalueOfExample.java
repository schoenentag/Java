package com.yedam.java.ch11_02;

public class StringvalueOfExample {

	public static void main(String[] args) {
		
		int intValue = 10;
		double doubleValue = 10.5;
		boolean booleanValue = true;
		
		String intStr = String.valueOf(intValue);
		String doubleStr =String.valueOf(doubleValue);
		String booleanStr = String.valueOf(booleanValue);
		
		System.out.println(intStr); // 정석대로 기본타입을 값을 문자열로 변환
		System.out.println(doubleStr);
		System.out.println(booleanStr);
		
		System.out.println(""+intValue); // +연산자를 이용해서 문자열 만들기
		System.out.println(""+doubleStr);
		System.out.println(""+booleanStr);

	}

}
