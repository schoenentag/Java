package co.edu.oop;

public class Calculator {
	// Field
	// Constructor
	// return type Method name (매개변수)
	// void : return이 필요없는 타입
	void execute() {		
		powerOn(); // 메소드가 메소드 호출 가능
	}
	
	double avg(int x, int y) {
		int sum = plus(x,y);
		double result = (double) sum/2;
		return result;
	} 
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	int minus(int x, int y) {
		int result = x - y;
		return result;
	}

}
