package com.yedam.java.ch16_01;

public class MyFunctionalInterfaceExample1 {

	public static void main(String[] args) {
		// 매개변수도 리턴값도 존재하지 않는 람다식
		
		// 원래는 인터페이스를 구현하는 클래스가 있어야 사용가능하나 람다식은 구현클래스가 없어도 사용가능
		
		MyFunctionalInterface1 fi; // 변수 선언
		
		fi = () -> {  			 // 람다식 메소드 구현(가장 기본)
			String str = "method call1";
			System.out.println(str);
		};
		fi.method(); 			// 호출
		
		// 실행문구가 한줄이면 더 간단히 사용가능
		fi = () -> { System.out.println("method call2");};
		fi.method();
		
		fi = () -> System.out.println("method call3");   // 실행문구가 한줄이면 {} 생략가능하다.
		fi.method();

	}

}
