package com.yedam.java.ch02_01;

public class Tire {
	// Field
	public int maxRotation; // 최대 회전수(타이어 수명)
	public int accmulateRotation; // 누적 회전수
	public String location;

	// Constructor
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// Method
	public boolean roll() {
		++accmulateRotation;
		if (accmulateRotation < maxRotation) {
			System.out.println(location + " Tire 수명 : " + (maxRotation - accmulateRotation) + " 회");
			return true;
		} else {
			System.out.println("*** " + location + "Tire 펑크 ***");
			return false;
		}
	}

}
