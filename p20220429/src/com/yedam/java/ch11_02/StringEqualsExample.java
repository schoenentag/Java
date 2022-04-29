package com.yedam.java.ch11_02;

public class StringEqualsExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길동";
		// new 연산자없이 따옴표로 값을 출력받으면... 새로운 객체가 생겼을 시 문자열 비교후 같다면 문자를 찾아 주소로 연결 시켜 공유하고 있음
		String str3 = new String("홍길동");
		
		if (str1 == str2) {
			System.out.println("str1과 str2는 같은 객체를 참조합니다."); //출력
		}else {
			System.out.println("str1과 st2는 다른 객체를 참조합니다.");
		}
		
		if(str1 == str3){
			System.out.println("str1과 str2는 같은 객체를 참조합니다."); 
		}else {
			System.out.println("str1과 st2는 다른 객체를 참조합니다."); //출력
		}
		
		//
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 같은 문자열을 가집니다."); //출력
		}else {
			System.out.println("str1과 str2는 다른 문자열을 가집니다.");
		}
		if(str1.equals(str3)) {
			System.out.println("str1과 str3는 같은 문자열을 가집니다."); //출력
		}else {
			System.out.println("str1과 str3는 다른 문자열을 가집니다.");
		}

	}

}
