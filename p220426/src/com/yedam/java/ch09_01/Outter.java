package com.yedam.java.ch09_01;

public class Outter {
	String field = "Outter -field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(this.field); // 우선적으로 클래스 내부에 있는 field부터 찾는다.
			this.method();
			
			System.out.println(Outter.this.field); // 바깥클래스에 있는 field
			Outter.this.method();
			
		}
	}

}
