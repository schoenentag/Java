package co.edu.static_member;

public class Singleton {
	
	//필드
	private static Singleton singleton = new Singleton(); // singleton의 생성자를 통해서 singleton 객체 생성
	
	// 생성자
	private Singleton() {
		
	}
	
	// 정적 메소드
	// Singleton이라는 타입유형의 getInstace 메소드를 생성하고 singleton이 return
	static Singleton getInstace() {
		if(singleton == null) {
			singleton = new Singleton();
		} // 예외처리, 객체 생성이 누락될 시 객체 생성
		return singleton;
	}

}
