package co.edu.static_member;

public class Main {

	public static void main(String[] args) {
		//StaticMember sm = new StaticMember(); static은 인스턴스 만들지 않아도 됨
		
		double pi = StaticMember.PI;
		System.out.println(pi);
		
		int sum = StaticMember.plus(5, 10);
		System.out.println(sum);
		
		int minus = StaticMember.minus(10, 5);
		System.out.println(minus);
		
		Pizza p1 = new Pizza("Super Suprme");
		Pizza p2 = new Pizza("Cheese");
		Pizza p3 = new Pizza("Pepperoni");
		
		int sales = Pizza.count;
		
		System.out.println("판매된 피자 갯수 : "+ sales);
		
		Singleton obj1 = Singleton.getInstace();
		Singleton obj2 = Singleton.getInstace();
		
		if (p1 == p2) {
			System.out.println("같은 피자입니다.");
		} else {
			System.out.println("주소번지가 다르므로 다른 피자입니다.");
		}
		
		if(obj1 == obj2) {
			System.out.println("하나의 싱글톤 객체입니다.");
		}
		System.out.println(obj1);
		System.out.println(obj2);
		// 원래는 객체를 만들면 다른 주소값을 가지는데 싱글톤에서는 다른 객체이지만 같은 주소를 가짐
		
		
		Person p4 = new Person("123456-789456","홍길동");
		System.out.println(p4.nation + ", "+p4.ssn +", "+p4.name);
		// p4.nation = "USA"; // nation은 파이널 변수이므로 변경안됨
		// p4.ssn = "123457-8910354"; // ssn 변수 역시 파이널 변수이므로 수정이 안된다.
		
		Person p5 = new Person("123456-289456","심청");
		System.out.println(p5.nation + ", "+p5.ssn +", "+p5.name);
		
		System.out.println("지구의 반지름 : "+Earth.EARTH_RADIUS);
		System.out.println("지구의 표면적 : "+Earth.EARTH_AREA);
		
		
	}

}
