package co.edu.oop;

public class Korean {
	// Field
	String nation = "대한민국";
	String name;
	String ssn; // 주민등록번호

	// Constructor overloading
	public Korean(String n, String s) {
		// this : 클래스 내에 선언된 필드를 '콕'찝어서 사용하겠다.
		this.name = n;
		this.ssn = s;
	}
	public Korean(String n, String s, String p) {
		this.nation = n;
		this.name = s;
		this. ssn = p;
	}

	// Method
	void getInfo() {
		System.out.println("국적 : "+ nation);
		System.out.println("이름 :" + name);
		System.out.println("주민번호 : " + ssn);
	}

}
