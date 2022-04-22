package co.edu.extend;

public class SupersoincAirplaneExamle {

	public static void main(String[] args) {
		SuppersonicAirplane sa = new SuppersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SuppersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SuppersonicAirplane.NORMAL;
		sa.fly();
		sa.lan();
	}

}
