package staticJava;

import java.text.SimpleDateFormat;
import java.util.Date;

//클래스 생성
class House {
	static String lastname = "Kim";
	// static(정적) : lastname 변수에 static 키워드를 붙이면 자바는 메모리 할당을 딱 한번만 하게 되어 메모리 사용에
	// 용이하다.
	// 또한 static으로 설정하면 같은 곳의 메모리 주소만을 바라보기 때문에 static 변수의 값을 공유한다.
}

class Counter {
	static int count = 0;

	Counter() {
		count++;
		System.out.println(count);
	}

	public static int getCount() {
		return count;
	}
}

class Util {
	public static String getScrrentDate(String fmt) {
		SimpleDateFormat sdf = new SimpleDateFormat(fmt);
		return sdf.format(new Date());
	}
}

class Singleton {
	private static Singleton one;

	private Singleton() {

	}

	public static Singleton getInstace() {
		if (one == null) {
			one = new Singleton();
		}
		return one;

	}
}

public class Sample {

	public static void main(String[] args) {

		House name1 = new House(); // static 변수로 인해 같은 주소값을 공유하는 객체들
		House name2 = new House();

		Counter c1 = new Counter(); // 출력값 : 1
		Counter c2 = new Counter(); // 출력값 : 2 // 같은 주소를 공유하므로 count값이 증가

		System.out.println(Counter.getCount()); // static method는 클래스를 이용하여 호출
		// Counter.getCount()와 같이 객체 없이 클래스를 통해 메서드를 직업 호출 할 수 있다.

		System.out.println(Util.getScrrentDate("yyyMMdd")); // 오늘 날짜 출력

		Singleton singleton1 = Singleton.getInstace();
		Singleton singleton2 = Singleton.getInstace();
		System.out.println(singleton1 == singleton2); // true 출력
		

	}

}
