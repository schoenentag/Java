package com.yedam.java.ch10_01;

//실행 예외 : 코드상에는 오류가 없지만 실행했을시 오류가 나는 예외처리

public class NumberFormatException {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100"; //문자가 없는 숫자로 이루어져 있어야함 
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2); //숫자로 변환 될 수 없는 문자가 포함되어 있다면 에러 // 
		
		int result = value1 +value2;
		
		System.out.println(data1 + "+" + data2 + "=" + result);
		
		
		// 실행 시 오류 : Exception in thread "main" java.lang.NumberFormatException: For input string: "a100"
		//at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
		//at java.base/java.lang.Integer.parseInt(Integer.java:652)
		//at java.base/java.lang.Integer.parseInt(Integer.java:770)
		//at p20220428/com.yedam.java.ch10_01.NumberFormatException.main(NumberFormatException.java:12)
		// For input string: "a100" : a100은 숫자로 변경할 수 없음
		

	}

}
