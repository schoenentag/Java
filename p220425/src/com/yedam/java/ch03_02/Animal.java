package com.yedam.java.ch03_02;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); // 동물마다 우는 소리가 다르므로 추상적으로 abstract 메소드로 정의

}
