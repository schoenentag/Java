package hw220603;

interface AdderInterface { // 인터페이스 생성
	int add(int x, int y);
	int add(int n);
} // 끝

public class MyAdder implements AdderInterface { // 인터페이스 구현하는 클래스 
	public int n;
	public int sum = 0;

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int add(int n) {
		this.n = n;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		AdderInterface adder = new MyAdder();
		System.out.println(adder.add(5,10));
		System.out.println(adder.add(10));

	}// 메인 끝

}//끝
