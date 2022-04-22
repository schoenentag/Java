package co.edu.company;

// 자식 클래스
public class Bird extends Animal{
	@Override
	void walk() {
		System.out.println("헤엄칠 수있음");
	}
	
	void fly() {
		System.out.println("날 수 있음");
		
	}

}
