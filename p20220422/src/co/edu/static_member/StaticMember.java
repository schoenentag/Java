package co.edu.static_member;

public class StaticMember {
	
	int a;
	
	static double PI = 3.14159;
	
	static int plus (int x, int y) {
		StaticMember sm = new StaticMember(); // int a를 사용하기 위해서는 인스턴스화 한다음에 호출해야함
		return x+y+sm.a;
	}
	static int minus(int x, int y) {
		return x-y;
	}
	

}
