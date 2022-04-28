package com.yedam.java.ch10_02;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("클래스가 존재하지 않습니다.");
		}
		

	}
	
	public static void findClass() throws ClassNotFoundException { //현재 처리해야하는 에러처리를 유보함.
		Class clazz = Class.forName("java.lang.String2");
		
	}

}
