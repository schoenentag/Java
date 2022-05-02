package com.yedam.java.ch11_02;

public class StringSubstringExample {

	public static void main(String[] args) {
		
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6); // 시작하는 값, 끝나는 값(0~6-1까지 인덱스 추출) 
		System.out.println(firstNum); // 출력값 880815
		
		String secontNum = ssn.substring(7); // 7번부터 마지막까지
		System.out.println(secontNum); // 출력값 1234567
		
		// indexOf로 인덱스 위치를 알아내서 잘라내기...
		// 하나의 메소드만 이용해서는 잘 사용하지 않음.

	}

}
