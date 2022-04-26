package com.yedam.java.ch09_02;

public class Anonymous {
	// Field 초기값으로 대입
	Person field = new Person() {

		void work() {
			System.out.println("출근합니다.");
		}

		@Override
		public void wake() {
			System.out.println("6시에 일어납니다.");
			work(); // 내부에서는 익명 객체의 메소드 이용이 가능하다. 외부에서 사용하기위해 오버라이딩해서 안에 넣음.
		}
	};

	// Constructor
	void method1() {
		Person localVar = new Person() { // 익명 객체 localVar는 Person과 상속관계
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			public void wake() {
				super.wake();
				walk();
			}
		};
		
		localVar.wake();
	}
	void method2(Person person) {
		person.wake();
	}

	// Method

}
