package co.edu.getset;

public class Main {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		
		int speed = myCar.getSpeed();
		System.out.println(speed);
		//setSpeed에서 설정한 음수값이 입력될 경우 0으로 반환이 적용되어 0이 출력된다.
		
		//50 mile 속도를 넣음
		myCar.setSpeed(50);
		// 50 mile -> km 변환된 값으로 출력(getSpeed에서 설정됨)
		speed = myCar.getSpeed();
		System.out.println(speed);
		

	}

}
