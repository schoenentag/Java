package com.yedam.java.ch11_02;

public class StringReplaceSxample {

	public static void main(String[] args) {
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바","JAVA"); // (바꾸고자 하는 문자열, 새롭게 수정된 문자열)
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
		// String은 객체에서 수정이 불가능 함. 수정을 해야할때는 새로운 객체를 생성해야함
		// 수정이 빈번하다면... Stringbulilder 사용

	}

}
