package co.edu.oop;

public class Person {
	// Field
	String name;
	String rrn; // 주민등록번호
	int age;
	String address;
	
	// Constructor
	public Person() {
		
	}
	public Person(String name, String rrn, int age, String address) {
		this.name = name;
		this.rrn = rrn;
		this.age = age;
		this.address = address;
	}
	
	// Method
	void introduce() {
		System.out.printf("Person[name : %s, age : %d, address : %s]\n", name, age, address);
		//System.out.println("Person[name : " + name + ", age : " + age+ ", address : "+address+"]" );
	}
}


