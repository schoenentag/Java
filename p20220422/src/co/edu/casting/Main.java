package co.edu.casting;

public class Main {
	public static void main(String[] args) {
		//인스턴스화
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 상속관계
		// D-> B-> A
		// E-> C-> A
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		//B b3 = e; // 상속관계에 있지 않기 때문에 컴파일러 에러 발생
		//C c2 = d; // 상속관계에 있지 않기 때문에 컴파일러 에러 발생
		
		Parent p1 = new Child(); // 자식클래스를 통해 인스턴스
		p1.method1();
		p1.method2(); // ★ 자식클래스(Child class)에서 override된 메소드로 출력됨
		p1.method3();
		// p1.method4(); // ★ 부모클래스(Parent class)에는 없고 자식클래스(Child class)에만 있는 메소드 
		// Parent타입의 변수를 만들었기때문에 Parent에는 method4가 없기 때문에 Error!
		// 자동변환타입에 의해 method2가 Child 클래스의 영향을 받아 자식클래스의 오버라이드된 내용을 읽음
		
		// 클래스타입 배열(다차원배열) ★★★
		Parent p2 = new Parent();
		Parent p3 = new Parent();
		Parent p4 = new Parent();
		
		Parent[] parent = {p2,p3,p4}; // Parent[]배열의 parent 0번째 주소값을 찾아가니 p2의 객체가 있음...
	}

}
