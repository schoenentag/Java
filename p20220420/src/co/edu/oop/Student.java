package co.edu.oop;

public class Student {
	// 클래스의 구성요소

	// 1. 필드 : 정보들을 받을 수 있는 변수
	String name;
	int age;
	int kor;
	int eng;
	int math;

	// 2. 생성자 ★★★ : 클래스명과 똑같이 선언, 객체 생성시 초기화 역할 담당
	public Student() {

	}

	// 3. 메소드(함수, 기능)
	void getInfo() {
		System.out.println("학생의 이름 : " + name + "\n학생의 나이 : " + age);
	}

}
