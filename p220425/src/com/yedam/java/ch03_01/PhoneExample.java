package com.yedam.java.ch03_01;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); // ERROR! Phone은 타입으로는 사용가능하나, 인스턴스를 만들수는 없다.
		//Phone phone = new Smartphon("홍길동"); //Phone 타입의 Smartphon 인스턴스, 이런식으로 가능
		Smartphon phone2 = new Smartphon("심청");
		
		phone2.turnOn();
		phone2.internetSearch();
		phone2.turnOff();
		
	}

}
