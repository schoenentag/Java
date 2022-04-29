package com.yedam.java.ch16_01;

@FunctionalInterface
public interface MyFunctionalInterface1 { // 람다식 선언을 위한 인터페이스

	public void method();
	//public void otherMethod(); // ERROR! 람다식 선언을 한 인터페이스는 단 하나의 메소드만 생성가능!
}
