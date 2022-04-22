package co.edu.oop;

public class Car {
	// Field
	String company;
	String model;
	String color;
	int maxSpeed;

	// Constructor overloading ★★
	public Car() {

	}
	public Car(String a) {
		this.model = a;
		
	}
	public Car(String a, String b) {
		this.model = a;
		this.color = b;
	}

	// Method
	void info() {
		System.out.println("회사 : " + company);
		System.out.println("차종 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("최대 속도 : " + maxSpeed);
	}

}
