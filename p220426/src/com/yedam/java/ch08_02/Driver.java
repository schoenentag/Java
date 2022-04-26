package com.yedam.java.ch08_02;

public class Driver {
	public void drive(Vehicle vehicle) {
		
		if (vehicle instanceof Bus) {
			Bus bus= (Bus) vehicle;
			bus.checkFare();
		} // 강제타입 변환하기전 instanceof로 타입 조사해야함!!
		
		vehicle.run(); //Bus로 타입변환을 했지만 vehicle이 사라지는건 아니므로 이 메소드도 출력이 됨.
		
	}

}
