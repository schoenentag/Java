package com.yedam.java.ch15_02;

public class Util {
	public static <T> Box<T> boxing(T t) { // <T> : return되는 값 앞에 타입파라미터 선언 
		
		Box<T> box = new Box<T>();
		box.setT(t);
		return box;
		
	}

}
