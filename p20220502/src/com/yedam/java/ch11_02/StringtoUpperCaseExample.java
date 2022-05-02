package com.yedam.java.ch11_02;

public class StringtoUpperCaseExample {

	public static void main(String[] args) {
		
		String str1 = "Java Programing";
		String str2 = "JAVA Programing";
		
		System.out.println(str1.equals(str2)); // false
		
		
		String lowerStr1 = str1.toLowerCase(); // str1 문자열을 모두 소문자로 바꿈
		String lowerStr2 = str2.toLowerCase();

		System.out.println(lowerStr1.equals(lowerStr2)); // true
		
		System.out.println(str1.equalsIgnoreCase(str2)); // true // java에서 논리적인 값만 비교(대소문자 구분 x)
	}

}
