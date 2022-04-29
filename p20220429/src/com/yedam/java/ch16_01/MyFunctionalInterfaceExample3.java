package com.yedam.java.ch16_01;

public class MyFunctionalInterfaceExample3 {

	public static void main(String[] args) {
		// 두개의 매개변수가 있고 리턴값이 있는 람다식
		MyFunctionalinterface3 fi;
		
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));

		fi = (x, y) -> { return x + y; };
		System.out.println(fi.method(4, 7));
		
		fi = (x,y) -> x + y;  // 이렇게도 가능...(return부분이 생략됐을뿐 존재함...)
		System.out.println(fi.method(10, 20)); // 출력값 : 30
		
		fi = (x, y) -> Math.subtractExact(x, y); // 메소드도 호출가능(빼는 메소드 호출-return값은 생략됨)
		System.out.println(fi.method(10, 20)); // 출력값 : -10
		
		// 람다식 함수는 익명으로 표현하지만 타겟타입에 이름이 정의되어 있기때문에 재사용이 가능하다!! ★★★

	}

}
