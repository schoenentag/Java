package com.yedam.java.ch10_02;

public class TryCatchFinallyExample {

	public static void main(String[] args) {

		// 일반 예외 : java에서 try~catch~ 지원
		try {
			Class claszz = Class.forName("java.lang.String2"); // 잘못된 코드(만약 2를 없애면 가능한 코드이므로 예외가 발생하지 않아 catch문이 실행안됨)

		} catch (ClassNotFoundException e) {
			// e.printStackTrace(); // 우리가 아는 빨간색 ERROR 내용이 뜸
			System.out.println(e.getMessage()); // 우리가 아는 빨간색 ERROR 내용 중 중요 메세지만 출력
			System.out.println("존재하지 않는 클래스입니다."); // 원하는 에러 메세지 입력하여 출력가능
		}

	}

}
