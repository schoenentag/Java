package com.yedam.java.ch02_03;

public class ChildExmple {

	public static void main(String[] args) {
		
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		//parent.field2 = "data2"; // Child class에 있는 메소드는 호출 불가능
		//parent.method3();
		
		Child child = (Child) parent; // Child로 타입으로 강제 타입변환을 하면 child calss에 있는 메소드 호출가능 // 하지만 권장하지 않음
		child.field2 = "data2";
		child.method3();
		

	}

}
