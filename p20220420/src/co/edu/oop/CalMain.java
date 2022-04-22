package co.edu.oop;

public class CalMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.x = 5;
		cal.y = 2;
		
		cal.plus(10, 2);
		cal.minus(11, 3);
		cal.multi(23, 6);
		cal.div(45,9);
		
		Car car = new Car();
		
		car.model = "G바겐";
		car.color = "BLACK";
		car.price = 300000000;
		car.info();
				
		Car car2 = new Car();
		car2.model = "소나타";
		car2.color = "White";
		car2.price = 30000000;
		car2.info();
		
		Car car3 = new Car("그랜저", "GRAY", 200);
		car3.info();
	}

}
