package co.edu.oop;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동", "001122-1234567", 23, "대구광역시 달서구 본리동");
		Person p2 = new Person("심청", "001225-2134567", 23, "대구광역시 수성구 황금동");
		Person p3 = new Person("김영희", "9301001-1234567", 30, "대구광역시 남구 대명동");
		p1.introduce();
		p2.introduce();
		p3.introduce();
		

	}

}
