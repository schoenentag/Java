package co.edu.oop;

public class School {

	public static void main(String[] args) {
		//클래스 변수 = new 클래스()
		Student std = new Student(); //Student 타입의 std 객체(인스턴스)를 만듦. new Student()는 생성자
		std.name = "고길동";
		std.age = 20;
		std.getInfo();
		
	}

}
