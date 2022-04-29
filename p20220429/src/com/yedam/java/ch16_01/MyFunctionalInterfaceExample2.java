package com.yedam.java.ch16_01;

public class MyFunctionalInterfaceExample2 {

	public static void main(String[] args) {
		// 매개변수가 있고 리턴값이 없는 람다식
		
		MyFunctionalinterface2 fi;
		
		fi = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(5);
		
		fi = (x) -> { System.out.println(x * 5); }; // 한 줄로 줄일 수 있다.
		fi.method(4);
		
		fi = x -> System.out.println( x * 5);      // 매개변수가 1개이고 실행코드가 한줄이면 {} 없앨 수 있다.
		fi.method(3);
		
		//fi = x,y -> System.out.println( x * 5); // 매개변수가 2개이상이면 {}없이 한줄쓰기로 불가능

	}

}
