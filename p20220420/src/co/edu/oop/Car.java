package co.edu.oop;

public class Car {
	// Field
	String color;
	String model;
	int tire;
	int price;

	// Constructor
	public Car() {

	}
	public Car(String a, String b, int c) {
		model = a;
		color = b;
		price = c;
	}

	// Method
	void info() {
		System.out.println("model = " + model);
		System.out.println("color = " + color);
		System.out.println("price = " + price);
	}

}
