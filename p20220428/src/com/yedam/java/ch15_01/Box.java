package com.yedam.java.ch15_01;

public class Box<T> { // 제네릭 타입 설정 // Box<T> == Box<String> // T=String, 내부의 T가 전부 String으로 지정이 됨 

	// private Object object;
	private T t;

	// public Object getObject() { return object; }
	public T get() { return t; }

	// public void setObject(Object object) { this.object = object; }
	public void set(T t) { this.t = t; }

}
