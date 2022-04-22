package co.edu.oop;

public class Main {

	public static void main(String[] args) {
//		Car myCar = new Car(); // 자동차 객체 생성
//		myCar.company = "기아";
//		myCar.model = "K3";
//		myCar.color = "White";
//		myCar.maxSpeed = 150;
//		myCar.info();
//		System.out.println();
//		
//		// 생성자를 통한 데이터 입력
//		Car myCar2 = new Car("sonata", "Black");
//		myCar2.info();
//		System.out.println();
//		
//		// 각 객체에 주소 번지 -> 100번지 -> 데이터 호출
//		Korean k1 = new Korean("박자바", "012345-1234578");
//		k1.getInfo();
//		Korean k2 = new Korean("김자바", "990123-2134578");
//		k2.getInfo();
//		
//		Korean k3 = new Korean("미국","이자바","001122-2121122");
//		k3.getInfo();
		
		Calculator cal = new Calculator();
		cal.execute();
		
		int result = cal.plus(3, 2);
		System.out.println("plus : " + result);
		
		result = cal.minus(10, 2);
		System.out.println("minus : " + result);
		
		double avg = cal.avg(10, 2);
		System.out.println("avg : " +avg);
		
		cal.powerOff();
		System.out.println();
		
		Calculator2 myCalcu = new Calculator2();
		double result1 = myCalcu.areaRectangle(10);
		double result2 = myCalcu.areaRectangle(10,20);
		System.out.println("정사각형의 넓이 : " + result1);
		System.out.println("직사각형의 넓이 : " + result2);
		
		show();
			
	}
	
	static void show() {
		System.out.println("main밖에서도 메소드를 만들어서 사용할 수 있다.");
	}

}
