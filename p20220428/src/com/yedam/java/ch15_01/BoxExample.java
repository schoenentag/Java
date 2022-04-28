package com.yedam.java.ch15_01;

public class BoxExample {

	public static void main(String[] args) {
		/*
		 * Box box = new Box();
		 * 
		 * box.setObject("홍길동"); String name = (String) box.getObject(); // 타입불일치로 인해 ERROR 발생하므로 타입을 String으로 강제변환해주어야함. 
		 * System.out.println(name);
		 * 
		 * box.setObject(new Apple()); Apple apple = (Apple) box.getObject();
		 */
		
		Box<String> stringBox = new Box<String>();
		
		stringBox.set("홍길동");
		String name = stringBox.get();
		
		
		Box<Apple> appleBox = new Box<Apple>();
		
		appleBox.set(new Apple());
		Apple apple = appleBox.get();
		

	}

}
