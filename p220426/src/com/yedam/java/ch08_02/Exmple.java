package com.yedam.java.ch08_02;

public class Exmple {

	public static void main(String[] args) {
		
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA(); // InterfaceA 인터페이스에 있는 methodA만 접근 가능
		
		InterfaceB ib = impl;
		ib.methodB(); // InterfaceB 인터페이스에 있는 methodB만 접근 가능
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		// InterfaceA와 InterfaceB를 상속받은 InterFaceC는 부모(?)인터페이스 메소드까지 다 사용가능하다.

	}

}
