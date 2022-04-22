package co.edu.extend;

public class SupersoincAirplaneExamle {

	public static void main(String[] args) {
		SuppersonicAirplane sa = new SuppersonicAirplane();
		// 부모 클래스의 takeOff 메소드 호출
		sa.takeOff();
		// 자식 클래스의 오버라이드한 fly 메소드
		sa.fly();
		
		sa.flyMode = SuppersonicAirplane.SUPERSONIC;
		// 자식 클래스의 오버라이드한 fly 메소드
		sa.fly();
		sa.flyMode = SuppersonicAirplane.NORMAL;
		// 자식 클래스의 오버라이드한 fly 메소드
		sa.fly();
		// 부모클래스의 land 메소드 호출
		sa.land();
	}

}
