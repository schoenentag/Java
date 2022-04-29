package com.yedam.java.ch15_02;

public class BoxingMethodExample {

	public static void main(String[] args) {
		Box<Integer> box = Util.<Integer>boxing(100); // 메소드 앞에 타입파라미터 설정
		int intValue = box.getT();
		
		Box<String> strBox = Util.<String>boxing("홍길동");
		String strValue = strBox.getT();
		
	}

}
