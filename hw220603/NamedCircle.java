package hw220603;

class Circle { // 상속할 클래스
	
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public void show() {
		System.out.println("반지름 = " + this.radius);
	}
} // 부모클래스 끝

public class NamedCircle extends Circle { // Circle 상속 받음
	
	private String name; // 필드에 자식 인스턴스 변수 생성; 

	public NamedCircle(int radius, String name) { // 인자값 두개를 받는 생성자 만듦
		super(radius); //radius값은 부모에게서 물려받음
		this.name = name;	
	}
	
	@Override
	public void show() { // 오버라이딩
		System.out.print(name+", ");
		super.show();
	}


	public static void main(String[] args) {
		
		Circle w = new NamedCircle(5, "Waffle"); // 인스턴스 생성
		w.show(); // 출력
		
	}//main end
}
