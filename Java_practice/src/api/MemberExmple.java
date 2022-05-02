package api;

public class MemberExmple {

	public static void main(String[] args) {
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		}else {
			System.out.println("obj1과 obj2는 동등하지 않습니다."); // 출력
		}
		
		String temp1 = "홍길동";
		String temp2 = "홍길동";
		
		if(temp1.equals(temp2)) {
			System.out.println("temp1과 temp2는 동등합니다."); // 출력
		}else {
			System.out.println("temp1과 temp2는 동등하지 않습니다.");
		}
		// 원래 object의 equals는 ==과 같은 의미 => 동등하게 바꾸고자 하면 재정의 하면 됨.
		// String에서 equals를 재정의하여 번지 비교가 아닌 문자열 비교로 변경하여 동등하다고 나옴.

	}

}
