package com.yedam.java.ch10_01;

// 실행 예외 : 코드상에는 오류가 없지만 실행했을시 오류가 나는 예외처리
// cast : 변환
// 클래스 타입이 변경될때 발생하는 오류

public class ClassCastException {

	public static void main(String[] args) {

		changeDog(new Dog());
		changeDog(new Cat());
	}

	public static void changeDog(Animal animal) {
		
		// Dog dog = (Dog) animal; // ERROR!
		// instanceof를 통한 예외처리
		if (animal instanceof Dog) { // 강제타입변환하려는 앞줄에... 인스턴스 instanceof 변환하려고 하는 타입 
			Dog dog = (Dog) animal;
		}
	}
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

// 실행시 오류 : Exception in thread "main" java.lang.ClassCastException: class com.yedam.java.ch10_01.Cat cannot be cast to class com.yedam.java.ch10_01.Dog (com.yedam.java.ch10_01.Cat and com.yedam.java.ch10_01.Dog are in module p20220428 of loader 'app')
//at p20220428/com.yedam.java.ch10_01.ClassCastException.changeDog(ClassCastException.java:15)
//at p20220428/com.yedam.java.ch10_01.ClassCastException.main(ClassCastException.java:11)
//Cat cannot be cast to class~~~ Dog : Dog 로 클래스타입으로 변경할 수 없다.
